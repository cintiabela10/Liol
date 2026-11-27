package br.com.liol.business;

import static org.junit.jupiter.api.Assertions.*;

import br.com.liol.entities.Aluno;
import br.com.liol.entities.enums.Objetivo;
import br.com.liol.entities.Treino;
import br.com.liol.exceptions.NegocioException;
import java.util.List;
import org.junit.jupiter.api.Test;

class TreinoBaseBusinessTest {

    private final TreinoBaseBusiness business = new TreinoBaseBusiness();

    private Aluno alunoComObjetivo(Objetivo objetivo) {
        Aluno a = new Aluno();
        a.setObjetivo(objetivo);
        return a;
    }

    @Test
    void hipertrofiaGeraTresTreinosABC() throws NegocioException {
        List<Treino> treinos = business.gerarTreinoBase(alunoComObjetivo(Objetivo.HIPERTROFIA));
        assertEquals(3, treinos.size());
        assertEquals("Treino A", treinos.get(0).getNomeLista());
        assertEquals("Treino B", treinos.get(1).getNomeLista());
        assertEquals("Treino C", treinos.get(2).getNomeLista());
    }

    @Test
    void todosOsObjetivosGeramTreinosComExercicios() throws NegocioException {
        for (Objetivo o : Objetivo.values()) {
            List<Treino> treinos = business.gerarTreinoBase(alunoComObjetivo(o));
            assertFalse(treinos.isEmpty(), "Sem treinos para " + o);
            for (Treino t : treinos) {
                assertFalse(t.getItens().isEmpty(), "Treino vazio para " + o);
                assertEquals(o.toString(), t.getObjetivo());
            }
        }
    }

    @Test
    void ordemDeExecucaoComecaEmUmESegueSequencia() throws NegocioException {
        Treino t = business.gerarTreinoBase(Objetivo.HIPERTROFIA).get(0);
        for (int i = 0; i < t.getItens().size(); i++) {
            assertEquals(i + 1, t.getItens().get(i).getOrdemExecucao());
        }
    }

    @Test
    void dataFimNaoEhAnteriorADataInicio() throws NegocioException {
        // Espelha o trigger tg_validar_datas_treino do banco.
        for (Treino t : business.gerarTreinoBase(Objetivo.EMAGRECIMENTO)) {
            assertFalse(t.getDataFim().isBefore(t.getDataInicio()));
        }
    }

    @Test
    void editarTreinoDeUmAlunoNaoAlteraOutroAluno() throws NegocioException {
        List<Treino> doJoao = business.gerarTreinoBase(alunoComObjetivo(Objetivo.HIPERTROFIA));
        List<Treino> daMaria = business.gerarTreinoBase(alunoComObjetivo(Objetivo.HIPERTROFIA));

        int seriesOriginais = daMaria.get(0).getItens().get(0).getSeries();
        String nomeOriginal = daMaria.get(0).getItens().get(0).getExercicio().getNomeExercicio();

        // "Instrutor" edita o treino do João
        doJoao.get(0).getItens().get(0).setSeries(99);
        doJoao.get(0).getItens().get(0).getExercicio().setNomeExercicio("Outro exercício");

        assertEquals(seriesOriginais, daMaria.get(0).getItens().get(0).getSeries());
        assertEquals(nomeOriginal, daMaria.get(0).getItens().get(0).getExercicio().getNomeExercicio());
        assertNotSame(doJoao.get(0), daMaria.get(0));
    }

    @Test
    void alunoNuloLancaNegocioException() {
        assertThrows(NegocioException.class, () -> business.gerarTreinoBase((Aluno) null));
    }

    @Test
    void alunoSemObjetivoLancaNegocioException() {
        assertThrows(NegocioException.class, () -> business.gerarTreinoBase(alunoComObjetivo(null)));
    }

}
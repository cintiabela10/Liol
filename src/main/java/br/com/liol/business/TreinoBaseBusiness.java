package br.com.liol.business;

import br.com.liol.entities.Aluno;
import br.com.liol.entities.Exercicio;
import br.com.liol.entities.ItemTreino;
import br.com.liol.entities.Treino;
import br.com.liol.entities.enums.Objetivo;
import br.com.liol.exceptions.NegocioException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;


public class TreinoBaseBusiness {

   
    static final int DURACAO_TREINO_BASE_DIAS = 90;

  

    private record ModeloExercicio(String nome, String areaMuscular, int series, int repeticoes) {}

    private record ModeloTreino(String nomeLista, List<ModeloExercicio> exercicios) {}

    private static final Map<Objetivo, List<ModeloTreino>> MODELOS = new EnumMap<>(Objetivo.class);

   
    static {
        MODELOS.put(Objetivo.EMAGRECIMENTO, List.of(
            new ModeloTreino("Treino A", List.of(
                new ModeloExercicio("Agachamento livre", "Pernas", 3, 15),
                new ModeloExercicio("Supino com halteres", "Peito", 3, 15),
                new ModeloExercicio("Remada baixa", "Costas", 3, 15),
                new ModeloExercicio("Abdominal", "Abdômen", 3, 20))),
            new ModeloTreino("Treino B", List.of(
                new ModeloExercicio("Leg press", "Pernas", 3, 15),
                new ModeloExercicio("Puxada frontal", "Costas", 3, 15),
                new ModeloExercicio("Desenvolvimento com halteres", "Ombros", 3, 15),
                new ModeloExercicio("Afundo", "Pernas", 3, 12)))
        ));

        MODELOS.put(Objetivo.HIPERTROFIA, List.of(
            new ModeloTreino("Treino A", List.of(
                new ModeloExercicio("Supino reto", "Peito", 4, 10),
                new ModeloExercicio("Supino inclinado", "Peito", 4, 10),
                new ModeloExercicio("Tríceps corda", "Tríceps", 3, 12),
                new ModeloExercicio("Tríceps testa", "Tríceps", 3, 12))),
            new ModeloTreino("Treino B", List.of(
                new ModeloExercicio("Puxada frontal", "Costas", 4, 10),
                new ModeloExercicio("Remada curvada", "Costas", 4, 10),
                new ModeloExercicio("Rosca direta", "Bíceps", 3, 12),
                new ModeloExercicio("Rosca martelo", "Bíceps", 3, 12))),
            new ModeloTreino("Treino C", List.of(
                new ModeloExercicio("Agachamento livre", "Pernas", 4, 10),
                new ModeloExercicio("Leg press", "Pernas", 4, 12),
                new ModeloExercicio("Desenvolvimento militar", "Ombros", 4, 10),
                new ModeloExercicio("Elevação lateral", "Ombros", 3, 12)))
        ));

        MODELOS.put(Objetivo.CONDICIONAMENTO, List.of(
            new ModeloTreino("Treino A", List.of(
                new ModeloExercicio("Agachamento livre", "Pernas", 3, 12),
                new ModeloExercicio("Flexão de braço", "Peito", 3, 12),
                new ModeloExercicio("Remada baixa", "Costas", 3, 12),
                new ModeloExercicio("Abdominal", "Abdômen", 3, 15))),
            new ModeloTreino("Treino B", List.of(
                new ModeloExercicio("Leg press", "Pernas", 3, 12),
                new ModeloExercicio("Puxada frontal", "Costas", 3, 12),
                new ModeloExercicio("Desenvolvimento com halteres", "Ombros", 3, 12),
                new ModeloExercicio("Afundo", "Pernas", 3, 12)))
        ));
    }

   
    public List<Treino> gerarTreinoBase(Aluno aluno) throws NegocioException {
        if (aluno == null) {
            throw new NegocioException("Não é possível gerar treino base para um aluno nulo.");
        }
        return gerarTreinoBase(aluno.getObjetivo());
    }

   
    public List<Treino> gerarTreinoBase(Objetivo objetivo) throws NegocioException {
        if (objetivo == null) {
            throw new NegocioException("Objetivo não informado.");
        }
        LocalDate inicio = LocalDate.now();
        LocalDate fim = inicio.plusDays(DURACAO_TREINO_BASE_DIAS);

        List<Treino> treinos = new ArrayList<>();
        for (ModeloTreino modelo : MODELOS.get(objetivo)) {
            treinos.add(construirTreino(objetivo, modelo, inicio, fim));
        }
        return treinos;
    }

    

    private Treino construirTreino(Objetivo objetivo, ModeloTreino modelo,
                                   LocalDate inicio, LocalDate fim) {
        Treino treino = new Treino();
        treino.setNomeTreino("Treino Base - " + objetivo.toString());
        treino.setNomeLista(modelo.nomeLista());
        treino.setObjetivo(objetivo.toString());
        treino.setDataInicio(inicio);
        treino.setDataFim(fim);

        List<ItemTreino> itens = new ArrayList<>();
        int ordem = 1;
        for (ModeloExercicio m : modelo.exercicios()) {
           
            Exercicio exercicio = new Exercicio();
            exercicio.setNomeExercicio(m.nome());
            exercicio.setAreaMuscular(m.areaMuscular());
            itens.add(new ItemTreino(exercicio, m.series(), m.repeticoes(), ordem++));
        }
        treino.setItens(itens);
        return treino;
    }
}

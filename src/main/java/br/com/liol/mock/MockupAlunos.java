package br.com.liol.mock;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.liol.entities.Aluno;
import br.com.liol.entities.enums.Objetivo;
import br.com.liol.entities.enums.StatusMatricula;
import br.com.liol.entities.enums.TipoPlano;

public class MockupAlunos {

    public static List<Aluno> listar() {

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(criarAluno("Pikachu", "111.111.111-11",
                LocalDate.of(2000, 1, 1),
                "(81) 91111-1111",
                "pikachu@liol.com",
                70.0, 1.70,
                StatusMatricula.ATIVA,
                Objetivo.HIPERTROFIA,
                TipoPlano.ANUAL));

        alunos.add(criarAluno("Raichu", "222.222.222-22",
                LocalDate.of(1999, 2, 2),
                "(81) 92222-2222",
                "raichu@liol.com",
                75.0, 1.78,
                StatusMatricula.ATIVA,
                Objetivo.EMAGRECIMENTO,
                TipoPlano.MENSAL));

        alunos.add(criarAluno("Eevee", "333.333.333-33",
                LocalDate.of(1998, 3, 3),
                "(81) 93333-3333",
                "eevee@liol.com",
                58.0, 1.62,
                StatusMatricula.ATIVA,
                Objetivo.CONDICIONAMENTO,
                TipoPlano.TRIMESTRAL));

        alunos.add(criarAluno("Vaporeon", "444.444.444-44",
                LocalDate.of(1997, 4, 4),
                "(81) 94444-4444",
                "vaporeon@liol.com",
                79.0, 1.81,
                StatusMatricula.ATIVA,
                Objetivo.HIPERTROFIA,
                TipoPlano.ANUAL));

        alunos.add(criarAluno("Umbreon", "555.555.555-55",
                LocalDate.of(1996, 5, 5),
                "(81) 95555-5555",
                "umbreon@liol.com",
                67.0, 1.69,
                StatusMatricula.EXPIRADA,
                Objetivo.EMAGRECIMENTO,
                TipoPlano.SEMESTRAL));

        alunos.add(criarAluno("Jolteon", "666.666.666-66",
                LocalDate.of(1995, 6, 6),
                "(81) 96666-6666",
                "jolteon@liol.com",
                72.0, 1.75,
                StatusMatricula.ATIVA,
                Objetivo.CONDICIONAMENTO,
                TipoPlano.MENSAL));

        alunos.add(criarAluno("Leafeon", "777.777.777-77",
                LocalDate.of(1994, 7, 7),
                "(81) 97777-7777",
                "leafeon@liol.com",
                61.0, 1.68,
                StatusMatricula.ATIVA,
                Objetivo.EMAGRECIMENTO,
                TipoPlano.TRIMESTRAL));

        alunos.add(criarAluno("Flareon", "888.888.888-88",
                LocalDate.of(1993, 8, 8),
                "(81) 98888-8888",
                "flareon@liol.com",
                85.0, 1.83,
                StatusMatricula.CANCELADA,
                Objetivo.HIPERTROFIA,
                TipoPlano.ANUAL));

        alunos.add(criarAluno("Glaceon", "999.999.999-99",
                LocalDate.of(1992, 9, 9),
                "(81) 99999-9999",
                "glaceon@liol.com",
                64.0, 1.66,
                StatusMatricula.ATIVA,
                Objetivo.CONDICIONAMENTO,
                TipoPlano.SEMESTRAL));

        alunos.add(criarAluno("Espeon", "101.101.101-10",
                LocalDate.of(1991, 10, 10),
                "(81) 90000-0001",
                "espeon@liol.com",
                60.0, 1.65,
                StatusMatricula.ATIVA,
                Objetivo.EMAGRECIMENTO,
                TipoPlano.MENSAL));

        alunos.add(criarAluno("Sylveon", "202.202.202-20",
                LocalDate.of(1990, 11, 11),
                "(81) 90000-0002",
                "sylveon@liol.com",
                57.0, 1.63,
                StatusMatricula.ATIVA,
                Objetivo.CONDICIONAMENTO,
                TipoPlano.ANUAL));

        alunos.add(criarAluno("Charmander", "303.303.303-30",
                LocalDate.of(1989, 12, 12),
                "(81) 90000-0003",
                "charmander@liol.com",
                68.0, 1.72,
                StatusMatricula.EXPIRADA,
                Objetivo.HIPERTROFIA,
                TipoPlano.TRIMESTRAL));

        alunos.add(criarAluno("Charmeleon", "404.404.404-40",
                LocalDate.of(1988, 1, 13),
                "(81) 90000-0004",
                "charmeleon@liol.com",
                76.0, 1.80,
                StatusMatricula.ATIVA,
                Objetivo.HIPERTROFIA,
                TipoPlano.SEMESTRAL));

        alunos.add(criarAluno("Charizard", "505.505.505-50",
                LocalDate.of(1987, 2, 14),
                "(81) 90000-0005",
                "charizard@liol.com",
                90.0, 1.88,
                StatusMatricula.ATIVA,
                Objetivo.HIPERTROFIA,
                TipoPlano.ANUAL));

        alunos.add(criarAluno("Bulbasaur", "606.606.606-60",
                LocalDate.of(1986, 3, 15),
                "(81) 90000-0006",
                "bulbasaur@liol.com",
                73.0, 1.76,
                StatusMatricula.ATIVA,
                Objetivo.EMAGRECIMENTO,
                TipoPlano.MENSAL));

        alunos.add(criarAluno("Ivysaur", "707.707.707-70",
                LocalDate.of(1985, 4, 16),
                "(81) 90000-0007",
                "ivysaur@liol.com",
                78.0, 1.82,
                StatusMatricula.CANCELADA,
                Objetivo.CONDICIONAMENTO,
                TipoPlano.SEMESTRAL));

        alunos.add(criarAluno("Venusaur", "808.808.808-80",
                LocalDate.of(1984, 5, 17),
                "(81) 90000-0008",
                "venusaur@liol.com",
                95.0, 1.90,
                StatusMatricula.ATIVA,
                Objetivo.HIPERTROFIA,
                TipoPlano.ANUAL));

        alunos.add(criarAluno("Squirtle", "909.909.909-90",
                LocalDate.of(1983, 6, 18),
                "(81) 90000-0009",
                "squirtle@liol.com",
                65.0, 1.67,
                StatusMatricula.ATIVA,
                Objetivo.CONDICIONAMENTO,
                TipoPlano.TRIMESTRAL));

        alunos.add(criarAluno("Wartortle", "123.123.123-12",
                LocalDate.of(1982, 7, 19),
                "(81) 90000-0010",
                "wartortle@liol.com",
                77.0, 1.79,
                StatusMatricula.ATIVA,
                Objetivo.HIPERTROFIA,
                TipoPlano.ANUAL));

        return alunos;
    }

    private static Aluno criarAluno(
            String nome,
            String cpf,
            LocalDate dataNascimento,
            String telefone,
            String email,
            double peso,
            double altura,
            StatusMatricula matricula,
            Objetivo objetivo,
            TipoPlano plano) {

        Aluno aluno = new Aluno();

        aluno.setNomeCompleto(nome);
        aluno.setCpf(cpf);
        aluno.setDataNasc(dataNascimento);
        aluno.setTelefone(telefone);
        aluno.setEmail(email);

        aluno.setPeso(peso);
        aluno.setAltura(altura);

        aluno.setMatricula(matricula);
        aluno.setObjetivo(objetivo);
        aluno.setTipoPlano(plano);

        return aluno;
    }
}
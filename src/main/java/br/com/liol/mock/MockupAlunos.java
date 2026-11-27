package br.com.liol.mock;

import java.util.ArrayList;
import java.util.List;

import br.com.liol.entities.Aluno;
import br.com.liol.entities.enums.Objetivo;
import br.com.liol.entities.enums.StatusMatricula;
import br.com.liol.entities.enums.TipoPlano;

public class MockupAlunos {

    public static List<Aluno> listar() {

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Pikachu", "111.111.111-11", "01/01/00",
                "(81) 91111-1111", 70.0, 1.70,
                "pikachu@liol.com", StatusMatricula.ATIVA,
                Objetivo.HIPERTROFIA, TipoPlano.ANUAL));

        alunos.add(new Aluno("Raichu", "222.222.222-22", "02/02/99",
                "(81) 92222-2222", 75.0, 1.78,
                "raichu@liol.com", StatusMatricula.ATIVA,
                Objetivo.EMAGRECIMENTO, TipoPlano.MENSAL));

        alunos.add(new Aluno("Eevee", "333.333.333-33", "03/03/98",
                "(81) 93333-3333", 58.0, 1.62,
                "eevee@liol.com", StatusMatricula.ATIVA,
                Objetivo.CONDICIONAMENTO, TipoPlano.TRIMESTRAL));

        alunos.add(new Aluno("Vaporeon", "444.444.444-44", "04/04/97",
                "(81) 94444-4444", 79.0, 1.81,
                "vaporeon@liol.com", StatusMatricula.ATIVA,
                Objetivo.HIPERTROFIA, TipoPlano.ANUAL));

        alunos.add(new Aluno("Umbreon", "555.555.555-55", "05/05/96",
                "(81) 95555-5555", 67.0, 1.69,
                "umbreon@liol.com", StatusMatricula.EXPIRADA,
                Objetivo.EMAGRECIMENTO, TipoPlano.SEMESTRAL));

        alunos.add(new Aluno("Jolteon", "666.666.666-66", "06/06/95",
                "(81) 96666-6666", 72.0, 1.75,
                "jolteon@liol.com", StatusMatricula.ATIVA,
                Objetivo.CONDICIONAMENTO, TipoPlano.MENSAL));

        alunos.add(new Aluno("Leafeon", "777.777.777-77", "07/07/94",
                "(81) 97777-7777", 61.0, 1.68,
                "leafeon@liol.com", StatusMatricula.ATIVA,
                Objetivo.EMAGRECIMENTO, TipoPlano.TRIMESTRAL));

        alunos.add(new Aluno("Flareon", "888.888.888-88", "08/08/93",
                "(81) 98888-8888", 85.0, 1.83,
                "flareon@liol.com", StatusMatricula.CANCELADA,
                Objetivo.HIPERTROFIA, TipoPlano.ANUAL));

        alunos.add(new Aluno("Glaceon", "999.999.999-99", "09/09/92",
                "(81) 99999-9999", 64.0, 1.66,
                "glaceon@liol.com", StatusMatricula.ATIVA,
                Objetivo.CONDICIONAMENTO, TipoPlano.SEMESTRAL));

        alunos.add(new Aluno("Espeon", "101.101.101-10", "10/10/91",
                "(81) 90000-0001", 60.0, 1.65,
                "espeon@liol.com", StatusMatricula.ATIVA,
                Objetivo.EMAGRECIMENTO, TipoPlano.MENSAL));

        alunos.add(new Aluno("Sylveon", "202.202.202-20", "11/11/90",
                "(81) 90000-0002", 57.0, 1.63,
                "sylveon@liol.com", StatusMatricula.ATIVA,
                Objetivo.CONDICIONAMENTO, TipoPlano.ANUAL));

        alunos.add(new Aluno("Charmander", "303.303.303-30", "12/12/89",
                "(81) 90000-0003", 68.0, 1.72,
                "charmander@liol.com", StatusMatricula.EXPIRADA,
                Objetivo.HIPERTROFIA, TipoPlano.TRIMESTRAL));

        alunos.add(new Aluno("Charmeleon", "404.404.404-40", "13/01/88",
                "(81) 90000-0004", 76.0, 1.80,
                "charmeleon@liol.com", StatusMatricula.ATIVA,
                Objetivo.HIPERTROFIA, TipoPlano.SEMESTRAL));

        alunos.add(new Aluno("Charizard", "505.505.505-50", "14/02/87",
                "(81) 90000-0005", 90.0, 1.88,
                "charizard@liol.com", StatusMatricula.ATIVA,
                Objetivo.HIPERTROFIA, TipoPlano.ANUAL));

        alunos.add(new Aluno("Bulbasaur", "606.606.606-60", "15/03/86",
                "(81) 90000-0006", 73.0, 1.76,
                "bulbasaur@liol.com", StatusMatricula.ATIVA,
                Objetivo.EMAGRECIMENTO, TipoPlano.MENSAL));

        alunos.add(new Aluno("Ivysaur", "707.707.707-70", "16/04/85",
                "(81) 90000-0007", 78.0, 1.82,
                "ivysaur@liol.com", StatusMatricula.CANCELADA,
                Objetivo.CONDICIONAMENTO, TipoPlano.SEMESTRAL));

        alunos.add(new Aluno("Venusaur", "808.808.808-80", "17/05/84",
                "(81) 90000-0008", 95.0, 1.90,
                "venusaur@liol.com", StatusMatricula.ATIVA,
                Objetivo.HIPERTROFIA, TipoPlano.ANUAL));

        alunos.add(new Aluno("Squirtle", "909.909.909-90", "18/06/83",
                "(81) 90000-0009", 65.0, 1.67,
                "squirtle@liol.com", StatusMatricula.ATIVA,
                Objetivo.CONDICIONAMENTO, TipoPlano.TRIMESTRAL));

        return alunos;
    }
}
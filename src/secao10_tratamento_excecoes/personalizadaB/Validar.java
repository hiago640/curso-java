package secao10_tratamento_excecoes.personalizadaB;

import secao09_streams.Aluno;

public class Validar {

    public Validar() {

    }

    public static void aluno(Aluno aluno) throws StringVaziaException, NumeroForaIntervaloException {

        if (aluno == null) {
            throw new IllegalArgumentException("O Aluno está nulo!");
        }

        if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaException("nome");
        }

        if (aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroForaIntervaloException("nota");
        }

    }

}

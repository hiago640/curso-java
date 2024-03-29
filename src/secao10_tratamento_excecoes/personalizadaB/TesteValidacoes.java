package secao10_tratamento_excecoes.personalizadaB;

import secao09_streams.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("", -7);

        try {
            Validar.aluno(aluno);
        } catch (StringVaziaException | NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }

}

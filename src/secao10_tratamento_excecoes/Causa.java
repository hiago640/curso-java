package secao10_tratamento_excecoes;

import secao9_streams.Aluno;

public class Causa {

    public static void main(String[] args) {

        try {
            metodoA(null);
        } catch (IllegalArgumentException e) {
            if (e.getCause() != null) {
                System.out.println(e.getCause().getCause());
            }
        }
    }

    public static void metodoA(Aluno a) {
        try {
            metodoB(a);
        } catch (Exception causa) {
            throw new IllegalArgumentException(causa);
        }
    }

    public static void metodoB(Aluno a) {
        if (a == null) {
            throw new NullPointerException("Aluno está Nulo");
        }

        System.out.println(a.nome);

    }
}

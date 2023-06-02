package secao10_tratamento_excecoes;

import secao09_streams.Aluno;

public class Basico {

    public static void main(String[] args) {

        Aluno a = null;

        try {
            imprimirAluno(a);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do Usuário.");
        }

        try {
            System.out.println(7 / 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Fim do programa");

    }

    public static void imprimirAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }

}

package secao7_orientacao_objetos.curso.composicao.muitos_pra_muitos;

public class AlunoTeste {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Hiago");
        Aluno a2 = new Aluno("Marcela");
        Aluno a3 = new Aluno("Leandro");

        Disciplina d1 = new Disciplina("Java");
        Disciplina d2 = new Disciplina("Web 2023");
        Disciplina d3 = new Disciplina("React Native");

        d1.adicionarAluno(a3);
        d1.adicionarAluno(a1);

        d2.adicionarAluno(a2);
        d2.adicionarAluno(a1);

        d3.adicionarAluno(a3);
        d3.adicionarAluno(a2);

        for (Aluno aluno : d1.alunos) {
            System.out.println("Meu nome é: " + aluno.nome + " e estou matriculado no curso: " + d1.nome);
        }
    }

}

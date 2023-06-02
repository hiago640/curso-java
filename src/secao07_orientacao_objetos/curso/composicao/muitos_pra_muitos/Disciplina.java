package secao07_orientacao_objetos.curso.composicao.muitos_pra_muitos;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    String nome;
    List<Aluno> alunos = new ArrayList<>();

    Disciplina(String nome) {
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.disciplinas.add(this);
    }
}

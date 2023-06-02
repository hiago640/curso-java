package secao07_orientacao_objetos.curso.composicao.muitos_pra_muitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    String nome;
    List<Disciplina> disciplinas = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }
}

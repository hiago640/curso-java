package secao09_streams;

import java.util.Objects;

public class Aluno {

    public String nome;
    public double nota;
    public boolean bomComportamento;

    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }

    public Aluno(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Aluno)) {
            return false;
        }
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && nota == aluno.nota && bomComportamento == aluno.bomComportamento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota, bomComportamento);
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + nome + "'" +
                ", nota='" + nota + "'" +
                ", bomComportamento='" + bomComportamento + "'" +
                "}";
    }

}
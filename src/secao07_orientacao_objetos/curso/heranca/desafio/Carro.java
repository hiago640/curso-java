package secao07_orientacao_objetos.curso.heranca.desafio;

public class Carro {

    int velocidadeAtual = 0;

    void acelerar() {
        velocidadeAtual += 5;
    }

    void frear() {

        if (velocidadeAtual >= 5)
            velocidadeAtual -= 5;
        else
            velocidadeAtual = 0;
    }
}

package secao7_orientacao_objetos.curso.heranca.desafio;

public class CarroTeste {

    public static void main(String[] args) {

        Carro carroFraquin = new Civic();
        System.out.println("Velocidade Atual Civic: " + carroFraquin.velocidadeAtual);

        carroFraquin.acelerar();
        carroFraquin.acelerar();

        System.out.println("Velocidade Atual Civic: " + carroFraquin.velocidadeAtual);

        Carro carroPotente = new Ferrari();

        System.out.println("Velocidade Atual Ferrari: " + carroPotente.velocidadeAtual);

        carroPotente.acelerar();
        carroPotente.acelerar();

        System.out.println("Velocidade Atual Ferrari: " + carroPotente.velocidadeAtual);

    }

}

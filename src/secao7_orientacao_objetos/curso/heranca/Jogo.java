package secao7_orientacao_objetos.curso.heranca;

public class Jogo {

    public static void main(String[] args) {
        Jogador heroi = new Heroi();

        heroi.x = 10;
        heroi.y = 10;

        heroi.andar(Direcao.NORTE);
        heroi.andar(Direcao.LESTE);
        heroi.andar(Direcao.LESTE);
        heroi.andar(Direcao.SUL);
        heroi.andar(Direcao.SUL);

        Jogador j2 = new Jogador();

        j2.x = 10;
        j2.y = 10;

        j2.andar(Direcao.NORTE);
        j2.andar(Direcao.LESTE);
        j2.andar(Direcao.LESTE);
        j2.andar(Direcao.SUL);

        System.out.println(heroi.vida);
        System.out.println(j2.vida);
        System.out.println(heroi.x);
        System.out.println(heroi.y);

        heroi.atacar(j2);
        heroi.atacar(j2);

        j2.atacar(heroi);

        System.out.println("Vida Heroi: " + heroi.vida);
        System.out.println("Vida Monstro: " + j2.vida);
    }
}

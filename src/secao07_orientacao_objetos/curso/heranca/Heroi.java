package secao07_orientacao_objetos.curso.heranca;

public class Heroi extends Jogador {

    @Override
    void atacar(Jogador inimigo) {

        int deltaX = Math.abs(this.x - inimigo.x);
        int deltaY = Math.abs(this.y - inimigo.y);

        if ((deltaX == 0 && deltaY == 1) || deltaY == 0 && deltaX == 1)
            inimigo.vida -= 30;

    }
}

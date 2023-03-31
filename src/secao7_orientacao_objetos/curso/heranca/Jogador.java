package secao7_orientacao_objetos.curso.heranca;

public class Jogador {

    int vida = 100;
    int x;
    int y;

    void andar(Direcao direcao) {

        switch (direcao) {
            case NORTE:
                y++;
                break;
            case SUL:
                y--;
                break;
            case LESTE:
                x--;
                break;
            case OESTE:
                x++;
                break;
            default:
                break;
        }
    }

    void atacar(Jogador inimigo) {

        int deltaX = Math.abs(this.x - inimigo.x);
        int deltaY = Math.abs(this.y - inimigo.y);

        if ((deltaX == 0 && deltaY == 1) || deltaY == 0 && deltaX == 1)
            inimigo.vida -= 10;

    }

}

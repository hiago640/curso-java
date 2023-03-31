package secao7_orientacao_objetos.curso.composicao.um_pra_um;

public class Motor {

    boolean ligado = false;
    double fatorInjecao = 1;

    int giros() {
        return ligado ? (int) Math.round(fatorInjecao * 3000) : 0;
    }
}

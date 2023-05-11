package secao9_streams;

public class Media {

    private double total;
    private int quantidade;

    public void adicionar(double total) {
        this.total += total;
        quantidade++;
    }

    public Media adicionarComRetorno(double total) {
        this.total += total;
        quantidade++;

        return this;
    }

    public double getValor() {
        return total / quantidade;
    }

    public static Media combinarMedia(Media m1, Media m2) {

        Media resultante = new Media();
        resultante.quantidade = m1.quantidade + m2.quantidade;
        resultante.total = m1.total + m2.total;

        return resultante;
    }
}

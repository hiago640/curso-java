package secao9_streams;

public class MediaTeste {

    public static void main(String[] args) {

        Media m1 = new Media();
        m1.adicionar(8.3);
        m1.adicionar(6.7);

        System.out.println(m1.getValor());

        Media m2 = new Media();
        m2.adicionarComRetorno(7.9).adicionarComRetorno(6.6);

        System.out.println(m2.getValor());

        System.out.println(Media.combinarMedia(m1, m2).getValor());

    }
}

package secao7_orientacao_objetos.curso.composicao.um_pra_muitos;

public class CompraTeste {

    public static void main(String[] args) {

        Compra compra = new Compra();
        compra.cliente = "João";
        compra.itens.add(new Item("Caderno", 2, 4.50));
        compra.itens.add(new Item("Livro", 2, 27.50));
        compra.itens.add(new Item("Caneta", 2, 2.50));

        System.out.println("Valor Total: " + compra.valorTotal());
    }

}

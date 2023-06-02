package secao07_orientacao_objetos.curso.composicao.um_pra_muitos;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    double valorTotal() {
        double vlrTot = 0;

        for (Item item : itens)
            vlrTot += item.quantidade * item.preco;

        return vlrTot;
    }
}

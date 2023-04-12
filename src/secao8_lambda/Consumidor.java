package secao8_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    // representa uma operacaoo que aceita um unico argumento e nao retorna nada
    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 12.34, 0.09);

        imprimir.accept(p1);

        List<Produto> produtos = Arrays.asList(new Produto("Notebook", 2987.00, 0.09),
                new Produto("Caderno", 19.90, 0.09), new Produto("Borracha", 5.30, 0.09),
                new Produto("Lapis", 4.39, 0.09));

        produtos.forEach(imprimir);
    }
}

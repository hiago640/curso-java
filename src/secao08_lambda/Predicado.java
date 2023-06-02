package secao08_lambda;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        // representa um predicado (uma funcao que retona um booleano), recebe apenas um
        // argumento

        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) > 750;

        Produto produto = new Produto("Notebook", 3893.89, 0.15);
        // a interface Predicate prove o metodo test, que eh utilizado para realizar o
        // teste da expressao
        System.out.println(isCaro.test(produto));

    }

}

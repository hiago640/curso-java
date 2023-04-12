package secao8_lambda;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        // o tipo definido dentro do UnaryOperator representa o tipo de parametro de
        // entrada e o de sa�da
        UnaryOperator<Integer> maisDois = num -> num + 2;
        UnaryOperator<Integer> vezesDois = num -> num * 2;
        UnaryOperator<Integer> aoQuadrado = num -> num * num;

        // o metodo andThen le a instrucao da esquerda para a direita
        // no caso abaixo maisDois -> vezesDois -> aoQuadrado
        int resultado1 = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(0);

        System.out.println(resultado1);

        // o metodo compose le a instrucao da direita para a esquerda
        // no caso abaixo aoQuadrado -> vezesDois -> maisDois
        int resultado2 = maisDois
                .compose(vezesDois)
                .compose(aoQuadrado)
                .apply(0);

        System.out.println(resultado2);

    }

}

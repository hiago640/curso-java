package secao8_lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> media = (a, b) -> (a + b) / 2;

        System.out.println("Media: " + media.apply(9.8, 5.7));

        // Tipo do primeiro, tipo do segundo, tipo do retorno
        BiFunction<Double, Double, String> res = (n1, n2) -> {
            return ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
        };

        System.out.println(res.apply(9.7, 5.7));
        System.out.println(res.apply(9.7, 4.2));

        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";

        // juntando duas funcoes
        System.out.println(media.andThen(conceito).apply(9.7, 4.2));
    }

}

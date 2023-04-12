package secao8_lambda;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = n -> n % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        System.out.println(isPar.test(23));
        System.out.println(isPar.test(122));

        // Predicado1 E Predicado2
        System.out.println(isPar.and(isTresDigitos).test(23));
        System.out.println(isPar.and(isTresDigitos).test(123));

        // Predicado1 OU Predicado2
        System.out.println(isPar.or(isTresDigitos).test(123));

        // Predicado1 OU Predicado2 NEGADO
        System.out.println(isPar.or(isTresDigitos).negate().test(123));
    }
}

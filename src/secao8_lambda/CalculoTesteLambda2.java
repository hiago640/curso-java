package secao8_lambda;

import java.util.function.BinaryOperator;

public class CalculoTesteLambda2 {

    public static void main(String[] args) {

        // o BinaryOperator representa uma operacaoo que recebe 2 operando do mesmo tipo
        // e retorna algo do mesmo tipo. Deve utilizar o metodo apply para executar a
        // interface funcional

        BinaryOperator<Double> calc = (a, b) -> a + b;
        System.out.println(calc.apply(2.0, 3D));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2D, 3.5));

    }

}

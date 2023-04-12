package secao8_lambda;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        // representa uma operacao que aceita um unico argumento e retorna algo
        Function<Integer, String> parOuImpar = n -> n % 2 == 0 ? "Par" : "�mpar";

        System.out.println(parOuImpar.apply(33));

        Function<String, String> oResultadoE = val -> "O resultado �: " + val;

        Function<String, String> empolgado = val -> val + "!!!";

        Function<String, String> duvida = val -> val + "???";

        // � poss�vel chamar uma funcao apos a outra utilizando o metodo andThen
        // Detalhe, so eh possivel chamar uma funcao cujo o par�metro recebido seja do
        // mesmo tipo do retorno da primeira funcao
        String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(33);

        // veja que utilizando as funcoes, eh poss�vel utilizar determinadas funcoes
        // novamente para chegar em um resultado diferente
        String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(duvida).apply(33);

        System.out.println(resultadoFinal);
        System.out.println(resultadoFinal2);
    }
}

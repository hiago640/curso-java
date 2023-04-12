package secao8_lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioBinaryOperator {

    public static void main(String[] args) {

        Produto p = new Produto("iPad", 3325.89, 0.13);

        /**
         * 1. A partir do produto calcular o preco real (com desconto) 
         * 2. Imposto Municipal >= 2500 (8,5%)/ < 2500 (Isento) 
         * 3. Frete: >= 3000 (100) / < 3000 (50) 
         * 4. Arredondar: Deixar duas casas decimais 
         * 5. Formatar: R$1234,56
         */

        Function<Produto, Double> precoReal = prod -> prod.preco * (1 - prod.desconto);
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> (preco >= 3000 ? preco + 100 : preco + 50);
        UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar = val -> ("R$" + val).replace('.', ',');

        String precoFinal = precoReal
                .andThen(frete)
                .andThen(impostoMunicipal)
                // .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println(precoFinal);
    }

}

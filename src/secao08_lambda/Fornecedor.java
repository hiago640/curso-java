package secao08_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

    public static void main(String[] args) {

        // nao recebe nenhum argumento, mas retorna algo
        Supplier<List<String>> lista = () -> Arrays.asList("Ana", "Bia", "Gui");

        System.out.println(lista.get());

    }

}

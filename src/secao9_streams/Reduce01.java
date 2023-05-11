package secao9_streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (acc, n) -> acc + n;

        int total = nums.stream().reduce(soma).get();

        System.out.println(total);

        System.out.println("Chamando o reduce, com um valor inicial");
        total = nums.stream().reduce(100, soma).intValue();
        System.out.println(total);

        nums.stream().filter(n -> n > 10).reduce(soma).ifPresent(System.out::println);

    }
}

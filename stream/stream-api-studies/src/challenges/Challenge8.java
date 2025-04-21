package challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge8 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 30,50);

        int sum = numbers.stream()
                        .flatMapToInt(n -> String.valueOf(n) // converte o numero para string
                        .chars() // pega os caracteres
                        .map(c -> c - '0')) // converte o charactere para numero
                        .sum(); // soma

         System.out.println("Soma de todos os dígitos: " + sum);
                

    }

}

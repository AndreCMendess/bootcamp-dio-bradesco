package challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Challenge14 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 30,50 , 200 , 300 , 133 ,29 , 34, 913);

        Optional<Integer> biggestPrimeNumber = numbers.stream()
        .filter(n -> n > 1 && IntStream.range(2,(int) Math.sqrt(n) + 1).noneMatch(i -> n % i == 0)) // verifica se o numero é primo
        .max(Integer::compare);

        biggestPrimeNumber.ifPresentOrElse(
            n -> System.out.println("Maior numero primo é: " + n),
            () -> System.out.println("Não há numero primo na lista"));

    }
    
}

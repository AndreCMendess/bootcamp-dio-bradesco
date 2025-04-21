package challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge11 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 30,50);

        Integer total = numbers.stream()
        .mapToInt(n -> n * n)
        .sum();

        System.out.println(total);

        

    }

}

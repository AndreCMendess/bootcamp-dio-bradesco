package challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge13 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 30,50 , 200 , 300 , 133 ,29 , 34, 913);

        numbers.stream()
        .filter(n -> n > 5 && n < 50)
        .forEach(n -> System.out.println("Numeros filtras entre 5 e 50: " + n));
      
    }
}

package challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge2 {
    
    public static void main(String[] args) {

       List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);
        numbers.stream()
        .filter((n) -> n % 2 == 0)
        .forEach(n -> System.out.println("Numeros pares da lista " + n));
    }
}

package challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge15 {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(-10,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 30,50 , 200 , 300 , 133 ,29 , 34, 913);

        boolean numberNegative = numbers.stream()
        .anyMatch(n -> n < 0);
        
        if(numberNegative) {
            System.out.println("Contem um numero negativo na lista");
        } else {
            System.out.println("Não contem numero negativo");
        }

    }
}

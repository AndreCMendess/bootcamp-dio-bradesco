package challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge19 {
    public static void main(String[] args) {
         
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 30,50 , 200 , 300 , 133 ,29 , 34, 913);

        int sum = numbers.stream()
        .filter(n -> n % 3 == 0 && n % 5 == 0) //filtra
        .mapToInt(Integer::intValue) // converte para int
        .sum();    

        System.out.println("Soma dos números divisíveis por 3 e 5: " + sum);

        
    }
    
}

package challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Challenge17 {

    public static void main(String[] args) {
              
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 30,50 , 200 , 300 , 133 ,29 , 34, 913);

        List<Integer> listEven = numbers.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());

        List<Integer> listOdd= numbers.stream()
        .filter(n -> n % 2 != 0)
        .collect(Collectors.toList());

        System.out.println("Lista de par: " + listEven);
        System.out.println("Lista de impar: " + listOdd);
  
    }

}

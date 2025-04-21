package challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge10 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 30);

        List<Integer> result = numbers.stream()
                               .filter(n -> n % 2 != 0) // obtem os numeros impas
                               .filter(n -> n % 3 == 0 || n % 5 == 0)
                               .collect(Collectors.toList()); // cria uma nova lista com os valores filtrados     

        System.out.println(result);                    

    }
}

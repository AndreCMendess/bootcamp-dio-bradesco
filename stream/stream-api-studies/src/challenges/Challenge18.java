package challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge18 {
    
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1,1,1,1);

        boolean allNumberEqual = numbers.stream()
        .distinct()
        .count() == 1;

        if(allNumberEqual) {
            System.out.println("Todos os numeros da lista sao os mesmos");
        }else {
            System.out.println("Os numeros nao sao os mesmos");
        }
        
    }
}

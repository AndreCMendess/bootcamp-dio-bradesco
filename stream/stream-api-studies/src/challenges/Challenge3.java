package challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge3 {

   public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);
    boolean allPositive = numbers.stream()
    .allMatch((n) -> n > 0);

    if(allPositive) {
        System.out.println("Todos os numeros da lista so positivos");
    }else{
        System.out.println("Nem todos os nuemros da lista sao positivos");
    }
    
   }
}

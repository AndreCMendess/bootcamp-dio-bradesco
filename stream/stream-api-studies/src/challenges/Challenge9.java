package challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge9 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 30,50);
        boolean allUnique = numbers.stream()
                                .distinct()
                                .count() == numbers.size();
        
        
        if(allUnique) {
            System.out.println("Cada numero da lista é unico");     
        }else {
            System.out.println("Os numeros nao sao todos unicos");
        }
    }
}

package challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Challenge7 {

    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3,30,50,100);
        
        Integer secondMax = numbers.stream()
                            .distinct() // remove numeros duplicados
                            .sorted(Comparator.reverseOrder())// ordernar do maior pro menor
                            .skip(1) // pula o maior numero depois de encontrar
                            .findFirst() // pega o numero
                            .orElse(null);

         if(secondMax != null) {
            System.out.println(secondMax);
         }                   

    }

}

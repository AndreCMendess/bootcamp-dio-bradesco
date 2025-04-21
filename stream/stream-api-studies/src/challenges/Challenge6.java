package challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge6 {

    public static void main(String[] args) {
        
       List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3,30);

       //Retorna verdadeiro se qualquer numero da lista atender a condição de ser maior que 10
        boolean bigger10 = numbers.stream()
        .anyMatch((n) -> n > 10);
        
        if(bigger10) {
            System.out.println("A lista contem um numero maior que 10");
        }else {
            System.out.println("A lista nao contem um numero maior que 10");
        }
    }

}

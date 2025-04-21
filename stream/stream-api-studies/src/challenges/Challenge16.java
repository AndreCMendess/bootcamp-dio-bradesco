package challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Challenge16 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero para ser calculado o fatorial");
        Integer number = scan.nextInt();
        
        long factorial = IntStream.rangeClosed(1, number) // cria um stream de 1 ate o numero 
        .reduce(1, (a,b) -> a * b);

        System.out.println("O fatorial de " + number + " é " + factorial);

    }
    
}

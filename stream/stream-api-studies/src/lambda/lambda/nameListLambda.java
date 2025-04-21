package lambda.lambda;

import java.util.Arrays;
import java.util.List;

public class nameListLambda {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Andre","Lucas","Jane","Talles");

        
        names.sort((name1,name2) -> name1.compareTo(name2));
       
        System.out.println("Ordendado com lambda ordem alfabetica");
        names.forEach(name -> System.out.println(name));

        System.out.println("Ordendado pelo tamanho das palavras");
         //ordendando pelo tamanho das palavras
         names.sort((word1,word2) -> Integer.compare(word1.length(), word2.length()));
        names.forEach(name -> System.out.println(name)); 

        
    }
}

package methodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class nameListMethodReference {

    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Andre","Lucas","Jane","Talles");

        names.sort(String::compareTo);
    
        System.out.println("Ordenado com method reference:");
        names.forEach(System.out::println);

        names.sort(Comparator.comparingInt(String::length));
        System.out.println("Ordenando pelo tamanho das palvrars utilziando method reference");
        names.forEach(System.out::println);

    }
      
}

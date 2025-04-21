package challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge1 {

    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        Collections.sort(numbers);
        
        //ordenando do menor pro maior
        System.out.println(numbers);

    }
}

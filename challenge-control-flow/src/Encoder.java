import java.util.Scanner;

import Exceptions.InvalidParametersException;

public class Encoder {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numberOne = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numberTwo = scan.nextInt();

        try { 
    
            int indice = count(numberOne, numberTwo);

            for(int i = 0; i < indice; i++){
                System.out.println("Imprimindo o numero " + (i + 1));
              
            }
        } catch (InvalidParametersException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }

    static int count(int numberOne , int numberTwo)  throws InvalidParametersException {

        if(numberOne > numberTwo) {
            throw new InvalidParametersException("O segundo parametro deve ser maior que o primeiro");      
        }

            int c = numberTwo - numberOne;
            return c;
    
    }
}

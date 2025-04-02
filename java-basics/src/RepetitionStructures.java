public class RepetitionStructures {

   public static void main(String[] args) {
     //for
     for(int i = 0; i < 5; i++) {
        System.out.println("Valor de i: " + i);
     }

     int[] numbers = {10,20,30,40,50};

     for(int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
     }


     for(int i = 0; i < 10; i++) {
        if (i == 5) {
            System.out.println("Saindo do loop , valor de i: " + i);
            break; // Sai do loop quando o valor de i é igual a 5
        }
        System.out.println("Valor de i: " + i);
     }

     for (int i = 0; i < 10; i++) {
        if (i == 5) {
            continue; // Pula o valor 5 e vai para o próximo número
        }
        System.out.println("Valor de i: " + i);
    }
     
    // while
    // Repete o bloco enquanto a condição for verdadeira
    int i = 0;
   
    while (i <= 5) {
        System.out.println("valor de i: " + i);
        i++; // incrementa  i a cada iteraçao para nao ocorrer loop infinito
    }

    // do-while
    /* A condição é verificada após a execução do código,
     garantindo que o bloco do codigo seja executado pelomenos uma vez*/
    int j = 0;

    do { 
        System.out.println("Valor de j: " + j);
        j++;
    } while (j < 5);

   }
}
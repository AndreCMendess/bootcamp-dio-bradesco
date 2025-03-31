import java.util.Scanner;

public class ContaTerminal {

   
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Por favor digite seu nome");
        String name = scan.nextLine();
        
        System.out.println("Por favor digite o numero de sua agencia");
        int agency = scan.nextInt();


        System.out.println("Por favor digite o numero da conta");
        int numberAcount = scan.nextInt();

        System.out.println("Por favor digite o saldo");
        double balance = scan.nextDouble();

      
        System.out.println("Olá " + name + " obrigado por criar uma conta em nosso banco, sua agencia é " + agency + " conta de numero " + numberAcount + " e o saldo é" + balance );
    }
}

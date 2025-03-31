import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        // Criando scanner para receber dados de entrada
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double height = scan.nextDouble();

        System.out.println("Digite seu nome");
        String name = scan.next();

        
        System.out.println("Digite seu sobrenome");
        String lastName = scan.next();
        
        System.out.println("Digite sua idade");
        int age = scan.nextInt();

        System.out.println("Seu nome :" + name);
        System.out.println("Seu sobrenome: " + lastName);
        System.out.println("Sua idade: " + age);
        System.out.println("Sua altura: " + height);
    }  

}

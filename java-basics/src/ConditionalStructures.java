import java.util.Scanner;

public class ConditionalStructures {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira  o nome de usuario:");
        String name = scan.nextLine();

        String nameSaved = "Andre";
        String passSaved = "1234";

        if (name == nameSaved) {

            System.out.println("Insira sua senha:");
            String pass = scan.nextLine();

            if (pass == passSaved) {
                System.out.println("Usuario autenticado com sucesso");
            } else {
                System.out.println("Erro de autenticação");
            }
        } else {
            System.out.println("Usuario não existe , tente novamente");
        }

        // CondicionalEncadeada
        int age = 29;

        if (age < 13) {
            System.out.println("Você é uma criança");
        } else if (age >= 13 && age <= 18) {
            System.out.println("Você é um adolecente");
        } else if (age >= 18 && age <= 60) {
            System.out.println("Você é um adulto");
        } else {
            System.out.println("Você é um idoso");
        }

        // Swith-Case
        char option = 'B';
        switch (option) {
            case 'A':
                System.out.println("Você escolheu a opção A");
                break;
            case 'B':
                System.out.println("Você escolheu a opção B");
                break;
            case 'C':
                System.out.println("Você escolheu a opção C");
                break;
            case 'D':
                System.out.println("Você escolheu a opção D");
                break;
            default:
                break;
        }

        //Ternario
        double grade = 8.5;
        String result = (grade >=7) ? "Aprovado" : "Reprovado";
        System.out.println(result);
    }

}

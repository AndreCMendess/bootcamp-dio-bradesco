import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva o valor bruto do salario: ");
        double wage = scan.nextDouble();

        System.out.println("Escreva o valor total dos beneficios: ");
        double benefits = scan.nextDouble();

        double deduction = 0;

        if(wage <= 1100.00) {
            deduction = (wage * 5) / 100;
        } else if(wage > 1100.00 && wage <= 2500.00) {
            deduction = (wage * 10) / 100;
        } else {
            deduction = (wage * 15) /100;
        }

        double total = wage + benefits - deduction;
        System.out.println("Valor da dedução é: " + deduction);
        System.out.println("Valor do Salario  é: " + total);
    }
}
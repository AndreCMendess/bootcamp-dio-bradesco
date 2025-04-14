import java.util.Scanner;

import model.Circle;
import model.GeometricForm;
import model.Rectangle;
import model.Square;

public class App {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int option = 0;
        GeometricForm geometricForm = null;
        while (option != 4) {
            System.out.println("Escolha o tipo de forma geometrica para calcular a área");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retangulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - Sair");
            option = scan.nextInt();
            if(option == 1) {
                geometricForm = createSquare();
            }
            else if(option == 2) {
                geometricForm = createRectangle();
            }
            else if(option == 3) {
                geometricForm = createCircle();
            } else if (option == 4){
                System.out.println("Saindo");
            } else {
                System.out.println("Selecione de 1 a 4");
            } 
            System.out.println("O valor da Área é :" + geometricForm.getArea());
               
        }
    }

    private static GeometricForm createSquare() {
        System.out.println("Informe o tamanho dos lados");
        var side = scan.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRectangle() {
        System.out.println("Informe a largura");
        var height = scan.nextDouble();
        System.out.println("Informe a base");
        var base = scan.nextDouble();
        return new Rectangle(height, base);
    }

    private static GeometricForm createCircle() {
        System.out.println("Informe a area do circulo");
        var radio = scan.nextDouble();
        return new Circle(radio);
    }

}

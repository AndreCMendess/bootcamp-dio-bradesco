package Exceptions;

public class CustomizedException {
    public static void main(String[] args) {
        try{
            checkAge(10);
        } catch (MyException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Idade menor que 18 anos, acesso não permitido!");
        } else {
            System.out.println("Idade válida, acesso permitido.");
        }
    }
}

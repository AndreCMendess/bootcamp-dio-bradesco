package Exceptions;

// Criando exceção personalizada estendendo a classe Exception
public class MyException extends Exception{
    public MyException(String mensagem) {
        super(mensagem);
    }
}

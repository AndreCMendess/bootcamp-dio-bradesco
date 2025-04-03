package Exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions {
    
    // CheckedExepction
    // O compilador exige que trate a exceção 
    public void lerArquivo(String nameFile) throws IOException {
        File file = new File(nameFile);
        if(file.exists()) {
            throw new FileNotFoundException("Arquivo " + nameFile + " não encontrado.");
        }

            Scanner scan= new Scanner(file);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        scan.close();
    }

    
    public static void main(String[] args) {
        
        // UncheckException
        // Não precisa ser explicitamente tratadas ou declaradas
        try{
            int[] arr = null;
            System.out.println(arr.length); // Causa nullPointerException por causa do valor nulo
        } catch (NullPointerException e) {
            System.out.println("Erro: Tentativa de acessar variável nula!");
        }

    }

    
}

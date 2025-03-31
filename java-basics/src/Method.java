public class Method {
    
    
    public void methodNoReturn() {
        System.out.println("Este método não retorna nenhum valor.");
    }
    
    //Método que retorna um valor de qualquer tipo
    public int sum(int a, int b) {
        return a + b;
    }

    //Método estatico pertence a classe e nao a uma instancia especifica
    public static void methodStatic() {
        System.out.println("Este é um método estático.");
    }

    //Método com múltiplos parâmetros
    public void descriptionPerson(String name, int age) {
        System.out.println("Nome: " + name + ", idade: " + age);
    }

    //Método sobrecarregado , é possivel ter mpetodos com o mesmo nome mas com diferente parâmetros
    public void display(int num) {
        System.out.println("Numero inteiro" + num);
    }

    public void display(String text) {
        System.out.println("Texto" + text);
    }

    //Método com parâmetros varargs , permite passar um número variável de argumentos para o método.
    public void listNumbers(int... numbers) {
        for(int number: numbers){
            System.out.println(number);
        }
    }

    //Método Recursivo,Um método recursivo é aquele que se chama dentro de si mesmo.
    public int factorial(int n) {
        if(n == 0){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    /*Método com Tipo Genérico
     Métodos genéricos permitem trabalhar com diferentes tipos de dados.*/ 
    public <T> void print (T value){
        System.out.println(value);
    }

    /*Método de Instância e de Classe
      Além de métodos estáticos, existem métodos de instância, que necessitam de um objeto para serem chamados. 

      Método Abstrato
       Métodos abstratos são definidos em classes abstratas e não têm implementação.
    As classes filhas são responsáveis pela implementação. */






}

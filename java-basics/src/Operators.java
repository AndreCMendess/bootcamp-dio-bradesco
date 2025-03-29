public class Operators {
   String name = "Andre"; // operador = serve para atribuir algo a uma variavel

   int sum = 10 + 5; // operador + serve para somar 

   int sub = 20 - 5; // operador - serve para subtrair 

   int division = 20 / 4; // operador / serve para dividir 

   int mult = 2 * 5; // operador * serve para multiplicar

   int module = 24 / 2; // operador % serve para descobrir o resto de uma divisão

   String conc = " Hello" + " " + "World"; // o operador + dentro de uma string serve para concatenar duas strings

   public static void main(String[] args) {

        Operators op = new Operators();

        //Operadores aritmeticos
        System.out.println("Soma: " + op.sum);
        System.out.println("Subtração: " + op.sub);
        System.out.println("Divisão: " + op.division);
        System.out.println("Multiplicação: " + op.mult);
        System.out.println("Módulo: " + op.module);
        System.out.println("Concatenação: " + op.conc);

        int number = 10;
        number = - number; // Invertendo valor com operador unário - 
        System.out.println(number); //-10

        number = number * -1; // Multiplicando o numero negativo por -1 para inverter e se tornar positivo
        System.out.println(number); //10

        /*  O operador - antes de uma variável (ou número) é um operador unário que inverte o sinal da variável. 
        Se o número for positivo,ele se torna negativo, e se for negativo, ele se torna positivo.*/

        //  Multiplicar qualquer número por -1 também inverte o seu sinal.

        number = number + 1; // Adiciono 1 ao valor de number
        System.out.println(number); // 11
        number += 1; // Atribuição composta ,  forma mais compacta de (  number = number + 1)
        System.out.println(number); // 12
        number++; // Operador pós inclemento , utiliza o valor de number e depois incrementa
        System.out.println(number); // 13
        number--; // Operador pós-decremento, utiliza o valor de number e depois decrementa
        System.out.println(number); // 12


        // Operadores booleanos

        // O operador ! inverte o valor de uma variavel booleana 
        boolean variable = true;   // Atribui um valor true
        variable = !variable; // Inverte o valor com o ! de true para false;
        System.out.println(!variable); // Imprime o valor invertido false

        // Declarando a variável 'number2' com valor 5 e 'result' como uma String vazia
        int number2 = 5;
        String result = "";

        // Utilizando uma estrutura condicional 'if' para verificar se 'number' é igual a 'number2'
        if(number == number2){ 
          // Se 'number' for igual a 'number2', o valor de 'result' será "Verdadeiro"
          result = "Verdadeiro";
        }else{
          // Caso contrário, o valor de 'result' será "Falso"
          result = "Falso";
        }
        // Imprime o valor da variável 'result' que foi definido no bloco condicional
        System.out.println(result);

        // Utilizando o operador ternário para simplificar a condição
        // Se 'number2' for igual a 5, 'res' será "Verdadeiro", caso contrário, será "Falso"
        String res = number2 == 5 ? "Verdadeiro" : "Falso"; 
        // Imprime o valor da variável 'res', que foi atribuído com base na condição ternária
        System.out.println(res);



        // == (igual)  -> Retorna true se os valores comparados forem iguais
        // != (diferente)  -> Retorna true se os valores comparados forem diferentes
        // < (menor)  -> Retorna true se o valor da esquerda for menor que o da direita
        // > (maior)  -> Retorna true se o valor da esquerda for maior que o da direita
        // <= (menor ou igual)  -> Retorna true se o valor da esquerda for menor ou igual ao da direita
        // >= (maior ou igual)  -> Retorna true se o valor da esquerda for maior ou igual ao da direita 

        // Os operadores relacionais retornam sempre um valor booleano (true ou false).

        int a,b;

        // Atribuindo valores 
        a = 1;
        b = 2;

        // Comparação utilizando o operador '==' (igualdade)
        boolean r = a == 2;  // False, pois 1 não é igual a 2
        System.out.println("Número 1 é igual a número 2? " + r);  // Imprime: Número 1 é igual a número 2? false

        // Comparação utilizando o operador '!=' (diferente)
        boolean r2 = a != 2; // True, pois 1 é diferente de 2
        System.out.println("Número 1 é diferente de número 2? " + r2);  // Imprime: Número 1 é diferente de número 2? true

        // Comparação utilizando o operador '>' (maior que)
        boolean r3 = a > 2;  // False, pois 1 não é maior que 2
        System.out.println("Número 1 é maior que número 2? " + r3);  // Imprime: Número 1 é maior que número 2? false

        // Comparação utilizando o operador '<' (menor que)
        boolean r4 = a < 2;  // True, pois 1 é menor que 2
        System.out.println("Número 1 é menor que número 2? " + r4);  // Imprime: Número 1 é menor que número 2? true

        // Comparação utilizando o operador '>=' (maior ou igual a)
        boolean r5 = a >= 2; // False, pois 1 não é maior nem igual a 2
        System.out.println("Número 1 é maior ou igual a número 2? " + r5);  // Imprime: Número 1 é maior ou igual a número 2? false

        // Comparação utilizando o operador '<=' (menor ou igual a)
        boolean r6 = a <= 2; // True, pois 1 é menor ou igual a 2
        System.out.println("Número 1 é menor ou igual a número 2? " + r6);  // Imprime: Número 1 é menor ou igual a número 2? true

        if(a < b){
            System.out.println("Condição Verdadeira");
        }else{
            System.out.println("Condição Falsa");
        }


        String name = "Andre"; // Inicializa uma string literal
        String name2 = "Andre"; // Inicializa outra com o mesmo valor
        System.out.println(name == name2); // Compara as duas  (true)
        String name3 = new String("Andre");  // Cria uma nova instância de String com o conteúdo "Andre"
        System.out.println(name2 == name3); // Verifica se name2 e name3 são o mesmo objeto (endereço de memória) (false)
        System.out.println(name2.equals(name3)); // Compara se o conteudo dos 2 objetos sao iguais (true)


        //Operadores Logicos

        boolean condition = true;
        boolean condition2 = false;

        //Verifica se as duas condições sao verdadeiras
        if(condition && condition2){
            System.out.println("As duas condições sao verdadeiras");
        }else{
            System.out.println("Uma das condições é falsa");
        }

        //Verifcia se a primeira condição ou a segunda é verdadeira
        if(condition || condition2){
            System.out.println("Uma das duas condições saõ verdadeiras");
        }else{
            System.out.println("As duas sao falsas");
        }
    }
}

package methodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import stock.Product;

public class productMethodReference {

    public static void main(String[] args) {
        
          List<Product> products = Arrays.asList( new Product("Laptop", 2999.99, 10),
            new Product("Mouse", 50.75, 25),
            new Product("Teclado Mecânico", 500.50, 15),
            new Product("Monitor 27\" 4K", 1200.00, 8),
            new Product("Fone de Ouvido", 200.20, 30),
            new Product("Cadeira Gamer", 1500.00, 5));

    System.out.println("Produtos com valor maior que 100");
    products.stream()
        .filter(Product::priceBigger100) // metodo pronto da classe
        .forEach(System.out::println);

     products.sort(Comparator.comparingDouble(Product::getPrice));
     System.out.println("Produtos ordenado por preço");
     products.forEach(System.out::println);
    }

  
}

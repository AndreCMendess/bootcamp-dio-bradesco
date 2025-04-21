package lambda.lambda;

import java.util.Arrays;
import java.util.List;
import stock.Product;

public class productLambda {

    public static void main(String[] args) {
        
        List<Product> products = Arrays.asList( new Product("Laptop", 2999.99, 10),
        new Product("Mouse", 50.75, 25),
        new Product("Teclado Mecânico", 500.50, 15),
        new Product("Monitor 27\" 4K", 1200.00, 8),
        new Product("Fone de Ouvido", 200.20, 30),
        new Product("Cadeira Gamer", 1500.00, 5));

        products.sort((p1,p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        products.forEach(p ->  System.out.println("Ordenando por preços dos produtos" + p));
        
        products.stream()
            .filter(p -> p.getPrice() > 100.0) // filtrando
            .forEach(p -> System.out.println("Produtos com preço maior que 100" + p));

    }

  
}

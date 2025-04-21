package binaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

import stock.Product;

public class listProductBinaryOperator {
 
       public static void main(String[] args) {

        List<Product> products = Arrays.asList( new Product("Laptop", 2999.99, 10),
        new Product("Mouse", 50.75, 25),
        new Product("Teclado Mecânico", 500.50, 15),
        new Product("Monitor 27\" 4K", 1200.00, 8),
        new Product("Fone de Ouvido", 200.20, 30),
        new Product("Cadeira Gamer", 1500.00, 5));

        BinaryOperator<Product> cheapProduct = (p1,p2) -> p1.getPrice() < p2.getPrice() ? p1 : p2;
  
        Product cheapest = products.stream()
        .reduce(cheapProduct)
        .orElse(null);

        System.out.println("Produto mais barato: " + cheapest);
       }
}


package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import stock.Product;

public class listProductConsumer {

    public static void main(String[] args) {
        
         List<Product> products = Arrays.asList( new Product("Laptop", 2999.99, 10),
        new Product("Mouse", 50.75, 25),
        new Product("Teclado Mecânico", 500.50, 15),
        new Product("Monitor 27\" 4K", 1200.00, 8),
        new Product("Fone de Ouvido", 200.20, 30),
        new Product("Cadeira Gamer", 1500.00, 5));

        Consumer<Product> applyDiscount = product -> product.setPrice(product.getPrice() * 0.9);

        products.forEach(applyDiscount);

        products.forEach(System.out::println);
    }
}

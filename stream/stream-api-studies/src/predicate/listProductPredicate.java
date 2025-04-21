package predicate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;import java.util.stream.Collectors;

import stock.Product;

public class listProductPredicate {

    public static void main(String[] args) {
        
         List<Product> products = Arrays.asList( new Product("Laptop", 2999.99, 10),
        new Product("Mouse", 50.75, 25),
        new Product("Teclado Mecânico", 500.50, 15),
        new Product("Monitor 27\" 4K", 1200.00, 8),
        new Product("Fone de Ouvido", 200.20, 30),
        new Product("Cadeira Gamer", 1500.00, 5));

        // Predicate de produtos com valor acima de 100
        Predicate<Product> isExpensive = product -> product.getPrice() > 100;

        // Cria uma lista de produtos onde é filtrado so os produtos com preço acima de 100 e orderna por preço
        List<Product> expensiveProducts = products.stream()
        .filter(isExpensive)
        .sorted(Comparator.comparing(Product::getPrice))
        .collect(Collectors.toList());

        expensiveProducts.forEach(System.out::println);
    }
}

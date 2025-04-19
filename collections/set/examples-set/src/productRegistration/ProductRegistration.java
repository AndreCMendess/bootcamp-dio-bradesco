package productRegistration;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistration {

    Set<Product> products;
    
    public ProductRegistration() {
        this.products = new HashSet<>();
    }

    public void addProduct(long code ,String name, double price , int quantity) {
        products.add(new Product(code, name, price, quantity));
    }

    public Set<Product> displayProductsByName() {
        Set<Product> productByName = new TreeSet<>(this.products);
        return productByName;
    }

    public Set<Product> displayProductByPrice() {
        Set<Product> productByPrice = new TreeSet<>(new ComparatorByPrice());
        productByPrice.addAll(this.products);
        return productByPrice;
    }

    public static void main(String[] args) {
        ProductRegistration products = new ProductRegistration(); 
        products.addProduct(1, "Laptop", 2500.00, 10);
        products.addProduct(2, "Smartphone", 1500.00, 25);
        products.addProduct(3, "Tablet", 900.00, 15);
        products.addProduct(4, "Headphones", 300.00, 50);
        System.out.println("Produtos por preço: " + products.displayProductByPrice());
        System.out.println("Produtos por Nome: " + products.displayProductsByName());
    }

}

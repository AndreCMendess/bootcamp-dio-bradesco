package stock;

import java.util.HashMap;
import java.util.Map;

public class StockProducts {
    private Map<Long, Product> stockProductsMap;

    public StockProducts() {
        this.stockProductsMap = new HashMap<>();
    }

    public void addProduct(long code, String name, int quantity, double price) {
        stockProductsMap.put(code,new Product(name,price,quantity));
    }

    public void displayProducts() {
       System.out.println(this.stockProductsMap);
    }

    public double getValueTotalStock() {
        double valueTotal = 0;
        if(!this.stockProductsMap.isEmpty()) {
            for(Product p : this.stockProductsMap.values()) {
                valueTotal += p.getPrice() * p.getQuantity();
            }
        }
        return valueTotal;
    }

    public Product getProductMaxValue() {
        Product productMoreExpensive = null;
        double maxPrice = Double.MIN_VALUE;
        for(Product p: this.stockProductsMap.values()) {
            if(p.getPrice() > maxPrice) {
                productMoreExpensive = p;
                maxPrice = p.getPrice();
            }
        }
        return productMoreExpensive;
    }

    public Product getProductSmallValue() {
        Product productMoreCheap = null;
        double smallPrice = Double.MAX_VALUE;
        for(Product p: this.stockProductsMap.values()) {
            if(p.getPrice() < smallPrice) {
                productMoreCheap = p;
                smallPrice = p.getPrice();
            }
        }
        return productMoreCheap;
    }

    public static void main(String[] args) {
        StockProducts stock = new StockProducts();

        stock.addProduct(1, "Mouse Gamer", 10, 149.90);
        stock.addProduct(2, "Teclado Mecânico", 5, 299.99);
        stock.addProduct(3, "Monitor 24\"", 3, 899.00);
        stock.addProduct(4, "Notebook i5", 2, 3499.90);
        stock.addProduct(5, "Headset USB", 8, 199.50);
        stock.addProduct(6, "Cadeira Gamer", 1, 1299.00);

        stock.displayProducts();
        System.out.println("Valor Total Estoque " + stock.getValueTotalStock());
        System.out.println("Maior Valor " + stock.getProductMaxValue());
        System.out.println("Menor Valor " + stock.getProductSmallValue());
    }


}

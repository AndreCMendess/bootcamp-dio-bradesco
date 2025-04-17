package basicOperations.shopping;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itemList;

    public ShoppingCart() {
        this.itemList = new ArrayList();
    }

    public void addItemToCart(String name, double price, int quantity) {
        Item newItem = new Item(name,price,quantity);
        this.itemList.add(newItem);
    }

    public void removeItem(String name) {
        List<Item> itemsToRemove = new ArrayList<>();
        for(Item i : this.itemList) {
            if(name.equalsIgnoreCase(i.getName())) {
                itemsToRemove.add(i);
            }
        }
        this.itemList.removeAll(itemsToRemove);
    }

    public double calcTotalValue() {
        double totalValue = 0;
        for(Item i : this.itemList) {
            totalValue += i.getPrice() * i.getQuantity();
        }
        return totalValue;
    }

    public void displayItems() {
       for(Item i : this.itemList) {
         System.out.println("Nome: " + i.getName());
         System.out.println("Valor: " + i.getPrice());
         System.out.println("Quantidade: " + i.getQuantity());
       }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItemToCart("Blusa", 100, 2);
        cart.addItemToCart("Tennis", 500, 1);
        cart.addItemToCart("Boné", 40, 5);
        cart.addItemToCart("Relogio", 250, 1);
        cart.displayItems();
        System.out.println(cart.calcTotalValue());
    }
    
}

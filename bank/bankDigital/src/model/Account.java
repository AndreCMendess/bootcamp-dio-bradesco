package model;

public abstract class Account {

    private int numberAccount;
    private int numberAgency;
    private double balance;
    private Client holder;
    private String password;

    public Account(int numberAccount, int numberAgency , double balance, Client holder, String password) {
        this.numberAccount = numberAccount;
        this.numberAgency =  numberAgency;
        this.balance = balance;
        this.holder = holder;
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getHolder() {
        return holder;
    }

    public int getNumberAgency() {
        return numberAgency;
    }

    public String getPassword() {
        return password;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.println("Depositado: $" + amount);
        } else {
            System.out.println("Valor invalido para depositar");
        }
    }

    public abstract boolean withdraw(double amount);
      
    
    public void displayAccountInfo() {
        System.out.println("Account Number: " + numberAccount);
        System.out.println("Client: " + holder.getName());
        System.out.println("Balance: " + balance);
    }

    
    

}

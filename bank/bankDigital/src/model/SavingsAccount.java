package model;

import java.time.LocalDate;

public class SavingsAccount extends Account {

    private double rateInterestMonthly;

    public SavingsAccount(int numberAccount, int numberAgency, double balance, Client holder, String password,
            double rate) {
        super(numberAccount, numberAgency, balance, holder, password);
        this.rateInterestMonthly = rate;
    }

    public void applyInterest(double rate) {
        rate = getBalance() * rateInterestMonthly;
        deposit(rate);
        System.out.println("Juros de R$" + rate + " aplicados à conta poupança.");
    }

    @Override
    public boolean withdraw(double amount) {

        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Saque feito no valor de" + amount);
            return true;
        } else {
            System.out.println("Saldo insuficiente na conta ou valor para saque invalido");
            return false;
        }
    }

}

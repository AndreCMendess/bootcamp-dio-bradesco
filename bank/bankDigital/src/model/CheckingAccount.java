package model;

public class CheckingAccount extends Account {

    private double overdraftLimit;
    private boolean overdraftEnabled;

    public CheckingAccount(int numberAccount, int numberAgency, double balance, Client holder, String password) {
        super(numberAccount, numberAgency, balance, holder, password);
    }

    @Override
    public boolean withdraw(double amount) {
        double avaliableFunds = getBalance() + (this.overdraftEnabled ? this.overdraftLimit : 0);

        if (amount <= avaliableFunds) {
            setBalance(getBalance() - amount) ; 
            System.out.println("Cheque especial utilizado , valor sacado: " + amount);
            return true;
        } else {
            System.out.println("Fundos insuficientes para saque mesmo com cheque especial");
            return false;
        }
    }

    public void enableOverdraft() {
        overdraftEnabled = true;
    }

    public void disableOverdraft() {
        overdraftEnabled = false;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    

}

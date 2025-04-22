import model.Account;
import model.CheckingAccount;
import model.Client;
import model.SavingsAccount;

public class App {

    public static void main(String[] args) {

        Client cliente = new Client("André", "11 99999-9999");

     
        CheckingAccount cc = new CheckingAccount(
            12345,         
            9876,           
            1000.0,          
            cliente,         
            "senha123"             
        );
    
        System.out.println("Conta Corrente:");
        System.out.println("Titular: " + cc.getHolder().getName());
        System.out.println("Saldo: R$" + cc.getBalance());
        System.out.println("Depositando 1000 de limite no cheque especial");
        cc.setOverdraftLimit(1000);
        cc.enableOverdraft();

        System.out.println("Limite: R$" + cc.getOverdraftLimit());

        cc.withdraw(1200.0);  
        System.out.println("Saldo após saque: R$" + cc.getBalance());


            Client cliente2 = new Client("Bruna", "21 88888-8888");

        SavingsAccount cp = new SavingsAccount(
            54321,
            4321,
            2000.0,
            cliente2,
            "senha456",
            0.02
        );

        System.out.println("\nConta Poupança:");
        System.out.println("Titular: " + cp.getHolder().getName());
        System.out.println("Saldo: R$" + cp.getBalance());

        System.out.println("Depositando R$500...");
        cp.deposit(500.0);
        System.out.println("Novo saldo: R$" + cp.getBalance());

        System.out.println("Aplicando rendimento de 2%...");
        cp.applyInterest(0.05); // 5% de juros

        System.out.println("Saldo após rendimento: R$" + cp.getBalance());
    }
}

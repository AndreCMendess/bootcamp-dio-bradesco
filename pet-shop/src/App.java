import java.util.Scanner;

public class App {

    private final static Scanner scan = new Scanner(System.in);
    private final static PetMachine  petMachine = new PetMachine();
    public static void main(String[] args) throws Exception {

     
        int option = -1;
        do {
            System.out.println("Escolha uma das opções");
            System.out.println("=========================");
            System.out.println("1- Dar banho no pet");
            System.out.println("2- Abastecer maquina com agua");
            System.out.println("3- Abastecer maquina com shampoo");
            System.out.println("4- Verificar quantidade de água da maquina");
            System.out.println("5- Verificar quantidade de shampoo da maquina");
            System.out.println("6- Verificar se tem pet no banho");
            System.out.println("7- Colocar pet na maquina");
            System.out.println("8- Retirar pet da maquina");
            System.out.println("9- Limpar maquina");
            System.out.println("0- Sair");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    petMachine.takeAShower();
                    break;
                case 2:
                    petMachine.addWater();
                    break;
                case 3:
                    petMachine.addShampoo();
                    break;
                case 4:
                    checkWater();
                    break;
                case 5:
                    checkShampoo();
                    break;
                case 6:
                    checkIfPetInMachine();
                    break;
                case 7:
                    setPetInPetMachine();
                    break;
                case 8:
                   removePet();
                    break;
                case 9:
                    System.out.println("Limpando maquina");
                    petMachine.wash();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                     System.out.println("Opção invalida , digite de 0 a 8");
                    break;
            }
        } while (option != 0);


    }

    private static void checkWater() {
        var amount = petMachine.getWater();
        System.out.println("A maquina esta com " + amount + "litros de agua");
    }

    private static void checkShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A maquina esta com " + amount + "litros de shampo");
    }

    private static void checkIfPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Pet esta tomando banho" : " Maquina vazia");
        
    }

    public static void setPetInPetMachine() {
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet ");
            name = scan.next();
        }
       
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na maquina ");
    } 
    
    public static void removePet() {
        petMachine.removePet();
        
    }


}

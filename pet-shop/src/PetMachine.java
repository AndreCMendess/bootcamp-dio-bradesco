public class PetMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

  
    public void takeAShower() {
        if(this.pet == null) {
           System.out.println("Ausencia de pet para banho");
           return;
        } else {
            this.water -= 10;
            this.shampoo -= 2;
            pet.setClean(true);
            System.out.println("O pet " + pet.getName() + " esta limpo");
        }
    }

    public void addWater() {
        if(water == 30) {
            System.out.println("A capacidade de agua esta no maximo");
            return;
        } else {
            water += 2;
        }
    }

    public void addShampoo() {
        if(shampoo == 10) {
            System.out.println("A capacidade de shampoo esta no maximo");
            return;
        } else {
            shampoo += 2;
        }
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getWater() {
        return water;
    }

    public boolean hasPet() {
       return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean) {
            System.out.println("Maquina de lavagem esta suja , limpe primeiro antes de dar banho no pet");
            return;
        }
        

        if(this.pet != null) {
            System.err.println("O pet " + this.pet.getName() + "esta tomando banho");
            return; 
        }
        this.pet = pet;
    }

    public void removePet() {
        if(pet != null) {
            this.clean = this.pet.isClean();  
            System.out.println("O pet " + this.pet.getName() + " esta limpo");
            System.out.println("Pet removido da maquina ");
            this.pet = null;
        } else {
            System.out.println("Nenhun pet na maquina para remover");
        }
    
       
    }

    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println(" A maquina esta limpa");
    }
}

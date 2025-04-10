package poo.model;

public abstract class Automobile {
    private int VIN;
    private String model;
    private Person owner;

    public Automobile(int VIN, String model, Person owner) {
        this.VIN = VIN;
        this.model = model;
        this.owner = owner;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Person getOwner() {
        return owner;
    }
    
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public abstract void getFuelType();
    public abstract String displayInfo();
}

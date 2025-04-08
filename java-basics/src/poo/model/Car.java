package poo.model;

import poo.util.CarType;

public class Car {
    private String model;
    private CarType type;
    private Person owner;

    public Car (String model, CarType type, Person owner) {
        this.model = model;
        this.type = type;
        this.owner = owner;
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

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public void displayCar() {
        System.out.println("Modelo: " + model + ", Tipo: " + type + ", Dono: " + owner.getName());

    }


}



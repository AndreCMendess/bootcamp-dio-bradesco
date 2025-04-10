package poo.model;

import poo.util.CarType;

public class Motorcycle extends Automobile implements Drivable{

    public Motorcycle(int VIN, String model, Person owner) {
        super(VIN, model, owner);
       
    }

    @Override
    public void getFuelType() {
       System.out.println("Alcool");
    }

    @Override
    public void accelerate() {
        System.out.println("Moto acelerando");
    }

    @Override
    public void brake() {
       System.out.println("Moto Freiando");
    }

    @Override
    public String displayInfo() {
        String info = "VIN: " + getVIN() + " Modelo: " + getModel() + " Dono: " + getOwner().getName();
        return info;
    }

}

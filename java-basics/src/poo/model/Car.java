package poo.model;

import poo.util.CarType;

public class Car extends Automobile implements Drivable{

    private CarType type;

    public Car(int VIN, String model, Person owner , CarType type) {
        super(VIN, model, owner);
        this.type = type;

    }
 
    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
   
  

    @Override
    public void getFuelType() {
        System.out.println("Gasolina");   
    }

    @Override
    public void accelerate() {
        System.out.println("Carro acelerando");
    }

    @Override
    public void brake() {
        System.out.println("Carro diminuindo velocidade");
    }

    @Override
    public String displayInfo() {
        String info = "VIN: " + getVIN() + " Modelo: " + getModel() + " Dono: " + getOwner().getName() + " Tipo: " + getType();
        return info;
    }


}



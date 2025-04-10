package poo;

import poo.model.*;
import poo.util.CarType;


public class Main {

  public static void main(String[] args) {
    
    Person person = new Person("Andre", 29);
    Person person2 = new Person("Rider",32);

    Car car = new Car(1231,"Fusca",person,CarType.SEDAN);
    System.out.println(car.displayInfo());
    car.getFuelType();
    car.accelerate();
    car.brake();

    Motorcycle m  = new Motorcycle(22232,"XRE",person2);
    System.out.println(m.displayInfo());
    m.getFuelType();
    m.accelerate();
    m.brake();

  }
    
}

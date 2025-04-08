package poo;

import poo.model.*;
import poo.util.CarType;


public class Main {

  public static void main(String[] args) {
    
    Person person = new Person("Andre", 29);

    Car car = new Car("Fusca",CarType.SUV,person);
    car.displayCar();
    person.displayInfo(); 

  }
    
}

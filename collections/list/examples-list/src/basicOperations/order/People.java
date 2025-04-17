package basicOperations.order;

import java.util.Comparator;

public class People implements Comparable<People>{
    private String name;
    private int age;
    private double height;

    public People(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public double getHeight() {
        return height;
    }

    @Override
    public int compareTo(People p) {
        return Integer.compare(this.age, p.age);
    }

    @Override
    public String toString() {      
        return "Name: " + name + ", Age: " + age + ", Height: " + height;
    }

}

class  CompareByHeight implements Comparator<People> {

    @Override
    public int compare(People p, People p2) {
        return Double.compare(p.getHeight(), p2.getHeight());
    }
}

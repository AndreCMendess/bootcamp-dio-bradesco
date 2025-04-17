package basicOperations.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderPeople {

    List<People> peopleList;

    public OrderPeople() {
        this.peopleList = new ArrayList();
    }

    public void addPeople(String name, int age , double height) {
        People newPeople = new People(name, age, height);
        this.peopleList.add(newPeople);
    }

    public List<People> orderByAge() {
        List<People> peopleByAge = new ArrayList<>(peopleList);
        Collections.sort(peopleByAge);
        return peopleByAge;
    }

    public List<People> orderByHeight() {
        List<People> peopleByHeight = new ArrayList<>(peopleList);
        Collections.sort(peopleByHeight, new CompareByHeight());
        return peopleByHeight;
    }

    public static void main(String[] args) {
        OrderPeople people  = new OrderPeople();
        people.addPeople("A", 27, 175);
        people.addPeople("b", 28, 180);
        people.addPeople("c", 20, 160);
        people.addPeople("d", 25, 200);
        people.addPeople("e", 18, 177);

        System.out.println(people.orderByAge());
        System.out.println(people.orderByHeight());
    }
}



package model;

public class Client {

    private String name;
    private String telphone;


    public Client(String name, String telephone) {
        this.name = name;
        this.telphone = telephone;
    }

    public String getName() {
        return name;
    }
    
    public String getTelphone() {
        return telphone;
    }


}

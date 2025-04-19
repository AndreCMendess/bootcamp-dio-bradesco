package calendarsContact;

public class Contact {
    private String name;
    private int number;


    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }
    
    public int getNumber() {
        return number;
    }

    public boolean hasSameName(String contactName) {
        return this.name.equalsIgnoreCase(contactName);
    }


    @Override
    public String toString() {
        return "Contact{name='" + name + "', number=" + number + "}";
    }


    @Override
    public boolean equals(Object obj) {
      if(this == obj) return true;
      if(!(obj instanceof Contact)) return false;
      Contact other = (Contact) obj;
      return this.number == other.number;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(number);
    }


}

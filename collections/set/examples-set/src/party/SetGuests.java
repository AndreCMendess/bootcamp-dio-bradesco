package party;

import java.util.HashSet;
import java.util.Set;

public class SetGuests {

    private Set<Guest> guests;

    public SetGuests() {
        this.guests = new HashSet<>();
    }

    public void addGuest(String name  , int codeInvitation) {
        Guest newGuest = new Guest(name, codeInvitation);
        if(!this.guests.add(newGuest)) {
            System.out.println("O condigo de convite " + newGuest.getCodeInvitation() + " ja existe ");
        }
    }

    public void removeGuestByCodeInvitation(int codeInvitation) {
        Guest guestToRemove = null;
        for(Guest g : this.guests) {
            if(g.getCodeInvitation() == codeInvitation) {
                guestToRemove = g;
                break;
            }
        }
        this.guests.remove(guestToRemove);  
    }

    public int guestSize() {
        return this.guests.size();
    }
    
    public void displayGuests() {
        System.out.println(this.guests);
    }

    public static void main(String[] args) {
        SetGuests g = new SetGuests();
        g.addGuest("A", 1234);
        g.addGuest("A", 1234);
        g.addGuest("C", 123431);
        g.displayGuests();
    }
    
}

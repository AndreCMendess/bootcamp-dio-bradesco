package party;
import java.util.Objects;

public class Guest {

    private String name;
    private int codeInvitation;

    public Guest(String name, int codeInvitation) {
        this.name = name;
        this.codeInvitation = codeInvitation;
    }

    public int getCodeInvitation() {
        return codeInvitation;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Guest)) return false;
        Guest otherGuest = (Guest) obj;
        return this.codeInvitation == otherGuest.codeInvitation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeInvitation);
    }

    @Override
    public String toString() {
        return "Convidado: " + name + " | Código do Convite: " + codeInvitation;
    }

    
}

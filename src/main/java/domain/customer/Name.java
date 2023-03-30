package domain.customer;

public class Name {
   private String Firstname;
   private String Lastname;

    public Name(String firstname, String lastname) {
        Firstname = firstname;
        Lastname = lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }
}
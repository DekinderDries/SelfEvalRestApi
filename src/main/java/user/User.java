package user;

public class User {
    Name name;
    Address address;
    Contacts contacts;

    public User(Name name, Address address, Contacts contacts) {
        this.name = name;
        this.address = address;
        this.contacts = contacts;
    }
}

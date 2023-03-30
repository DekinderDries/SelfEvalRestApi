package domain.customer;

import api.CustomerDTO;

public class Customer {
    private final int customerId;
    private static int counter;
    private final Name name;
    private final Address address;
    private final Contacts contacts;

    public Customer(Name name, Address address, Contacts contacts) {
        this.customerId = counter++;
        this.name = name;
        this.address = address;
        this.contacts = contacts;
    }

    public CustomerDTO toDTO() {
        return null;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public int getCustomerId() {
        return customerId;
    }
}

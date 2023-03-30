package domain.customer;

import dto.CustomerDTO;

import java.util.UUID;

public class Customer {
    private UUID customerId;
    private final Name name;
    private final Address address;
    private final Contacts contacts;

    public Customer(Name name, Address address, Contacts contacts) {
        this.customerId = UUID.randomUUID();
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

    public UUID getCustomerId() {
        return customerId;
    }
}

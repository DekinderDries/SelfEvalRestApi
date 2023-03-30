package api;

import domain.customer.Address;
import domain.customer.Contacts;
import domain.customer.Customer;
import domain.customer.Name;

import java.util.List;

public class CustomerDTO {
    private final int customerId;
    private final Name name;
    private final Address address;
    private final Contacts contacts;
    private List<Customer> listOfCustomers;

    public CustomerDTO(int customerId, Name name, Address address, Contacts contacts) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.contacts = contacts;
    }
    public CustomerDTO(Customer toCopy){
        this.customerId = toCopy.getCustomerId();
        this.name = toCopy.getName();
        this.address = toCopy.getAddress();
        this.contacts = toCopy.getContacts();
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
}
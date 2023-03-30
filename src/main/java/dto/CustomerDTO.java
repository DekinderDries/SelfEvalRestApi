package dto;

import domain.customer.Address;
import domain.customer.Contacts;
import domain.customer.Customer;
import domain.customer.Name;

import java.util.List;
import java.util.UUID;

public class CustomerDTO {
    private String customerId;
    private final Name name;
    private final Address address;
    private final Contacts contacts;
    private List<Customer> listOfCustomers;

    public CustomerDTO(String customerId, Name name, Address address, Contacts contacts) {
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

    public String getCustomerId() {
        return customerId;
    }

    public List<Customer> getListOfCustomers() {
        return listOfCustomers;
    }
}
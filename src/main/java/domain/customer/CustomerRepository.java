package domain.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {
    private final List<Customer> listOfCustomers = new ArrayList<Customer>();
    public List<Customer> getAllCustomers(){return listOfCustomers;}
    public Customer addCustomer(Customer customer) {
        listOfCustomers.add(customer);
        return customer;
    }
    public Customer getUserById(int customerID) {
        return listOfCustomers.stream()
                .filter(customer -> customer.getCustomerId() == customerID)
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Unknown customer ID. Please try again."));
    }
}

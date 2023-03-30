package domain.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class CustomerRepository {
    private final List<Customer> listOfCustomers = new ArrayList<Customer>();
    public List<Customer> getAllCustomers(){return listOfCustomers;}
    public Customer addCustomer(Customer customer) {
        listOfCustomers.add(customer);
        return customer;
    }
    public Customer getUserById(UUID customerID) {
        return listOfCustomers.stream()
                .filter(customer -> customer.getCustomerId() == customerID)
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Unknown customer ID. Please try again."));
    }
}

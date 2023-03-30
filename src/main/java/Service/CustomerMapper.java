package Service;

import api.CustomerDTO;
import domain.customer.Customer;

import java.util.List;

public class CustomerMapper {
    public static List<CustomerDTO> listOfCustomersToListOfCustomerDTO(List<Customer> listOfCustomers){
        return listOfCustomers.stream()
                .map(Customer::toDTO)
                .toList();
    }

    public static CustomerDTO toDTO(Customer customer){
        return new CustomerDTO(customer);
    }
}

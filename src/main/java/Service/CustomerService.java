package Service;

import api.CustomerDTO;
import domain.customer.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public List<CustomerDTO> getAllCustomers(){return CustomerMapper.listOfCustomersToListOfCustomerDTO(customerRepository.getAllCustomers());}
}

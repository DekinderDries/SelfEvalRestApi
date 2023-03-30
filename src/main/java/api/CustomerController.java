package api;

import domain.customer.CustomerRepository;
import dto.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<CustomerDTO> getAllCustomers(@RequestHeader String admin){
        return customerRepository.getAllCustomers().stream()
                .map(CustomerDTO::new)
                .toList();
    }

}

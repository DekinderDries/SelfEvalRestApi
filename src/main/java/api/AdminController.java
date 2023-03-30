package api;

import Service.CustomerService;
import domain.Item;
import domain.StockAmount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {
    private final CustomerService customerService;
    private final ItemDTO itemDTO;
    private final StockAmount stockAmount;

    public AdminController(CustomerService customerService, ItemDTO itemDTO, StockAmount stockAmount) {
        this.customerService = customerService;
        this.itemDTO = itemDTO;
        this.stockAmount = stockAmount;
    }

    @RequestMapping("admin/listofcustomers")
    public List<CustomerDTO> viewAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PutMapping
    public void addNewItem() {
    //    return itemDTO = new ItemDTO();
    }

    @PostMapping
    public void updateItem() {
    }
}

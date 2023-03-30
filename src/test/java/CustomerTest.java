import domain.customer.Address;
import domain.customer.Contacts;
import api.CustomerDTO;
import domain.customer.Name;
import org.junit.jupiter.api.Test;



public class CustomerTest {
    //UnitTests = MethodsTesting
    @Test
    void creatNewUser(){
        CustomerDTO customer = new CustomerDTO(1,new Name("Dries", "Dekinder"),
                new Address("Adolf Dhavelaan", 43, 9940, "Evergem"),
                new Contacts("Driesdekinder@gmail.com", 486409092));}

}

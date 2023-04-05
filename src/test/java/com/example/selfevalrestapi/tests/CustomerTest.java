package com.example.selfevalrestapi.tests;

import domain.customer.*;
import dto.CustomerDTO;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import static io.restassured.http.ContentType.JSON;
import static org.assertj.core.api.Assertions.assertThat;


@Component
public class CustomerTest {

    private Customer someCustomer;
    private CustomerRepository customerRepository;
    private AdminController adminController;
    @Value("8081")
    private int port = 8081;

    //UnitTests = MethodsTesting
    @BeforeEach
    void someCustomer() {
        someCustomer = new Customer(new Name("Dries", "Dekinder"),
                new Address("Adolf Dhavelaan", 43, 9940, "Evergem"),
                new Contacts("Driesdekinder@gmail.com", 486409092));
    }

    @Nested
    class AdminController {
        @Test
        void getAllCustomers() {
            CustomerDTO customerDTO = new CustomerDTO(someCustomer);

            Customer[] result =
                    RestAssured.given()
                            .when()
                            .port(port)
                            .get("admin/listofcustomers")
                            .then()
                            .assertThat()
                            .extract()
                            .as(Customer[].class);

            assertThat(result)
                    .isNotNull()
                    .isNotEmpty();
        }
    }
}

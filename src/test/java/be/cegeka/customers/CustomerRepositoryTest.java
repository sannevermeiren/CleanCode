package be.cegeka.customers;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CustomerRepositoryTest {

    private Customer customer;
    private Customer customer1;
    private List<Customer> customers;
    private CustomerRepository customerRepository;

    @Before
    public void setUp() throws Exception{
        customer = new Customer("Sophie", "Mullen");
        customer = new Customer("Sanne", "Vermeiren");
        customers = new ArrayList<>();
    }

    @Test
    public void addCustomer_AddsCustomer() throws Exception{
        customers.add(customer);
        Assertions.assertThat(customers).contains(customer);
    }

    @Test
    public void getCustomers_ReturnsCustomerList() throws Exception {
        customers.add(customer);
        customers.add(customer1);
        Assertions.assertThat(customerRepository.getCustomers().);

               
    }

}
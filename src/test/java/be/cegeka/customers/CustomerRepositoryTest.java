package be.cegeka.customers;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CustomerRepositoryTest {

    private Customer customer1;
    private Customer customer2;
    private Customer customer3;

    private List<Customer> customers;
    private CustomerRepository customerRepository=new CustomerRepository();

    @Before
    public void setUp() throws Exception {
        customer1 = new Customer("Sophie", "Mullen");
        customer2 = new Customer("Sanne", "Vermeiren");
        customer3 = new Customer("Elise", "Lodewyckx");

        customers = new ArrayList<>();

        customer1.setLoyaltyCard(new LoyaltyCard("UniqueCode", 1));
        customer2.setLoyaltyCard(new LoyaltyCard("123", 2));
        customer3.setLoyaltyCard(new LoyaltyCard("456", 3));
    }

    @Test
    public void addCustomer_AddsCustomer() throws Exception {
        customers.add(customer1);
        Assertions.assertThat(customers).contains(customer1);
    }

    @Test
    public void TestFindCustomerByBarcodeOnLoyaltyCard() {
        customerRepository.addCustomer(customer1);
        Assertions.assertThat(customerRepository.searchCustomerByBarCode("UniqueCode")).isEqualTo(customer1);
    }


}


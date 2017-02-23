package be.cegeka.customers;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CustomerTest {

    private Customer customer;

    @Before
    public void setUp() throws Exception{
        customer = new Customer("Sophie", "Mullen");
    }

    @Test
    public void toString_ReturnsFirstAndSecondName() throws Exception {
        String expected = "Sophie Mullen";
        Assertions.assertThat(customer.toString().equals(expected));
    }

}
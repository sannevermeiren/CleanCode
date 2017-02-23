package be.cegeka.customers;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class CustomerTest {

    private Customer customer;

    private List<String> testGroceriesList1 = new ArrayList<>();
    private List<String> testGroceriesList2 = new ArrayList<>();
    private List<String> fullDayGroceries = new ArrayList<>();

    @Before
    public void setUp() throws Exception{
        customer = new Customer("Sophie", "Mullen");

        testGroceriesList1.add("chocolat");
        testGroceriesList1.add("apple");

        testGroceriesList2.add("pineapple");
        testGroceriesList2.add("candy");

        fullDayGroceries.add("chocolat");
        fullDayGroceries.add("apple");
        fullDayGroceries.add("pineapple");
        fullDayGroceries.add("candy");
    }

    @Test
    public void toString_ReturnsFirstAndSecondName() throws Exception {
        String expected = "Sophie Mullen";
        Assertions.assertThat(customer.toString().equals(expected));
    }

    @Test
    public void testIfGroceriesAreStoredByDay(){

    }

    @Test
    public void testIfGroceriesCanBeDoneMultipleTimesPerDay(){

    }

}
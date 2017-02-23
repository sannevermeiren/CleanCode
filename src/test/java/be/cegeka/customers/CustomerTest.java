package be.cegeka.customers;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class CustomerTest {

    private Customer customer;

    private List<String> testGroceriesList1 = new ArrayList<>();
    private List<String> testGroceriesList2 = new ArrayList<>();
    private List<String> fullDayGroceries = new ArrayList<>();
    private List<String> someExtraGroceries = new ArrayList<>();

    @Before
    public void setUp() throws Exception{
        customer = new Customer("Sophie", "Mullen");

        testGroceriesList1.add("chocolat");
        testGroceriesList1.add("apple");

        fullDayGroceries.add("chocolat");
        fullDayGroceries.add("apple");
        fullDayGroceries.add("pineapple");
        fullDayGroceries.add("candy");

        someExtraGroceries.add("chocolat");
        someExtraGroceries.add("chocolat");
        someExtraGroceries.add("apple");
    }

    @Test
    public void toString_ReturnsFirstAndSecondName() throws Exception {
        String expected = "Sophie Mullen";
        Assertions.assertThat(customer.toString().equals(expected));
    }

    @Test
    public void testIfGroceriesAreStoredByDay(){
        LocalDate date = LocalDate.now();

        customer.buySomeStuff(testGroceriesList1);
        Assertions.assertThat(customer.getGroceries().get(date)).isEqualTo(testGroceriesList1);
    }

    @Test
    public void testIfGroceriesCanBeDoneMultipleTimesPerDay(){
        LocalDate date = LocalDate.now();

        testGroceriesList2.add("pineapple");
        testGroceriesList2.add("candy");

        customer.buySomeStuff(testGroceriesList1);
        customer.buySomeStuff(testGroceriesList2);

        Assertions.assertThat(customer.getGroceries().get(date)).isEqualTo(testGroceriesList1);
    }

    @Test
    public void testWhichItemCustomerBoughtMost(){
        customer.buySomeStuff(fullDayGroceries);
        customer.buySomeStuff(someExtraGroceries);

        Assertions.assertThat(customer.mostBoughtItem()).isEqualTo("chocolat");
    }

}
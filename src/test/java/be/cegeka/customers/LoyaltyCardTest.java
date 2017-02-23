package be.cegeka.customers;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by pieterst on 23/02/2017.
 */
public class LoyaltyCardTest {
    private LoyaltyCard loyaltyCard;

    @Before
    public void setUp() throws Exception{
        loyaltyCard = new LoyaltyCard("some code",1);
    }

    @Test
    public void toString_ReturnsFirstAndSecondName() throws Exception {
        String expected = "some code1";
        Assertions.assertThat(loyaltyCard.toString().equals(expected));
    }



}

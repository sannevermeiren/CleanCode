package be.cegeka.customers;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public class Customer {

    private String firstName;
    private String lastName;
    private LoyaltyCard loyaltyCard;
    private HashMap<LocalDate, String> groceries = new HashMap<>();

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LoyaltyCard getLoyaltyCard() {

        return loyaltyCard;
    }

    public HashMap<LocalDate, String> getGroceries() {
        return groceries;
    }

    public void setLoyaltyCard(LoyaltyCard loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }

    public String toString(){
        return String.format("%s %s", firstName, lastName);
    }

}


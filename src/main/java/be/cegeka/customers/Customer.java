package be.cegeka.customers;

public class Customer {

    private String firstName;
    private String lastName;
    private LoyaltyCard loyaltyCard;

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

    public String toString(){
        return String.format("%s %s", firstName, lastName);
    }

    public void setLoyaltyCard(LoyaltyCard loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }

    public LoyaltyCard getLoyaltyCard() {

        return loyaltyCard;
    }


}


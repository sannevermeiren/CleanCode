package be.cegeka.customers;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public class Customer {

    private String firstName;
    private String lastName;
    private LoyaltyCard loyaltyCard;
    private HashMap<LocalDate, List<String>> groceries = new HashMap<>();

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

    public HashMap<LocalDate, List<String>> getGroceries() {
        return groceries;
    }

    public void setLoyaltyCard(LoyaltyCard loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }

    public String toString(){
        return String.format("%s %s", firstName, lastName);
    }

    public void buySomeStuff(List<String> groceriesList) {
        LocalDate dateOfBuying = LocalDate.now();

        if (groceries.containsKey(dateOfBuying)){
            for (String item : groceriesList) {
                groceries.get(dateOfBuying).add(item);
            }
        } else {
            groceries.put(dateOfBuying, groceriesList);
        }
    }

    public String mostBoughtItem() {

        HashMap<String, Integer> counterMap = countAllItems();

        return itemWithHighestValue(counterMap);


    }


    private HashMap<String,Integer> countAllItems() {
        HashMap<String, Integer> counter = new HashMap<>();

        for (LocalDate key : groceries.keySet()) {
            List<String> itemsBought = groceries.get(key);
            for (String item : itemsBought) {
                if(counter.containsKey(item)){
                    counter.put(item, new Integer(counter.get(item) + 1));
                } else {
                    counter.put(item, 1);
                }
            }
        }
        return counter;
    }

    private String itemWithHighestValue(HashMap<String, Integer> counterMap) {
        String maxKey = "";
        int maxVal = 0;

        for (String key: counterMap.keySet()) {
            if (counterMap.get(key) > max)

        }
    }
}


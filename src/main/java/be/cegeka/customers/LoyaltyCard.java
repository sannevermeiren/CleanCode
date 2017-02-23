package be.cegeka.customers;

public class LoyaltyCard {

    private String barcode;
    private int bonuspoints;

    public LoyaltyCard() {
    }

    public LoyaltyCard(String barcode, int bonuspoints) {
        this.barcode = barcode;
        this.bonuspoints = bonuspoints;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getBonuspoints() {
        return bonuspoints;
    }
}


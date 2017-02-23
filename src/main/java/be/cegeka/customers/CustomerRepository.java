package be.cegeka.customers;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public Customer searchCustomerByBarCode(String barcode) {

        for (Customer customer : customers) {
            if (customer.getLoyaltyCard().getBarcode().equals(barcode)) {
                return customer;
            }
        }
        return null;
    }


}

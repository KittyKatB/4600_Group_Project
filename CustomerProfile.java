import java.util.ArrayList;

public class CustomerProfile {
    private ArrayList<Customer> customerDatabase;

    // default constructor
    public CustomerProfile() {
        customerDatabase = new ArrayList<Customer>();
    }

    // returns reference to customerDatabase hashmap
    public ArrayList<Customer> getCustomerDatabase() {
        return customerDatabase;
    }

    // Create new customer with user input 
    public void addCustomer(String name, String address, int phone) {
        Customer c = new Customer(name, address, phone);
        customerDatabase.add(c);
    }


}
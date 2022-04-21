import java.util.ArrayList;
import java.util.Scanner;

public class CustomerProfile {
    private ArrayList<Customer> customerDatabase;

    private static int custIDCount = 1;
    private int custID;

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
        Customer c = new Customer(name, address, phone, custID);
        custID++;
        customerDatabase.add(c);
    }


}
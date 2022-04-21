
public class Customer {

    private static int custIDCount = 1;
    private int custID;
    private String name;
    private String address;
    private int phone;

    public Customer() {
        name = "Blank";
        address = "### streetname";
        phone = 1111111111;
        custID = custIDCount;
        custIDCount++;
    }

    public Customer(String name, String address, int phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        custID = custIDCount;
        custIDCount++;
    }

    public String getName() {
        return name;
    }

}

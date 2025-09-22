public class Customer {
    private String customerId;
    private String name;
    private String address;
    private String phone;

    public Customer(String customerId, String name, String address, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("Customer [ID: %s, Name: %s, Address: %s, Phone: %s]",
                customerId, name, address, phone);
    }
}

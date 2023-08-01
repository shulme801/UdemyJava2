public class Customer {

    private String customerName;
    private double creditLimit;
    private String customerEmail;

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public Customer(String customerName, double creditLimit, String customerEmail) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.creditLimit = creditLimit;

    }
}

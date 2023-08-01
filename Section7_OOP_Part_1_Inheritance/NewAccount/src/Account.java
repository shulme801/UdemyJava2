public class Account {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account(String accountNumber, double accountBalance, String customerName, String customerEmail, String customerPhoneNumber) {
        System.out.println("In the constructor with parameters");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void depositFunds(double depositAmount) {
        this.accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + this.accountBalance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (this.accountBalance - withdrawalAmount < 0) {
            System.out.println("Current Balance is $" + this.accountBalance
                    + ". You have insufficient funds for a withdrawal of $"
                    + withdrawalAmount);
        } else {
            this.accountBalance -= withdrawalAmount;
            System.out.println("After withdrawal of $" + withdrawalAmount + " your new balance is $"
                    + this.accountBalance);
        }
    }




}

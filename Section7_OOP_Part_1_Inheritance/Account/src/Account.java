foneNumber     = phone;
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
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

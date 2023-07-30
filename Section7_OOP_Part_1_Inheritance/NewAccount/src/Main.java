public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account("123456", 1000.00,"Sam SelfReferential",
                "myemail@selfreferential.com", "919-555-1212");

        myAccount.depositFunds(250);
        myAccount.withdrawFunds(100.00);
        myAccount.withdrawFunds(150);
        myAccount.depositFunds(100.00);
        myAccount.withdrawFunds(45.55);
        myAccount.withdrawFunds(54.46);
        myAccount.withdrawFunds(54.45);

    }
}

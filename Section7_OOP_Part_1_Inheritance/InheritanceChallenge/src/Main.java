public class Main {
    public static void main(String[] args) {
        Employee stephen = new Employee("Stephen",
                "11/11/1985", "01/01/2020");
        System.out.println(stephen);
        System.out.println("Age = " + stephen.getAge());
        System.out.println("Pay = " + stephen.collectPay());

        SalariedEmployee fred = new SalariedEmployee("Fred Flintstone", "10/11/1952", "01/03/2021", 35000);
        System.out.println(fred);
        System.out.println("Age = " + fred.getAge());
        System.out.println("Fred's Paycheck = " + fred.collectPay());

        fred.retire();
        System.out.println("Fred's Pension Check = $" + fred.collectPay());


    }
}

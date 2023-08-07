public class Main {
    public static void main(String[] args) {
        Employee merrill = new Employee("Merrill",
                "11/11/1985", "01/01/2020");
        System.out.println(merrill);
        System.out.println("Age = " + merrill.getAge());
        System.out.println("Pay = " + merrill.collectPay());

        SalariedEmployee fred = new SalariedEmployee("Fred Flintstone", "04/05/1995", "01/03/2021", 35000);
        System.out.println(fred);
        System.out.println("Age = " + fred.getAge());
        System.out.println("Fred's Paycheck = " + fred.collectPay());

        fred.retire();
        System.out.println("Fred's Pension Check = $" + fred.collectPay());

        HourlyEmployee joe = new HourlyEmployee("Joe", "07/04/1976", "01/01/2019", 15.0, 44);
        System.out.println(joe);
        System.out.println("Joe's Age = " + joe.getAge());
        System.out.println("Joe's Hours Worked This Week = " + joe.getHoursWorked());
        System.out.println("Joe's Paycheck = " + joe.collectPay());

        HourlyEmployee terry = new HourlyEmployee("Terry", "07/24/1986", "01/01/2019", 15.0, 35);
        System.out.println(terry);
        System.out.println("Terry's Age = " + terry.getAge());
        System.out.println("Terry's Hours Worked This Week = " + terry.getHoursWorked());
        System.out.println("Terry's Paycheck = " + terry.collectPay());


    }
}

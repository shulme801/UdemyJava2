public class Main {
    public static void main(String[] args) {
        Employee stephen = new Employee("Stephen",
                "11/11/1985", "01/01/2020");
        System.out.println(stephen);
        System.out.println("Age = " + stephen.getAge());
        System.out.println("Pay = " + stephen.collectPay());

        Employee fred = new Employee("Fred Flintstone", "10/11/1952", "01/03/2021");
        System.out.println(fred);
        System.out.println("Age = " + fred.getAge());
        System.out.println("Pay = " + fred.collectPay());


    }
}

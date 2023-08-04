public class Main {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost()); // total = 38.5

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost()); // total = 36.45

        carpet = new Carpet(2.53);
        floor = new Floor(4.44, 5.65);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost()); // total = 63.46758
    }
}

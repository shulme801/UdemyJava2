import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        do {
            System.out.println("Enter an integer or a non-integer to quit: ");
            String nextNumber = scanner.nextLine();
            try {
            } catch (NumberFormatException nfe) {

            }while (true);

           String input = scanner.nextLine();

            if (input) {
                int inputInt = scanner.parse();
                sum += inputInt;
                counter++;
            }
            else {
                double average = (double) sum / counter;
                System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }


}

import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while(true) {
            System.out.println("Enter a number to sum and average, or a non-number to quit:");
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                sum += number;
                counter++;
            } catch (NumberFormatException nfe){
                System.out.println("Invalid number entered -- exiting");
                double average = (double) sum / counter;
                System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
                break;
            }
        }
    }



}

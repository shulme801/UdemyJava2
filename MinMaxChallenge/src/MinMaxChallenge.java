import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double min = Double.MIN_VALUE;
        double max = Double.MAX_VALUE;
        boolean done = false;


        while (! done) {
            System.out.println("Enter a number or a non-digit character to quit"  + ":");
            String nextNumber = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }
            } catch (NumberFormatException nfe){
                System.out.println("Non-numeric character entered, so quitting");
                done = true;
            }
        }
        System.out.println("Minimum number entered is: " + min);
        System.out.println("Maximum number entered is: " + max);
    }
}

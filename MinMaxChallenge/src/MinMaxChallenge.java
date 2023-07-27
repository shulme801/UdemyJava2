import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double min = 0;
        double max = 0;
        int loopCount = 0;


        do {
                System.out.println("Enter a number or a non-digit character to quit"  + ":");
                String nextInput = scanner.nextLine();
                try {
                    double validNum = Double.parseDouble(nextInput);
                    if ((loopCount == 0) || (validNum < min)) {
                      min = validNum;
                    }
                    if ((loopCount == 0) || (validNum >max)) {
                      max = validNum;
                    }
                    loopCount++;
                } catch (NumberFormatException nfe){
                    System.out.println("Non-numeric character entered, so quitting");
                        break;
                }
        } while (true);

        System.out.println("Minimum number entered is: " + min);
        System.out.println("Maximum number entered is: " + max);
    }
}

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of even digits of number 123456789 is " +
                getEvenDigitSum(123456789));
        System.out.println("Sum of even digits of number 252 is " +
                getEvenDigitSum(252));
        System.out.println("Sum of even digits of number -22 is " +
                getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int evenDigitSum = 0;
        int currentDigit;

        while (number > 0) {
            currentDigit = number % 10;
            if (currentDigit % 2 == 0) {
                evenDigitSum += currentDigit;
            }
            number -= currentDigit;
            number /= 10;
        }
        return evenDigitSum;
    }
}

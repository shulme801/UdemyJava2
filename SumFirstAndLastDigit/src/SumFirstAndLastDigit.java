public class SumFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println("Sum of first and last digits of number 1725 is " +
                sumFirstAndLastDigit(1725));
        System.out.println("Sum of first and last digits of number -1725 is " +
                sumFirstAndLastDigit(-1725));
        System.out.println("Sum of first and last digits of number 252 is " +
                sumFirstAndLastDigit(252));
        System.out.println("Sum of first and last digits of number 5 is " +
                sumFirstAndLastDigit(5));
        System.out.println("Sum of first and last digits of number 7 is " +
                sumFirstAndLastDigit(7));
        System.out.println("Sum of first and last digits of number 23 is " +
                sumFirstAndLastDigit(23));
        System.out.println("Sum of first and last digits of number 12345667 is " +
                sumFirstAndLastDigit(12345667));
        System.out.println("Sum of first and last digits of number 0 is " +
                sumFirstAndLastDigit(0));
        System.out.println("Sum of first and last digits of number 10 is " +
                sumFirstAndLastDigit(10));
    }


    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10, firstDigit;

        firstDigit = lastDigit;  // If number is a single digit, this stmt will return lastDigit*2
        number -= lastDigit;

        while (number > 0) {
            firstDigit = number % 10;
            number = number / 10;
        }

        return (firstDigit + lastDigit);
    }
}

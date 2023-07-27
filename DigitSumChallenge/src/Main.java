public class Main {
    public static void main(String[] args) {

        System.out.println("If input is 125 then the sum of its digits is " + sumDigits(125));
        System.out.println("If input is 1225 then the sum of its digits is " + sumDigits(1225));
        System.out.println("If input is 1000 then the sum of its digits is " + sumDigits(1000));
        System.out.println("If input is 1234 then the sum of its digits is " + sumDigits(1234));
        System.out.println("If input is 108 then the sum of its digits is " + sumDigits(108));
        System.out.println("If input is 32123 then the sum of its digits is " + sumDigits(32123));
        System.out.println("If input is 17 then the sum of its digits is " + sumDigits(17));
        System.out.println("If input is 1 then the sum of its digits is " + sumDigits(1));
        System.out.println("If input is 5 then the sum of its digits is " + sumDigits(5));
        System.out.println("If input is 0 then the sum of its digits is " + sumDigits(0));
        System.out.println("If input is -1234 then the sum of its digits is " + sumDigits(-1234));
    }

    public static int sumDigits(int number) {

        if (number <0) {
            return -1;
        }

        int sumOfDigits = 0;


        while (number > 0) {
            sumOfDigits += number % 10; // Add the least significant remaining digit to the sum
            number /= 10; // And drop the least significant digit
        }

        return(sumOfDigits);

    }
}

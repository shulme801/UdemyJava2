public class NumberToWords {
    public static void main(String[] args) {
        int num;

        num = 12300;
        numberToWords(num);

        num = 1010;
        numberToWords(num);

        num = 0;
        numberToWords(num);

        num = -2521;
        numberToWords(num);


    }

    public static int getDigitCount(int number){

     if (number < 0) {
        return -1;
     }

     int digitCount=0;

     do  {
            number = number / 10; // peel off least significant digit
            digitCount++;
     } while (number != 0);

     return digitCount;
    }
    public static int reverse(int number) {

        int numDigits;

        numDigits = getDigitCount(number);
        if (numDigits < 0) {
            return -1;
        }

        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number *= -1; // get absolute value
        }

        int maxFactor = 1;
        for (int i = numDigits-1; i > 0; i--) {
            maxFactor *= 10;
        }

        int reverso = 0;
        int factor = maxFactor;
        int digit;

        while (number > 0) {
            digit = number % 10;
            number = number / 10; //  peel off least significant digit
            reverso += (digit * factor);
            factor /= 10;
        }

        if (isNegative) {
            reverso *= -1;
        }
        return reverso;
    }
    public static void numberToWords(int number) {

            int oldDigitCount = getDigitCount(number);
            number = reverse(number);
            if (number < 0) {
                System.out.println("Invalid Value");
                return;
            }
            int newDigitCount = getDigitCount(number);
            int zeroes = oldDigitCount - newDigitCount;
            int digit;
            do {
                digit = number % 10;
                String numToWord = switch (digit) {
                    case 0 : yield "Zero";
                    case 1 : yield "One";
                    case 2 : yield "Two";
                    case 3 : yield "Three";
                    case 4 : yield "Four";
                    case 5 : yield "Five";
                    case 6 : yield "Six";
                    case 7 : yield "Seven";
                    case 8 : yield "Eight";
                    case 9 : yield "Nine";
                    default: yield "Invalid Input!";
                };
                System.out.println(numToWord);
                number /= 10;
            } while (number > 0);

            for (int i = 1; i <= zeroes; i++) {
                System.out.println("Zero");
            }
            System.out.println("\n");
    }

}

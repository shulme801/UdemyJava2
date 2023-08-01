public class SharedDigitExercise {
    public static void main(String[] args) {
        String outString;

        outString = "12,23"+ (hasSharedDigit(12,22) ? " have a shared digit" : " do not have a shared digit");
        System.out.println(outString);

        outString = "9,99"+ (hasSharedDigit(9, 99) ? " have a shared digit" : " do not have a shared digit");
        System.out.println(outString);

        outString = "56,75"+ (hasSharedDigit(56, 75) ? " have a shared digit" : " do not have a shared digit");
        System.out.println(outString);

        outString = "43,25"+ (hasSharedDigit(43, 25) ? " have a shared digit" : " do not have a shared digit");
        System.out.println(outString);
    }

    public static boolean inRange(int number) {
        return ((number >= 10) && (number <= 99));
    }
    public static boolean hasSharedDigit(int num1, int num2) {
        if (( inRange(num1)) && (inRange(num2))) {
           int rightDigitFirstNum = num1 % 10;
           int leftDigitFirstNum = (num1 - rightDigitFirstNum) / 10;
           int rightDigitSecondNum = num2 % 10;
           int leftDigitSecondNum = (num2 - rightDigitSecondNum) / 10;
           return ((leftDigitFirstNum == leftDigitSecondNum) || (leftDigitFirstNum == rightDigitSecondNum) ||
                   (rightDigitFirstNum == leftDigitSecondNum) || (rightDigitFirstNum == rightDigitSecondNum));
        }
        System.out.println("Invalid Value Input");
        return false;
    }
}

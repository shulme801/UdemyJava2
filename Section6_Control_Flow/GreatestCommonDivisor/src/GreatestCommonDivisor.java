public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int firstNum  = 12;
        int secondNum = 30;
        System.out.println("Greatest Common Factor of " + firstNum + " and " + secondNum + " is " +
                            getGreatestCommonDivisor(firstNum, secondNum));
        firstNum = 25;
        secondNum = 15;
        System.out.println("Greatest Common Factor of " + firstNum + " and " + secondNum + " is " +
                getGreatestCommonDivisor(firstNum, secondNum));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if ((first >=10) && (second >= 10)) {
            int remainder;
            while (first != 0) {
                remainder = second % first;
                second = first;
                first = remainder;
            }
            return second;
        }

        return -1;
    }
}

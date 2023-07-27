public class PerfectNumber {
    public static void main(String[] args) {
        int num = 33550336;
        String outString = (isPerfectNumber(num) ? " is a perfect number" : " is not a perfect number");
        System.out.println(num + outString);
    }

    public static boolean isPerfectNumber(int number) {

        int sumFactors;


        if (number >= 1) {
            sumFactors = 1;  // all integers are evenly divisible by 1, so we will start the loop at 2
            for (int i = 2; i <= number/2; i++) {
                if (number % i == 0) {
                    sumFactors += i;
                    if (sumFactors == number) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

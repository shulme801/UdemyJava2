public class LargestPrime {
    public static void main(String[] args) {
        int[] testData = {12,9,217,0,1,2,45,-1,31};

        for (int i=0; i <= testData.length - 1; i++){
            System.out.println("Largest prime factor of " + testData[i] + " is " +
                               getLargestPrime((testData[i])));
        }
    }

    public static int getLargestPrime(int number) {

        if (number < 2) {
            // 2 is the smallest possible prime number.  Negative numbers, 0, and 1 do not have exactly
            // two positive factors.
            return -1;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                // current value of number is evenly divisible by i, so we know that i is a factor.
                // so divide number by that factor,  and reset number to that dividend so we can see whether we can
                // break it down further.
                number /= i;
                i--; //and decrement i so we are guaranteed to go back through this logic at least one more time
            }
        }
        return number;
    }
}

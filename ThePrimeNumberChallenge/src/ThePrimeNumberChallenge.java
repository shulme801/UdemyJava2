public class ThePrimeNumberChallenge {

        public static void main(String[] args) {

            int primeCount = 0;
            String primeRange = "range -1 to 100";

            for (int i = -1; i <= 100; i++){
                if (isPrime(i)) {
                    System.out.println(i + " is a prime number");
                    primeCount++;
                }
            }
            System.out.println("Found " + primeCount + " prime numbers in "+ primeRange);

        }

        public static boolean isPrime(int wholeNumber) {
            // Determine whether input parameter wholeNumber is prime.

            if (wholeNumber < 2){
                return false;
            }

            for (int divisor = 2; divisor <= wholeNumber/2; divisor++){
                if (wholeNumber % divisor == 0){
                    // prime numbers have to have exactly two factors: 1 and the wholeNumber itself.  If there's any other
                    // factor by which the number is evenly divisible, then it's not prime.
                    return false;
                }
            }
            return true;
        }

}

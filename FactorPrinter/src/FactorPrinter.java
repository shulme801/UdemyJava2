public class FactorPrinter {

    public static void main(String[] args) {
        System.out.println("Factors of 6 are ");
        printFactors(6);
        System.out.println("Factors of 32 are ");
        printFactors(32);
        System.out.println("Factors of 10 are ");
        printFactors(10);
        System.out.println("Factors of -1 are ");
        printFactors(-1);
        System.out.println("Factors of 100 are ");
        printFactors(100);
        System.out.println("Factors of 17 are ");
        printFactors(17);

    }

    public static void printFactors(int number) {

        if (number < 1 ) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

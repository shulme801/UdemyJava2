public class OddEven {

        public static void main(String[] args) {
            String sumRange = "5:20";

            oddsAndEvensWhile(4,20, sumRange);
            oddsAndEvensDoWhile(4, 20, sumRange);

        }


        public static boolean isOddNumber(int num) {
            return (num % 2 != 0);
        }

        public static void oddsAndEvensWhile (int startNum, int finishNum, String range) {


            int oddCount  = 0;
            int evenCount = 0;

            int i = startNum;
            while (i < finishNum) {
                i++;
                if (isOddNumber(i)) {
                    System.out.println(i + " is odd!");
                    oddCount++;
                    continue;
                }
                System.out.println(i + " is even!");
                evenCount++;
            }

            printCounts(oddCount, evenCount, range);

        }
        public static void oddsAndEvensDoWhile (int startNum, int finishNum, String range) {


            int oddCount  = 0;
            int evenCount = 0;

            int i = startNum;
            do {
                i++;
                if (isOddNumber(i)) {
                    System.out.println(i + " is odd!");
                    oddCount++;
                    continue;
                }
                System.out.println(i + " is even!");
                evenCount++;

            } while (i  < finishNum);

            printCounts(oddCount, evenCount, range);
        }

        public static void printCounts( int oddCount, int evenCount, String range){
            System.out.println(("Count of odd numbers in range " + range + " is " + oddCount));
            System.out.println(("Count of even numbers in range " + range + " is " + evenCount));
        }



}

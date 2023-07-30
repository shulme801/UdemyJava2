public class DiagonalStar {
    public static void main(String[] args) {
        int[] testData = {5,8,9,69,4};

        for (int i : testData) {
            printSquareStar(i);
        }
    }

    public static void printSquareStar(int number){
        if (number < 5) {
            System.out.println("\nInvalid Value");
        } else {
            System.out.println();
            System.out.println();

            for (int currentRow=1; currentRow <= number; currentRow++) {
                for (int currentCol = 1; currentCol <= number; currentCol++) {
                    if ((currentRow == 1) || (currentRow == number)) { // this is the first or last row, so print a star
                        System.out.print("*");
                        continue;
                    }
                    if ((currentCol == 1) || (currentCol == number)) { // this is the first or last col, so print a star
                        System.out.print("*");
                        continue;
                    }
                    if (currentRow == currentCol) {
                        System.out.print("*"); // row and column number are the same, so print a star
                        continue;
                    }
                    if (currentCol == (number - currentRow + 1)) {
                        System.out.print("*"); //
                        continue;
                    }
                    System.out.print(" "); // Otherwise, print a space
                }
                System.out.println();
            }
        }


    }

}

public class PrintInfo {

        public static void printStringInfo(String string) {

            int length = string.length();
            System.out.printf("Length = %d %n", length);
            if (length == 0) {
                System.out.println("Empty String passed into printStringInfo");
                return;
            }

            if (string.isBlank()) {
                System.out.println("String is blank");
                return;
            }

            System.out.printf("First char = %c %n", string.charAt(0));
            System.out.printf("Char at position %d is %c %n", length - 2,string.charAt(length-1));

        }
}

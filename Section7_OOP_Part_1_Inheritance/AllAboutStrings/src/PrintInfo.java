public class PrintInfo {

        public static void printStringInfo(String string) {

            int length = string.length();
            System.out.printf("Length = %d %n", length);
            System.out.printf("First char = %c %n", string.charAt(0));
            System.out.printf("Char at position %d is %c %n", length - 2,string.charAt(length-1));

        }
}

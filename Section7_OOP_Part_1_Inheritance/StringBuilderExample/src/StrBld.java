public class StrBld {

    public static void printInformation(String string) {

        System.out.println("String = " + string);
        System.out.println("String's length = " + string.length());

    }

    public static void printInformation(StringBuilder builder) {

        System.out.println("StringBuilder = " + builder);
        System.out.println("String's length = " + builder.length());

    }
}

public class Main {
    public static void main(String[] args) {

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");
        StrBld.printInformation( helloWorld); // won't add the " and Goodbye" because a String is immutable

        String newHello = new String(helloWorld.concat(" and Goodbye")); // Now, create a new (immutable) String
        StrBld.printInformation(newHello); // won't add the " and Goodbye" because a String is immutable

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");
        StrBld.printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder(); // capacity will be the default of 16 chars
        emptyStart.append("a".repeat(57));

        StringBuilder emptyStart32 = new StringBuilder(32); // boost capacity to 32 chars
        emptyStart32.append("a".repeat(17));

        StrBld.printInformation(emptyStart);
        StrBld.printInformation(emptyStart32);

    }
}

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

    }
}

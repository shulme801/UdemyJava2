public class Main {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n\t• First Point\n\t\t• Sub Point";
        System.out.println(bulletIt);

        String textBlockExample = """
                Print a Bulleted List:
                \t• First Point
                \t\t• Sub Point
                """;
        System.out.println(textBlockExample);

        int age = 35;
        System.out.printf("Your age is %d%n", age); // %d is a "format specifier"

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Year of Birth = %d%n", age, yearOfBirth);

        System.out.printf("Your floating number age is %.2f%n", (float) age);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %.2f %n", (float) i);
        }

        for (int i = 1; i <= 1000000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }
    }
}

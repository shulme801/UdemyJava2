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
    }
}

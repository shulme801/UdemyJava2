public class Main {
    public static void main(String[] args) {

        String helloWorld = "Hello World!";
        PrintInfo.printStringInfo(helloWorld);

        System.out.printf("%n");

        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("first index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("last index of l = %d %n", helloWorld.lastIndexOf('l'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));



        String emptyString = "";
        PrintInfo.printStringInfo(emptyString);
        String blankString = "\t\t\n";
        PrintInfo.printStringInfo(blankString);

    }
}

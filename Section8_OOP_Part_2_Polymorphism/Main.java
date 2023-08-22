public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        // Let's try out the microwave, using the overloaded setKitchenState method.
        System.out.printf("%nAdded the %s appliance%n", "Old fashioned Amana RadarRange");
        kitchen.setKitchenState(true, true, false, true);
        kitchen.doKitchenWork();

        // Clean up the SmartKitchen using the overloaded, three appliance, setKitchenState.
        kitchen.setKitchenState(false, false, true);
        kitchen.doKitchenWork();

    }
}

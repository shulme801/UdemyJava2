public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getOxo().setHasWorkToDo(true);
//        kitchen.getKitchenAid().setHasWorkToDo(false);
//        kitchen.getBosch().setHasWorkToDo(true);
//
//        kitchen.getBosch().WashDishes();
//        kitchen.getKitchenAid().orderFood();
//        kitchen.getOxo().brewCoffee();
//

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }
}

public class SmartKitchen {
    // This challenge uses composition only.  Nothing is inherited from the parent class.  The advantage
    // is this: the calling code needs to know nothing about the details of the appliances in the
    // SmartKitchen.  An appliance can be added without changing the calling code in Main.java.
    private final CoffeeMaker oxo;
    private final Refrigerator kitchenAid;
    private final DishWasher bosch;

    public SmartKitchen() {
        // Create the appliances
        oxo        = new CoffeeMaker();
        kitchenAid = new Refrigerator();
        bosch      = new DishWasher();
    }


    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishwasherFlag) {
        // See which appliances need to do the work.
        oxo.setHasWorkToDo(coffeeFlag);
        bosch.setHasWorkToDo(fridgeFlag);
        kitchenAid.setHasWorkToDo(dishwasherFlag);


    }

    public void doKitchenWork() {
        oxo.brewCoffee();
        kitchenAid.orderFood();
        bosch.WashDishes();
    }

}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {

        if (hasWorkToDo) {
            System.out.println("Brewing Coffee!!");
            hasWorkToDo = false;
        }
    }

}

class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {

        if (hasWorkToDo) {
            System.out.println("Ordering Food!!");
            hasWorkToDo = false;
        }
    }

}

class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void WashDishes() {

        if (hasWorkToDo) {
            System.out.println("Washing Dishes!!");
            hasWorkToDo = false;
        }
    }

}
public class SmartKitchen {
    // This challenge uses composition only.  Nothing is inherited from the parent class.  The advantage
    // is this: the calling code needs to know nothing about the details of the appliances in the
    // SmartKitchen.  An appliance can be added without changing the calling code in Main.java.

    // Making these appliances into constants with the "final" keyword, since we never change their values.
    private final CoffeeMaker oxo;
    private final Refrigerator kitchenAid;
    private final DishWasher bosch;
    private final Microwave radarRange;

    public SmartKitchen() {
        // Create the appliances
        oxo        = new CoffeeMaker();
        kitchenAid = new Refrigerator();
        bosch      = new DishWasher();
        radarRange = new Microwave();
    }


    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishwasherFlag) {
        // See which appliances need to do the work.
        oxo.setHasWorkToDo(coffeeFlag);
        bosch.setHasWorkToDo(dishwasherFlag);
        kitchenAid.setHasWorkToDo(fridgeFlag);

    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishwasherFlag, boolean microwaveFlag) {
        // See which appliances need to do the work.
        oxo.setHasWorkToDo(coffeeFlag);
        bosch.setHasWorkToDo(dishwasherFlag);
        kitchenAid.setHasWorkToDo(fridgeFlag);
        radarRange.setHasWorkToDo(microwaveFlag);

    }

    public void doKitchenWork() {
        oxo.brewCoffee();
        kitchenAid.orderFood();
        bosch.WashDishes();
        radarRange.cookFood();
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

class Microwave {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void cookFood() {

        if (hasWorkToDo) {
            System.out.println("Cooking Food!!");
            hasWorkToDo = false;
        }
    }

}
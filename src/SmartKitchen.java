public class SmartKitchen {
    private CoffeeMaker oxo;
    private Refrigerator kitchenAid;
    private DishWasher bosch;

    public SmartKitchen() {
        oxo = new CoffeeMaker();
        kitchenAid = new Refrigerator();
        bosch = new DishWasher();
    }

    public CoffeeMaker getOxo() {
        return oxo;
    }

    public Refrigerator getKitchenAid() {
        return kitchenAid;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishwasherFlag) {

        oxo.setHasWorkToDo(coffeeFlag);
        bosch.setHasWorkToDo(fridgeFlag);
        kitchenAid.setHasWorkToDo(dishwasherFlag);


    }

    public void doKitchenWork() {
        oxo.brewCoffee();
        kitchenAid.orderFood();
        bosch.WashDishes();
    }

    public DishWasher getBosch() {
        return bosch;
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
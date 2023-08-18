public class SmartKitchen {
    private CoffeeMaker oxo;
    private Refrigerator kitchenAid;
    private Dishwaher bosch;
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

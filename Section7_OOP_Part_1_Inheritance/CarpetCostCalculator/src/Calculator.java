public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        // The code will work fine without "this", but I'm a suspenders-and-belt programmer
        return (this.floor.getArea() * this.carpet.getCost());
    }
}

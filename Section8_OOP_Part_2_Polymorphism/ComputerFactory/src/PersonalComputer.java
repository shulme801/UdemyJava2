public class PersonalComputer extends Product{

    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherBoard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, Motherboard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        motherBoard.loadProgram("Windows OS");
        drawLogo();
    }

}

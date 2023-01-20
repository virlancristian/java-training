package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        ConsoleInputReader inputReader = new ConsoleInputReader();
        inputReader.readInput();

        CarListDisplayer displayer = new CarListDisplayer(inputReader.getCarCollection());

        displayer.displayList();
    }
}

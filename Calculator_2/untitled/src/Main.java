public class Main {



    public static void main(String[] args) {
        View view = new View(new CalculatorWithLogger (new Calculator()));
        view.run();
    }
}
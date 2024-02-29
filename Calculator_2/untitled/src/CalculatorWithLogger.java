public class CalculatorWithLogger implements Calculable {

    private final Calculable calculable;

    public CalculatorWithLogger(Calculable calculable) {
        this.calculable = calculable;
    }

    @Override
    public void sum(ComplexNumber a, ComplexNumber b) {
        System.out.printf("Сложение  %s и %s", a, b);
        calculable.sum(a, b);
        System.out.println();
        System.out.printf("Результат сложения: = %s", result());
    }

    @Override
    public void multiply(ComplexNumber a, ComplexNumber b) {
        System.out.printf("Умножение  %s на %s", a, b);
        calculable.multiply(a, b);
        System.out.println();
        System.out.printf("Результат умножения: = %s", result());
    }

    @Override
    public void divide(ComplexNumber a, ComplexNumber b) {
        System.out.printf("Деленеие числа  %s на число %s", a, b);
        calculable.divide(a, b);
        System.out.println();
        System.out.printf("Результат деления: = %s", result());
    }

    @Override
    public ComplexNumber result() {
        return calculable.result();
    }

    @Override
    public void clear() {
        System.out.println();
        System.out.println("Clearing ");
        calculable.clear();
    }
}

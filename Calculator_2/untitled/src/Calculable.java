public interface Calculable {
    void sum(ComplexNumber a, ComplexNumber b);

    void multiply(ComplexNumber a, ComplexNumber b);

    void divide(ComplexNumber a, ComplexNumber b);

    ComplexNumber result();

    void clear();
}

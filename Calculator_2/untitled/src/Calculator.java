public class Calculator implements Calculable {
    private ComplexNumber result;

    public Calculator() {
    }

    @Override
    public void sum(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getReal() + b.getReal();
        double imaginaryPart = a.getImaginary() + b.getImaginary();
        result = new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public void multiply(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginaryPart = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        result = new ComplexNumber(realPart, imaginaryPart);


    }

    @Override
    public void divide(ComplexNumber a, ComplexNumber b) {
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double realPart = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double imaginaryPart = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        result = new ComplexNumber(realPart, imaginaryPart);
    }


    @Override
    public ComplexNumber result() {

        return result;
    }

    @Override
    public void clear() {
        this.result = null;
    }

}

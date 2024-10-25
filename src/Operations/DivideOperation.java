package Operations;

public class DivideOperation implements Operation {
    public double execute(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero");
        } else {
            return a / b;
        }
    }
}

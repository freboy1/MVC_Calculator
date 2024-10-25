import Operations.*;

public class OperationFactory {
    public static Operation getOperation(String operator) {
        switch (operator) {
            case "+":
                return new AddOperation();
            case "-":
                return new SubtractOperation();
            case "*":
                return new MultiplyOperation();
            case "/":
                return new DivideOperation();
            default:
                throw new IllegalArgumentException("Unknown operation");
        }
    }
}

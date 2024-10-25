import Operations.Operation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView view;

    public CalculatorController(CalculatorView view) {
        this.view = view;

        view.addOperationListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double firstNumber = view.getFirstNumber();
                    double secondNumber = view.getSecondNumber();
                    String operator = e.getActionCommand();

                    Operation operation = OperationFactory.getOperation(operator);
                    double result = operation.execute(firstNumber, secondNumber);
                    view.setResult(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    view.setResult("Ошибка: некорректный ввод");
                } catch (ArithmeticException ex) {
                    view.setResult(ex.getMessage());
                }
            }
        });
    }
}

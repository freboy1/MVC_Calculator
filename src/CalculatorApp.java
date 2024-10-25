
public class CalculatorApp {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();

        // Создание контроллера с передачей представления
        new CalculatorController(view);

        // Устанавливаем видимость окна
        view.setVisible(true);
    }
}
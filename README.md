Calculator App
This is a simple calculator application built with Java Swing, implementing the Model-View-Controller (MVC) design pattern. The calculator supports basic arithmetic operations like addition, subtraction, multiplication, and division.

Features
Basic Operations: Supports addition, subtraction, multiplication, and division.
Error Handling:
Displays an error message when attempting to divide by zero.
Shows an error message if non-numeric input is entered.
Modular Structure: Code is organized according to the MVC pattern for clear separation of logic, interface, and control.
Expandable: New operations can be added without modifying the controller, thanks to the use of the Factory Pattern.
Project Structure
Model: Contains the business logic and performs calculations.
View: Manages the graphical user interface.
Controller: Acts as a bridge between the Model and the View, processing user actions and updating the view accordingly.
Classes
CalculatorModel:

Contains methods for each arithmetic operation: add, subtract, multiply, and divide.
Handles division-by-zero errors.
CalculatorView:

Provides the interface with two input fields, operation buttons, and a result display.
Allows users to enter numbers and select an operation.
CalculatorController:

Processes user actions from the CalculatorView and calls the relevant methods from CalculatorModel.
Updates the view with results or error messages.
OperationFactory:

Uses the Factory Pattern to create and manage operation classes dynamically.
Allows easy addition of new operations by adding new classes without changing the controller.
CalculatorApp:

Main class that initializes the MVC components and starts the application.
Installation and Setup
Clone the Repository:

bash
Copy code
git clone https://github.com/yourusername/calculator-app.git
cd calculator-app
Compile and Run:

Open the project in an IDE (like IntelliJ IDEA, Eclipse, or NetBeans) or compile from the terminal.
To run from the terminal, navigate to the project directory and execute:
bash
Copy code
javac CalculatorApp.java
java CalculatorApp

public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(4, 5);

        ComplexCalculator calculator = new ComplexCalculator();

        ComplexOperation addition = new LoggingOperationDecorator(new ComplexAddition());
        ComplexOperation multiplication = new LoggingOperationDecorator(new ComplexMultiplication());
        ComplexOperation division = new LoggingOperationDecorator(new ComplexDivision());

        System.out.println("Сложение: " + calculator.calculate(addition, num1, num2));
        System.out.println("Умножение: " + calculator.calculate(multiplication, num1, num2));
        System.out.println("Деление: " + calculator.calculate(division, num1, num2));
    }
}
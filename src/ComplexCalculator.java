public class ComplexCalculator {
//    Калькулятор(использование паттерна Factory)
    public ComplexNumber calculate(ComplexOperation operation, ComplexNumber a, ComplexNumber b) {
        return operation.execute(a, b);
    }
}
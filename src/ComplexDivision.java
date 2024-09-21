public class ComplexDivision implements ComplexOperation {
//    Класс для деления
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        double denominator = Math.pow(b.getReal(), 2) + Math.pow(b.getImaginary(), 2);
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        return new ComplexNumber(real, imaginary);
    }
}
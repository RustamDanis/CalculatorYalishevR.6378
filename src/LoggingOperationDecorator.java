import java.util.logging.Logger;

//Логирование(Использование паттерна Decorator)
public class LoggingOperationDecorator implements ComplexOperation {
    private final ComplexOperation wrappedOperation;
    private static final Logger logger = Logger.getLogger(LoggingOperationDecorator.class.getName());

    public LoggingOperationDecorator(ComplexOperation operation) {
        this.wrappedOperation = operation;
    }

    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        logger.info("Выполнение операции: " + wrappedOperation.getClass().getSimpleName());
        logger.info("Операнды: " + a + ", " + b);
        ComplexNumber result = wrappedOperation.execute(a, b);
        logger.info("Результат: " + result);
        return result;
    }
}
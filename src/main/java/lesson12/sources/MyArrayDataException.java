package lesson12.sources;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(String message) {
        super(message);
    }

    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

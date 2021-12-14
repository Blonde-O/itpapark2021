package lesson12.sources.exceptions;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

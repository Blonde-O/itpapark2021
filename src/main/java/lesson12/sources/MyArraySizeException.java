package lesson12.sources;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

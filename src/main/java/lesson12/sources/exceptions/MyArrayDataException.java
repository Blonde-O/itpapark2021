package lesson12.sources.exceptions;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(String s) {
        super(s);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

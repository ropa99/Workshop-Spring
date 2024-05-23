package se.lexicon.SpringWorkshop.exception;

public class StudentValidationException extends RuntimeException{
    public StudentValidationException(String message) {
        super(message);
    }

    public StudentValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}

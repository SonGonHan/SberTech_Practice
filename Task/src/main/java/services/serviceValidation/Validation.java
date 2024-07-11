package services.serviceValidation;

public interface Validation<T> {
    boolean requestValidation(T str);

    boolean responseValidation(T str);
}

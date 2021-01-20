package Exception;

// extends Exception or RuntimeException
public class CustomException extends Exception {

    public CustomException() {
        super();
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public static void main(String[] args) throws Exception {
        throw new CustomException("Custom Error", new Throwable("Error happens with..."));
    }
}

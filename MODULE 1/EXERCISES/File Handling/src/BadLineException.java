public class BadLineException extends Exception {
    private String errorMessage;

    public BadLineException(String errorMessage) {
        super(errorMessage);
//        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}

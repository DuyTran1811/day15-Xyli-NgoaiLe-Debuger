package BT1;

public class IllegalTriangleException extends Exception {
    private String IllegalTriangleException;

    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String illegalTriangleException) {
        IllegalTriangleException = illegalTriangleException;
    }

    @Override
    public String getMessage() {
        return IllegalTriangleException;
    }
}

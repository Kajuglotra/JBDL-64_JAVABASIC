package exception;

public class CustomExceptionDemo extends RuntimeException {
    public CustomExceptionDemo(String msg){
        super(msg);
    }
}

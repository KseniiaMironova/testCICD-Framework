package exceptions;

public class NoSuchBrowserTypeExceptions extends Throwable {
    public NoSuchBrowserTypeExceptions() {
        System.out.println("construction");
        getMessage();
    }

    @Override
    public String getMessage() {
       return "Incorrect browser type name";
    }
}

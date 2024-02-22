package lesson12;


public class MyEvent extends java.util.EventObject {
    private static final long serialVersionUID = 1L;
    private String message;
    
    public MyEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }
}


    


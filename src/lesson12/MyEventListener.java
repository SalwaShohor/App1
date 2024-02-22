package lesson12;

// Listener interface
public interface MyEventListener extends java.util.EventListener {
    void processEvent(MyEvent event);
}

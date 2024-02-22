package lesson12;

// Event listener class
public class MyEventListenerImpl implements MyEventListener {
    public void processEvent(MyEvent event) {
        System.out.println("Received event: " + event.getMessage());
    }
}

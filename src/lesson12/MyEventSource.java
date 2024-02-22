package lesson12;

// Event source class
public class MyEventSource {
    private java.util.List<MyEventListener> listeners = new java.util.ArrayList<MyEventListener>();
    
    public void addMyEventListener(MyEventListener listener) {
        listeners.add(listener);
    }
    
    public void removeMyEventListener(MyEventListener listener) {
        listeners.remove(listener);
    }
    
    protected void fireMyEvent(String message) {
        MyEvent event = new MyEvent(this, message);
        for (MyEventListener listener : listeners) {
            listener.processEvent(event);
        }
    }
}

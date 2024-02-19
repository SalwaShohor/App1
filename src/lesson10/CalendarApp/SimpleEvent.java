package lesson10.CalendarApp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// The SimpleEvent class is an implementation of the Event abstract class, representing a simple, non-recurring event in the calendar application.
// It provides the implementation for the abstract method in the Event class, defining how the event details are retrieved.

public class SimpleEvent extends Event {
    // Constructor and implementation of abstract method
    private String eventLocation;

    public SimpleEvent(String eventName, LocalDate eventDate, String eventLocation) {
        super(eventName, eventDate);
        this.eventLocation = eventLocation;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    @Override
    public String getEventDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");
        return "Event: " + getEventName() + " on " + getEventDate().format(formatter) + " at " + eventLocation;
    }

    
}

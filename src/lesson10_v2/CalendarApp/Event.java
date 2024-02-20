package lesson10_v2.CalendarApp;
import java.io.Serializable;
import java.time.LocalDate;


// abstract class for event

// The Event class is an abstract class that serves as the base for all types of events in the calendar application.
// It contains properties for the event name and date, along with methods to access these properties.
// The class also includes an abstract method for getting event details, which must be implemented by its subclasses.

public abstract class Event implements Serializable {
    private String eventName;
    private LocalDate eventDate;
    private String eventVenue;

    public Event(String eventName, LocalDate eventDate, String eventVenue) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventVenue = eventVenue;
    }

    public String getEventName() {
        return eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public abstract String getEventDetails();


}

interface Recurring {
    String getRecurrencePattern();
}

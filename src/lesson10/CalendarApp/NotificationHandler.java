package lesson10.CalendarApp;

// The NotificationHandler class is responsible for handling event notifications within the calendar application.
// It contains a method showNotification that displays a notification message using a dialog box from the Swing library.
import javax.swing.JOptionPane;

public class NotificationHandler {
    public void showNotification(String message) {
        JOptionPane.showMessageDialog(null, message, "Notification", JOptionPane.INFORMATION_MESSAGE);
    }
}

package lesson10_v2.CalendarApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EventDateForm extends JFrame {
    private JTextField eventNameField;
    private JTextField eventDateField;
    private JTextField eventVenueField;
    private JButton submitButton;

    public EventDateForm() {
        eventNameField = new JTextField(20);
        eventDateField = new JTextField(20);
        eventVenueField = new JTextField(20);
        submitButton = new JButton("Submit");

        // Change this section in EventDateForm.java
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eventName = eventNameField.getText();
                String eventDateString = eventDateField.getText();
                LocalDate eventDate = LocalDate.parse(eventDateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                String eventVenue = eventVenueField.getText();

                DatabaseHelper.insertEventIntoDatabase(eventName, eventDate, eventVenue);

                // Use NotificationHandler to show a success message
                NotificationHandler notificationHandler = new NotificationHandler();
                notificationHandler.showNotification("Data has been successfully inserted into the database.");

                JOptionPane.showMessageDialog(null, "Event details submitted:\nName: " + eventName + "\nDate: " + eventDate + "\nVenue: " + eventVenue, "Confirmation", JOptionPane.INFORMATION_MESSAGE);
            }
        });


        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("Event Name:"));
        panel.add(eventNameField);
        panel.add(new JLabel("Event Date (YYYY-MM-DD):"));
        panel.add(eventDateField);
        panel.add(new JLabel("Event Venue:"));
        panel.add(eventVenueField);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(submitButton);

        add(panel);

        setTitle("Event Date Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            EventDateForm eventDateForm = new EventDateForm();
            eventDateForm.setVisible(true);
        });
    }
}

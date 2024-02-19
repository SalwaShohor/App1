package lesson10.CalendarApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EventDateForm extends JFrame {
    private JTextField eventNameField;
    private JTextField eventDateField;
    private JButton submitButton;

    public EventDateForm() {
        eventNameField = new JTextField(20);
        eventDateField = new JTextField(20);
        submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eventName = eventNameField.getText();
                String eventDateString = eventDateField.getText();
                LocalDate eventDate = LocalDate.parse(eventDateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                // Process the event data (e.g., create a new event object, save it, etc.)
                // Example: Event newEvent = new Event(eventName, eventDate);

                // Display a confirmation message
                JOptionPane.showMessageDialog(null, "Event details submitted:\nName: " + eventName + "\nDate: " + eventDate, "Confirmation", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Event Name:"));
        panel.add(eventNameField);
        panel.add(new JLabel("Event Date (YYYY-MM-DD):"));
        panel.add(eventDateField);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(submitButton);

        add(panel);

        setTitle("Event Date Form");
        setSize(300, 150);
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

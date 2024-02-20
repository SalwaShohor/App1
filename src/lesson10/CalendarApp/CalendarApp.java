package lesson10.CalendarApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CalendarApp extends JFrame {
    private List<Event> events;
    private DefaultListModel<String> eventListModel;
    private JList<String> eventList;
    private JTextField eventNameField;
    private JTextField eventDateField;
    private JTextField eventLocationField;
    private JButton submitButton;

    public CalendarApp() {
        events = new ArrayList<>();
        eventListModel = new DefaultListModel<>();
        eventList = new JList<>(eventListModel);
        eventList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        eventNameField = new JTextField(20);
        eventDateField = new JTextField(20);
        eventLocationField = new JTextField(20);
        submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eventName = eventNameField.getText();
                LocalDate eventDate = LocalDate.parse(eventDateField.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                String eventLocation = eventLocationField.getText();

                SimpleEvent newEvent = new SimpleEvent(eventName, eventDate, eventLocation);
                events.add(newEvent);
                eventListModel.addElement(newEvent.getEventDetails());

                JOptionPane.showMessageDialog(null, "Event details submitted:\nName: " + eventName + "\nDate: " + eventDate + "\nLocation: " + eventLocation, "Confirmation", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JPanel formPanel = new JPanel(new GridLayout(4, 2));
        formPanel.add(new JLabel("Event Name:"));
        formPanel.add(eventNameField);
        formPanel.add(new JLabel("Event Date (YYYY-MM-DD):"));
        formPanel.add(eventDateField);
        formPanel.add(new JLabel("Event Location:"));
        formPanel.add(eventLocationField);
        formPanel.add(new JLabel()); // Empty label for spacing
        formPanel.add(submitButton);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(formPanel, BorderLayout.NORTH);

        add(mainPanel);

        setTitle("Calendar App");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            CalendarApp calendarApp = new CalendarApp();
            calendarApp.setVisible(true);
        });
    }
}

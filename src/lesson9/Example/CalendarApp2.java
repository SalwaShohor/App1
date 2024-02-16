package lesson9.Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarApp2 extends JFrame {

    private JLabel monthLabel;
    private JPanel calendarPanel;
    private int currentMonth, currentYear;

    public CalendarApp2() {
        setTitle("Simple Calendar App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Get current month and year
        Calendar calendar = Calendar.getInstance();
        currentMonth = calendar.get(Calendar.MONTH);
        currentYear = calendar.get(Calendar.YEAR);

        // Create components
        monthLabel = new JLabel();
        calendarPanel = new JPanel(new GridLayout(6, 6));

        JButton prevButton = new JButton("<< Previous");
        JButton nextButton = new JButton("Next >>");

        // Add action listeners to the buttons
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                previousMonth();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextMonth();
            }
        });

        // Create panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(monthLabel);
        buttonPanel.add(nextButton);

        // Set layout and add components to the frame
        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);//specifically to the North (top) region of the JFrame
        add(calendarPanel, BorderLayout.CENTER);

        // Display the current month
        displayMonth();

        // Set frame visibility
        setVisible(true);
    }

    private void displayMonth() {
        // Update the month label
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
        monthLabel.setText(sdf.format(getDisplayedMonth().getTime()));

        // Clear the previous month's days
        calendarPanel.removeAll();

        // Get the days of the week
        String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        // Add the days of the week as labels
        for (String day : daysOfWeek) {
            JLabel label = new JLabel(day, SwingConstants.CENTER); //specify the alignment of the label's contents. 
                                                                   //In this case, it centers the text horizontally within the label.
            calendarPanel.add(label);
        }

        // Get the first day of the month
        Calendar firstDayOfMonth = getDisplayedMonth();
        firstDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);

        // Add empty labels for the days before the first day of the month
        int firstDayOfWeek = firstDayOfMonth.get(Calendar.DAY_OF_WEEK) - 1;
        // In Java's Calendar class, the DAY_OF_WEEK field is a constant representing the 
        // day of the week. It is an integer value that ranges from SUNDAY (1) to SATURDAY (7). 
        // The Calendar.DAY_OF_WEEK field is used to get or set the day of the week.
        for (int i = 0; i < firstDayOfWeek; i++) {
            calendarPanel.add(new JLabel(""));
        }

        // Add labels for each day in the month
        while (firstDayOfMonth.get(Calendar.MONTH) == currentMonth) {
            int dayOfMonth = firstDayOfMonth.get(Calendar.DAY_OF_MONTH);
            JLabel label = new JLabel(String.valueOf(dayOfMonth), SwingConstants.CENTER);
            calendarPanel.add(label);

            // Highlight the current day
            if (firstDayOfMonth.get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)
                    && firstDayOfMonth.get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH)
                    && dayOfMonth == Calendar.getInstance().get(Calendar.DAY_OF_MONTH)) {
                label.setForeground(Color.RED);
            }

            // Calendar.getInstance() is a static method in the Calendar class that returns a 
            // Calendar instance initialized with the current date and time according to the default 
            // time zone and locale.

            // Move to the next day
            firstDayOfMonth.add(Calendar.DAY_OF_MONTH, 1);
        }

        // Repaint the calendar panel
        calendarPanel.revalidate();
        calendarPanel.repaint();
    }

    private void previousMonth() {
        currentMonth--;
        // decrements the value of currentMonth by 1. currentMonth represents the index of the 
        // current month (0 for January, 1 for February, ..., 11 for December). By decrementing 
        // it, the method is moving to the previous month.
        if (currentMonth < 0) {
        // checks if the decremented currentMonth becomes negative after the decrement operation. 
        // If it does, it means we were at January, and moving to the previous month would result 
        // in a negative index. In that case, the code sets currentMonth to 11 (December, the last month) 
        // and decrements currentYear to move to the previous year.
            currentMonth = 11;
            currentYear--;
        }
        displayMonth();
    }

    private void nextMonth() {
        currentMonth++;
        if (currentMonth > 11) {
            currentMonth = 0;
            currentYear++;
        }
        displayMonth();
    }

    private Calendar getDisplayedMonth() {
        Calendar cal = Calendar.getInstance();
        cal.set(currentYear, currentMonth, 1); // Set to the first day of the displayed month
        return cal;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
        // utility class in the Java Swing framework that provides various static 
        // methods for working with Swing components in a multithreaded environment.
            @Override
            public void run() {
                new CalendarApp2();
            }
        });
    }
}

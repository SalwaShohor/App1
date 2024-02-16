package lesson9.Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class CalendarApp extends JFrame{

    private JLabel monthLabel;
    private JPanel calendarPanel;
    private int currentMonth, currentYear;

    public CalendarApp(){
        setTitle("Simple Calendar App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // get current month and year
        Calendar calendar = Calendar.getInstance();
        currentMonth = calendar.get(Calendar.MONTH);
        currentYear = calendar.get(Calendar.YEAR);

        // Create components
        monthLabel = new JLabel();
        calendarPanel = new JPanel(new GridLayout(7, 7));

        JButton prevButton = new JButton ("Previous");
        JButton nextButton = new JButton ("Next");

        // Add action listeners to the buttons
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
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

        // set layout and add components to the frame
        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(calendarPanel, BorderLayout.CENTER);

        // display the current month
        displayMonth();

        // set frame visibility
        setVisible(true);
    }

    private void displayMonth(){
        // update the  month label
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
        monthLabel.setText(sdf.format(getDisplayedMonth().getTime()));

        // clear the previous month's days
        calendarPanel.removeAll();

        // get the days of the week
        String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        // add the days of the week as labels
        for (String day : daysOfWeek){
            JLabel label = new JLabel(day, SwingConstants.CENTER);
            calendarPanel.add(label);
        }

        //get the first day of the month
        Calendar firstDayOfMonth = getDisplayedMonth();
        firstDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);

        // calculate the number of columns needed
        int numColumns =7;
        int numRows = (int) Math.ceil((double) (firstDayOfMonth.getActualMaximum(Calendar.DAY_OF_MONTH) + firstDayOfMonth.get(Calendar.DAY_OF_WEEK) - 1) / numColumns);
        // int firstDayOfWeek = firstDayOfMonth.get(Calendar.DAY_OF_WEEK) - 1;
        // int daysInPreviousMonth = firstDayOfWeek;
        // int daysInCurrentMonth = firstDayOfMonth.getActualMaximum (Calendar.DAY_OF_MONTH);
        // int totalDays = daysInPreviousMonth + daysInCurrentMonth;

        // // calculate the number of rows needed
        // int numRows = (int) Math.ceil((daysInCurrentMonth + daysInCurrentMonth) / (double) numColumns);
        
        // set the layout with the calculated number of columns and rows
        calendarPanel.setLayout(new GridLayout(numRows, numColumns));

        // add empty labels for the days before the first day of the month
        for(int i=0; i<firstDayOfMonth.get(Calendar.DAY_OF_WEEK)-1; i++){
            calendarPanel.add(new JLabel(""));
        }        
        // int firstDayOfWeek = firstDayOfMonth.get(Calendar.DAY_OF_WEEK) - 1;
        // for (int i=0; i < firstDayOfWeek; i++){
        //     calendarPanel.add(new JLabel(""));
        // }

        // add labels for each day in the month
        for(int dayOfMonth = 1; dayOfMonth <= firstDayOfMonth.getActualMaximum(Calendar.DAY_OF_MONTH); dayOfMonth++){
            JLabel label = new JLabel(String.valueOf(dayOfMonth), SwingConstants.CENTER);
            calendarPanel.add(label);

            // if (dayOfMonth <= daysInPreviousMonth || dayOfMonth > daysInCurrentMonth){
            //     label = new JLabel(""); // empty label for days outside the current month
            // }else{
            //     label = new JLabel(String.valueOf(dayOfMonth - daysInPreviousMonth), SwingConstants.CENTER);
            // }

            // calendarPanel.add(label);

        
        // while (firstDayOfMonth.get(Calendar.MONTH) == currentMonth) {
        //     int dayOfMonth = firstDayOfMonth.get(Calendar.DAY_OF_MONTH);
        //     JLabel label = new JLabel(String.valueOf(dayOfMonth), SwingConstants.CENTER);
        //     calendarPanel.add(label);

            // highlight the current day
            if (firstDayOfMonth.get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)
                    && firstDayOfMonth.get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH)
                    && dayOfMonth == Calendar.getInstance().get(Calendar.DAY_OF_MONTH)){
                        label.setForeground(Color.RED);
            }

            //move to the next day
            firstDayOfMonth.add(Calendar.DAY_OF_MONTH, 1);
        }

        // repaint the calendar panel
        calendarPanel.revalidate();
        calendarPanel.repaint();            
    }

    private void previousMonth(){
        currentMonth--;
        if (currentMonth < 0){
            currentMonth = 11;
            currentYear--;
        }
        displayMonth();
    }

    private void nextMonth(){
        currentMonth++;
        if (currentMonth > 11){
            currentMonth = 0;
            currentYear++;
        }
        displayMonth();
    }

    private Calendar getDisplayedMonth(){
        Calendar cal = Calendar.getInstance();
        cal.set(currentYear, currentMonth, 1);
        return cal;
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new CalendarApp();
            }

        });
    }
    
}



    



    


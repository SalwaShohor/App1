package lesson10_v2.ConnectDatabase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SubmitButtonListener implements ActionListener {
    private JTextField expenseField;
    private JTextField dateField;

    public SubmitButtonListener(JTextField expenseField, JTextField dateField) {
        this.expenseField = expenseField;
        this.dateField = dateField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String expense = expenseField.getText();
        LocalDate date = LocalDate.parse(dateField.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        DatabaseHelper.insertExpenseIntoDatabase(expense, date);

        JOptionPane.showMessageDialog(null, "Expense details added to the database.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
}

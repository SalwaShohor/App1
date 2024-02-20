package lesson10_v2.ConnectDatabase;

import javax.swing.*;
import java.awt.*;

public class ExpenseForm extends JFrame {
    private JTextField expenseField;
    private JTextField dateField;
    private JButton submitButton;

    public ExpenseForm() {
        expenseField = new JTextField(20);
        dateField = new JTextField(20);
        submitButton = new JButton("Submit");

        SubmitButtonListener listener = new SubmitButtonListener(expenseField, dateField);
        submitButton.addActionListener(listener);

        JPanel formPanel = new JPanel(new GridLayout(3, 2));
        formPanel.add(new JLabel("Expense:"));
        formPanel.add(expenseField);
        formPanel.add(new JLabel("Date (YYYY-MM-DD):"));
        formPanel.add(dateField);
        formPanel.add(new JLabel()); // Empty label for spacing
        formPanel.add(submitButton);

        add(formPanel);

        setTitle("Expense Form");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExpenseForm expenseForm = new ExpenseForm();
            expenseForm.setVisible(true);
        });
    }
}

package lesson10_v2.ConnectDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class DatabaseHelper {
    public static void insertExpenseIntoDatabase(String expense, LocalDate date) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "MySql*1234";

        String sql = "INSERT INTO expenses (expense, date) VALUES (?, ?)";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, expense);
            statement.setDate(2, java.sql.Date.valueOf(date));

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception as per your application's requirements
        }
    }
}

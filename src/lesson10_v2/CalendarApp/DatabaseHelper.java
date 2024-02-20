package lesson10_v2.CalendarApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class DatabaseHelper {
    public static void insertEventIntoDatabase(String eventName, LocalDate eventDate, String eventVenue) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "MySql*1234";

        // Change this line in DatabaseHelper.java
        String sql = "INSERT INTO calendarapp (EventName, EventDate, EventVenue) VALUES (?, ?, ?)";


        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, eventName);
            statement.setDate(2, java.sql.Date.valueOf(eventDate));
            statement.setString(3, eventVenue);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception as per your application's requirements
        }
    }
}

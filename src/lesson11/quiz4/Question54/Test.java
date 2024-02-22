package lesson11.quiz4.Question54;

import java.sql.SQLException;

public class Test {

    private static void getReport() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            throw new NullPointerException(); // Line 10
        }
    }

    public static void main(String[] args) {
        try {
            getReport(); // Line 16
        } catch (SQLException e) {
            System.out.println("REPORT ERROR");
        }
    }
}

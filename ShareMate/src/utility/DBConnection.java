import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static void main(String[] args) {
        // Change these values as needed
        String url = "jdbc:mysql://localhost:3306/sharemate";
        String user = "root"; // or your MySQL username
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to the database!");
            conn.close();
        } catch (SQLException e) {
            System.out.println("❌ Connection failed: " + e.getMessage());
        }
    }
}

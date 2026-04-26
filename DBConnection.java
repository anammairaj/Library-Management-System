import java.sql.*;

public class DBConnection {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/library_db",
                "root",
                "anammairaj@123"
            );

            return con;

        } catch (Exception e) {
            System.out.println("DB Error: " + e);
            return null;
        }
    }
}
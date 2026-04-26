import java.sql.*;

public class LibraryManager {

    public void addBook(String title, String author) {
        try {
            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO books(title, author, status) VALUES (?, ?, 'Available')";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, title);
            ps.setString(2, author);

            ps.executeUpdate();
            System.out.println("Book Added!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void viewBooks() {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM books");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("title") + " | " +
                    rs.getString("author") + " | " +
                    rs.getString("status")
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
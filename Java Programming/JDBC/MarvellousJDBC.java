import java.sql.*;

public class MarvellousJDBC {
    public static void main(String A[]) {
        try {
            // 1. Register the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection to the database 'PPA55'
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA55", "root", "");

            // 3. Create a statement object to execute queries
            Statement stmt = con.createStatement();

            // 4. Execute SQL query and fetch data
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // 5. Iterate through the database records
            while (rs.next()) {
                System.out.println("Roll No: " + rs.getInt("rno"));
                System.out.println("Name    : " + rs.getString("name"));
                System.out.println("City    : " + rs.getString("city"));
                System.out.println("Marks   : " + rs.getInt("marks"));
                System.out.println("-------------------------");
            }

            // 6. Close all open database resources
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Exception occured : " + e);
        }
    }
}

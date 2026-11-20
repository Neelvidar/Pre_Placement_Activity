import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/ppa55";
        try (Connection con = DriverManager.getConnection(url, "root", "")) {
            System.out.println("Connected!");
        }
    }
}
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    private static Connection con;

    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/employee";
            String username = "root";
            String password = "hello27";

            con = DriverManager.getConnection(url, username, password);
            // System.out.println("Connected to database");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con; // return null 
    }
    // public static void main(String[] args) {
    //     Connection con=ConnectDB.connect();
    //     System.out.println(con);
    // }
}

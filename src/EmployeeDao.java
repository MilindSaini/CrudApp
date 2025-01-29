import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDao {
    public static void insertdata(Employee emp) throws SQLException{
        Connection con=ConnectDB.connect();
        String q=Query.getInsert();
        PreparedStatement psmt=con.prepareStatement(q);
        psmt.setInt(1, emp.getId());
        psmt.setString(2, emp.getName());
        psmt.setDouble(3, emp.getSalary());
        psmt.setString(4, emp.getEmail());
        psmt.executeUpdate();
        System.out.println("Done..");

        psmt.close();
    }
    public static ArrayList<Employee> readdata() throws SQLException{
        ArrayList<Employee> empl=new ArrayList<Employee>();
        Connection con=ConnectDB.connect();
        String q=Query.getRead();
        PreparedStatement psmt=con.prepareStatement(q);
        System.out.println("Printing Statements>>>");
        ResultSet rs=psmt.executeQuery(q);
        while(rs.next()){
            Employee emp=new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4));
            empl.add(emp);
        }
        System.out.println("Done..");

        psmt.close();
        return empl;
    }
    public static void updatedata(int id,String name,double salary,String email) throws SQLException{
        Connection con=ConnectDB.connect();
        String q=Query.getUpdate();
        PreparedStatement psmt=con.prepareStatement(q);
        psmt.setInt(4, id);
        psmt.setString(1, name);
        psmt.setDouble(2, salary);
        psmt.setString(3, email);
        int check=psmt.executeUpdate();
        if(check==1){
            System.out.println("Updated");
        }
        else{
            System.out.println("Not found try again>>>");
        }
        System.out.println("Done..");
        psmt.close();
    }
    public static void deletedata(int id) throws SQLException{
        Connection con=ConnectDB.connect();
        String q=Query.getDelete();
        PreparedStatement psmt=con.prepareStatement(q);
        psmt.setInt(1,id);
        int check=psmt.executeUpdate();
        if(check>0){
            System.out.println("Row deleted successfully");
        }
        else{
            System.out.println("Row not found");
        }
        System.out.println("Done..");

        psmt.close();
    }

}

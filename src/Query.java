
public class Query {
    public static String getInsert(){
        return "INSERT INTO employeeD (tId, tName, tSalary, tEmail) VALUES (?,?,?,?)";
    }
    public static String getRead(){
        return "SELECT * from employeeD";
    }
    public static String getUpdate(){
        return "UPDATE employeeD set tName=?,tSalary=?,tEmail=? where tId=?";
    }
    public static String getDelete(){
        return "DELETE from employeeD where tId=?";
    }
    // static String insert="INSERT INTO employeeD (tId, tName, tSalary, tEmail) VALUES (?,?,?,?)";
    // static String read="SELECT * from employeeD";
    // static String update="UPDATE employeeD set tName=?,tSalary=?,tEmail=? where tId=?";
    // static String delete="DELETE from employeeD where tId=?";
}

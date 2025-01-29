import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        while(true){
            System.out.println("Employees Manangement>>>");
            System.out.println("Enter your choice");
            System.out.println(" 1. Insert in database: \n 2. Read a database: \n 3. Update a database: \n 4. Delete a database: \n 5. Exit");
            System.out.println("--------------------------------------------------------------------------------------");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int choice=Integer.parseInt(br.readLine());
            if(choice==5) break;
            switch (choice) {
                case 1:
                    System.out.println("Enter the values:");
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.print("Id(INT): ");
                    int id=Integer.parseInt(br.readLine());
                    System.out.print("Name(STRING): ");
                    String name=br.readLine();
                    System.out.print("Salary(DOUBLE): ");
                    double salary=Double.parseDouble(br.readLine());
                    System.out.print("Email(STRING): ");
                    String email=br.readLine();
                    Employee emp=new Employee(id,name,salary,email);
                    EmployeeDao.insertdata(emp);
                    break;
                case 2:
                    ArrayList<Employee> l=EmployeeDao.readdata();
                    for(Employee e:l){
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("Id(INT):");
                    id=Integer.parseInt(br.readLine());
                    System.out.println("Name(STRING): ");
                    name=br.readLine();
                    System.out.println("Salary(DOUBLE): ");
                    salary=Double.parseDouble(br.readLine());
                    System.out.println("Email(STRING): ");
                    email=br.readLine();
                    EmployeeDao.updatedata(id,name,salary,email);
                    break;
                case 4:
                    System.out.println("Enter the id to delete");
                    id=Integer.parseInt(br.readLine());
                    EmployeeDao.deletedata(id);
                    break;
                default:
                    System.out.println("Wrong Choice entered...");
                    break;
            }
        }
        System.out.println("Exiting...");
    }
}

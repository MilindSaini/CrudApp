# CrudApp

A simple Java-based CRUD (Create, Read, Update, Delete) application for managing employee records using JDBC and a relational database.

## 📁 Project Structure
```bash
CrudApp/
├── src/
│ ├── App.java # Main entry point
│ ├── ConnectDB.java # Database connection logic
│ ├── Employee.java # Model class for employee entity
│ ├── EmployeeDao.java # DAO class with CRUD operations
│ └── Query.java # SQL query utilities (optional helper class)
├── lib/ # External libraries (if any)
├── bin/ # Compiled class files
├── .vscode/ # VS Code config (optional)
└── README.md
```

## 🔧 Technologies Used

- **Java** (JDK 8+)
- **JDBC**
- **MySQL / PostgreSQL / other** (configure in `ConnectDB.java`)
- **IDE**: VS Code / Eclipse / IntelliJ
- **Maven or Manual Build** (based on your project setup)

## 🚀 Features

- Add a new employee
- View all employees
- Update employee details
- Delete an employee
- Persistent storage via JDBC
- Console-based interaction

## 📦 Setup Instructions

1. **Clone the repository**  
git clone https://github.com/yourusername/CrudApp.git


2. **Set up the database**
- Create a database named `cruddb` (or as per your config).
- Create a table `employee` with appropriate schema:
  ```sql
  CREATE TABLE employee (
      id INT PRIMARY KEY AUTO_INCREMENT,
      name VARCHAR(100),
      department VARCHAR(100),
      salary DOUBLE
  );
  ```

3. **Configure database connection**
- Open `ConnectDB.java`
- Set your DB URL, username, and password.

4. **Compile and Run**
```bash
javac -d bin src/*.java
java -cp bin App
```
## 🧪 Sample Commands (in App.java)
You can navigate via console input. Typical flow:
Copy
Edit
1. Add Employee
2. View Employees
3. Update Employee
4. Delete Employee
5. Exit
📌 TODO / Enhancements
Add GUI with JavaFX or Swing

Add unit tests

Integrate with ORM (like Hibernate)

Containerize with Docker

Add logging and input validation

🤝 Contribution
Feel free to fork and submit a pull request. For major changes, please open an issue first.

📝 License
This project is open-source and available under the MIT License.

Developed with ❤️ by Milind Saini

---

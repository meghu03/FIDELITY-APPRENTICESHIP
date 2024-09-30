import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Employee {
    private int id;
    private String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}

class EmployeeDirectory {
   private static final List<Employee> EMPLOYEES = new ArrayList<>();
   static {
       EMPLOYEES.add(new Employee(1, "Dhanush"));
       EMPLOYEES.add(new Employee(2, "Medha"));
       EMPLOYEES.add(new Employee(3, "Vaishnavi"));
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Employee ID to search:");
       try {
           int employeeId = sc.nextInt();
           System.out.println("Employee is present: " + findEmployee(employeeId));
       } catch (EmployeeNotFoundException ex) {
           System.out.println(ex.getMessage());
       } catch (Exception ex) {
           System.out.println("Invalid input.Please enter valid Id");
       } finally {
           sc.close();
       }
   }
   public static String findEmployee(int employeeId) throws EmployeeNotFoundException {
       for (Employee emp : EMPLOYEES) {
           if (emp.getId() == employeeId) {
               return emp.getName();
           }
       }
       throw new EmployeeNotFoundException("Employee with ID " + employeeId + " is not present");
   }
}

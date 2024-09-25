public class Employee {
    int id;
    String name;
    float basicsalary;
    float bonus;
    float netsalary;

    public Employee(int id, String name, float basicsalary) {
        this.id = id;
        this.name = name;
        this.basicsalary = basicsalary;
        this.bonus = 0;
        this.netsalary = 0;
    }

    public void displaydetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicsalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("NetSalary: " + netsalary);
    }
}



public class Main {
    public static void main(String[] args) {
        PermanentEmployee esther = new PermanentEmployee(101, "Esther", 25000, 1500);
        esther.calculatenetsalary();
        esther.calculatebonus();
        System.out.println("Permanent Employee details");
        esther.displaydetails();
        System.out.println();

        TemporaryEmployee ganesh = new TemporaryEmployee(102, "Ganesh", 1500, 20);
        ganesh.calculatenetsalary();
        ganesh.calculatebonus();
        System.out.println("Temporary Employee details");
        ganesh.displaydetails();
    }
}

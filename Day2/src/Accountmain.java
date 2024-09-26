public class Accountmain {
    public static void main(String[] args) {
        Account acc = new Account( 123, "Meghu", 5000);
        acc.display();
        acc.deposit(3000);
        acc.display();
        acc.withdraw(1000);
        acc.display();
    }
}

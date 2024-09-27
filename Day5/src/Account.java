import java.util.Scanner;
public class Account {
    private int id;
    private String accounttype;
    private double balance;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAccounttype() {
        return accounttype;
    }
    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Account() {
        this.id = 0;
        this.accounttype = "";
        this.balance = 0;
    }
    public Account(int id, String accounttype, double balance) {
        this.id = id;
        this.accounttype = accounttype;
        this.balance = balance;
    }
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    public String getdetails() {
        return "Account Id: " + id + "\nAccount Type: " + accounttype + "\nBalance: " + balance;
    }
}
 class Accountdetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();
        System.out.println("Enter account id:");
        acc.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter account type savings/current:");
        acc.setAccounttype(sc.nextLine());
        System.out.println("Enter account balance:");
        acc.setBalance(sc.nextDouble());
        System.out.println(acc.getdetails());
        System.out.println("Enter amount to withdraw");
        double amount = sc.nextDouble();
        if (acc.withdraw(amount)) {
            System.out.println("New balance: " + acc.getBalance());
        } else {
            System.out.println("Insufficient balance");
        }
        sc.close();
    }
}

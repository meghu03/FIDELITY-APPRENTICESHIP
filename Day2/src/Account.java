public class Account {
    private int accountnumber;
    private String accountname;
    private float balance;

    Account(int accountnumber, String accountname, float balance) {
        this.accountnumber = accountnumber;
        this.accountname = accountname;
        this.balance = balance;
    }

    void deposit(float amount) {
        balance += amount;
    }

    void withdraw(float amount) {
        if (amount < balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Account number: " + accountnumber + "\nAccount name: " + accountname + "\nBalance: " + balance);
    }
}

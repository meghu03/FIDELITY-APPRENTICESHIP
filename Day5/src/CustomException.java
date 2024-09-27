import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        double balance = 500;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Current balance: " + balance);
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance for the withdrawal");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            }
        } catch (InsufficientBalanceException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Invalid input. Please enter a valid amount.");
        }
    }
}

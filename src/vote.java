import java.util.Scanner;
public class vote {
    public static boolean eligible(int age) {
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age");
        int age = sc.nextInt();
        if (eligible(age)) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}

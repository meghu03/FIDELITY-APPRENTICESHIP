import java.util.Scanner;
public class Boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enter value of x: ");
        x = sc.nextInt();
        System.out.println("Enter value of y: ");
        y = sc.nextInt();
        boolean result = x < y;
        System.out.println("The result of whether x is less than y is "+ result );
        sc.close();
    }
}

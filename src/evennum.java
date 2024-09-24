import java.util.Scanner;
public class evennum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in an array");
        int n = sc.nextInt()
;
    int[] numbers = new int[n];
    System.out.println("Enter elements of array");
    for(int i=0;i<n;i++) {
    numbers[i] = sc.nextInt();
    }
    int sum = 0;
    for(int num : numbers) {
        if(num % 2 == 0) {
            sum += num;
        }
    }
    System.out.println("The sum of even numbers" +sum);
    sc.close();
    }
}

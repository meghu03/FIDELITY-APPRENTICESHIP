import java.util.Scanner;
public class bill {
    public static void main(String[] args) {
        final int pizzaPrice =200;
        final int puffPrice =40;
        final int pepsiPrice =120;
        int numberofPizzas = 5;
        int numberofPuffs = 6;
        int numberofPepsis = 2;
        int totalPizzascost = numberofPizzas * pizzaPrice;
        int totalPuffcost = numberofPuffs * puffPrice;
        int totalPepsicost = numberofPepsis * pepsiPrice;
        int grandTotal = totalPizzascost + totalPuffcost + totalPepsicost;
        System.out.println("Bill details");
        System.out.println("Total cost of pizza: Rs"+totalPizzascost);
        System.out.println("Total cost of puffs: Rs"+totalPuffcost);
        System.out.println("Total cost of pepsi: Rs"+totalPepsicost);
        System.out.println("Grand totala: Rs"+grandTotal);
    }
}

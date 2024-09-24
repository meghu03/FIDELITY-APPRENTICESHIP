public class Main {
    public static void main(String[] args) {
        // Multilevel inheritance
        Smartphone smartphone = new Smartphone("iphone 15", 23000, "APPLE", "iphone");
        System.out.println("-----Smartphone Details-----:");
        smartphone.displayInfo();

        System.out.println();

        // Hierarchical inheritance
        Appliances television = new Appliances("Crystal", 50000, "Samsung");
        System.out.println("-----Appliances Details-----:");
        television.displayInfo();

        Clothing tShirt = new Clothing("T-Shirt", 800, "M");
        System.out.println("-----Clothing Details-----:");
        tShirt.displayInfo();
    }
}
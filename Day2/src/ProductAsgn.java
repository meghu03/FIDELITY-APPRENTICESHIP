public class ProductAsgn {
    private int proid;
    private String proname;
    private double price;
    public ProductAsgn(int proid, String proname, double price) {
        this.proid = proid;
        this.proname = proname;
        this.price = price;
    }
    public void displayInfo() {
        System.out.println("Product ID: " + proid);
        System.out.println("Product Name: " + proname);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

class ProductSample {
    public static void main(String[] args) {
        ProductAsgn[] products = new ProductAsgn[5];
        products[0] = new ProductAsgn(101, "Laptop", 23000);
        products[1] = new ProductAsgn(102, "Smartphone", 59000);
        products[2] = new ProductAsgn(103, "Tablet", 29000);
        products[3] = new ProductAsgn(104, "Headphones", 6000);
        products[4] = new ProductAsgn(105, "Smartwatch", 1000);
        for (ProductAsgn product : products) {
            product.displayInfo();
        }
    }
}

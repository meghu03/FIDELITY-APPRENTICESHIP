// Subclass for Electronics
class Appliances extends Product {
    String brand;
    public Appliances(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
    }
}

// Subclass for Clothing
class Clothing extends Product {
    String size;
    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size: " + size);
    }
}
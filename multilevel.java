
class Electronics extends Product {
    String brand;
    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }
    @Override
    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}


class Smartphone extends Electronics {
    String operatingSystem;
    public Smartphone(String name, double price, String brand, String operatingSystem) {
        super(name, price, brand);
        this.operatingSystem = operatingSystem;
    }
    @Override
    public void displayInfo() {
        System.out.println("Name: " + name+ "\nPrice: " + price+ "\nBrand: " + brand+ "\nOperating System: " + operatingSystem);
    }
}



import java.util.Scanner;
class Customer {
    private String name;
    private int age;
    private String country;

    public Customer(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}

public class RegistrationForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your country");
        String country = scanner.nextLine();
        Customer customer = new Customer(name, age, country);
        System.out.println("Welcome " + customer.getName() + ". Your age is " + customer.getAge() + " and you are from " + customer.getCountry());
        scanner.close();
    }
}

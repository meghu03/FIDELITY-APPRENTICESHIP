public class Person {
    private String name;
    public String gender;
    public int age;
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }
    public void updateName(String newName) {
        this.name = newName;
    }
}


class Persondetail {
    public static void main(String[] args) {
        Person person = new Person("Medha", "Female", 25);
        System.out.println("Person Details:");
        person.displayInfo();
        person.updateName("Medha Gowda");
        System.out.println("\nUpdated Details:");
        person.displayInfo();
    }
}

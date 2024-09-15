// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a new Person object
        Person person1 = new Person("Alice", 30);

        // Display person's information
        person1.displayInfo();

        // Modify person's attributes
        person1.setName("Alice Johnson");
        person1.setAge(31);

        // Display updated information
        System.out.println("Updated Information:");
        person1.displayInfo();
    }
}


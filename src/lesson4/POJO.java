package lesson4;

public class POJO {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person("Harry Potterr", 18, "harrypotter@google.com");

        // Display details using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Email: " + person.getEmail());

}
}

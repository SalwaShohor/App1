package lesson4;

// Create an outer class named Outer.
class Outer {

    //Inside the Outer class, create an inner class named Inner.
    class Inner {

        // Add a private field name of type String to the Inner class.
        private String name;
        
        // Implement a constructor for the Inner class that takes a String parameter 
        // and initializes the name field.
        public Inner(String name) {
            this.name = name;
        }
        
        // Add a method named getName to the Inner class that returns the value of the name field.
        public String getName() {
            return name;
        }

        
    }

    //Inside the Outer class, create an inner class named Inner.
    class Inner2 {

        // Add a private field name of type String to the Inner class.
        private String name;
        
        // Implement a constructor for the Inner class that takes a String parameter 
        // and initializes the name field.
        public Inner2(String name) {
            this.name = name;
        }
        
        // Add a method named getName to the Inner class that returns the value of the name field.
        public String getName() {
            return name;
        }

        
    }




}

// Create a class named Main with a main method.
public class Main {
    public static void main(String[] args) {

        // Inside the main method, create an instance of the Outer class and then create 
        // an instance of the Inner class.
        Outer outer = new Outer();

        // Set a name for the inner class instance using the constructor.
        Outer.Inner inner = outer.new Inner("InnerObject");

        // Display the name of the inner class instance using the getName method.
        System.out.println("Inner Name: " + inner.getName());
    }
}

// An inner class in Java is a class that is defined within another class. It has access to the 
// members (fields and methods) of its enclosing class.

// Inner classes are appropriate when we want to logically group classes together, and one class 
// is closely related to another.

// They are commonly used for event handling (listeners), where the listener class is closely tied 
// to the class generating the events.

// Inner classes are useful when we need to access private members of the outer class.

// They can also be used for code organization and encapsulation, especially when a class is only 
// used by one other class.











// An inner class in Java is a class declared within another class. It has access to all members of the outer class,
// including private members, and can be instantiated only within the scope of the outer class. Inner classes are
// appropriate when you need to logically group classes together and encapsulate functionality that is closely related
// to the outer class. They are commonly used for event handling, listeners, and implementing data structures.

package lesson3;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListManipulator{

    private ArrayList<Integer> arrayList;
    // { 90, 100, 150 }
    // { 0, 1, 2 }

    public ArrayListManipulator(){
        arrayList = new ArrayList<>();
    }

    public void addElement(int element){
        arrayList.add(element);
    }

    public void removeElementByValue(int element){
        arrayList.remove(Integer.valueOf(element));
    }

    // method to remove an element by Index from the Arraylist
    public void removeElementbyIndex(int element){
        arrayList.remove(Integer.valueOf(element));
    }

    public ArrayList<Integer> getArrayList(){
        return arrayList;
    }

    public int searchElement(int element){
        return arrayList.indexOf(element);

    }

    public void sortList(){
        Collections.sort(arrayList);
    }


    

    public static void main (String[] args){
        ArrayListManipulator arrayListmanipulator = new ArrayListManipulator();
        arrayListmanipulator.addElement(200);
        arrayListmanipulator.addElement(90);
        arrayListmanipulator.addElement(250);
        arrayListmanipulator.addElement(100);
        arrayListmanipulator.addElement(150);
        arrayListmanipulator.addElement(50);
        arrayListmanipulator.addElement(10);

        // System.out.println(arrayListmanipulator.getArrayList().toString());

        // arrayListManipulator.removeElementbyValue.(90);
        // arrayListmanipulator.removeElementbyIndex(1);
        System.out.println(arrayListmanipulator.getArrayList().toString());
        arrayListmanipulator.sortList();
        System.out.println(arrayListmanipulator.getArrayList().toString());

    }


    // Method to display the elements in the ArrayList
    // public void displayList() {
    //     System.out.println("Elements in the ArrayList:");
    //     for (int num : arrayList) {
    //         System.out.print(num + " ");
    //     }
    //     System.out.println();
    // }

    // // Main method for testing
    // public static void main(String[] args) {
    //     ArrayListManipulator manipulator = new ArrayListManipulator();

    //     // Test addElement method
    //     manipulator.addElement(5);
    //     manipulator.addElement(3);
    //     manipulator.addElement(8);
    //     manipulator.addElement(1);
    //     manipulator.displayList(); // Expected output: 5 3 8 1

    //     // Test removeElement method
    //     manipulator.removeElementByValue(8);
    //     manipulator.displayList(); // Expected output: 5 3 1

    //     // Test sortList method
    //     manipulator.sortList();
    //     manipulator.displayList(); // Expected output: 1 3 5

    //     // Test searchElement method
    //     int index = manipulator.searchElement(3);
    //     System.out.println("Index of 3: " + index); // Expected output: 1

    //     index = manipulator.searchElement(10);
    //     System.out.println("Index of 10: " + index); // Expected output: -1
    // }
}



// public class ArrayListManipulator {

//     // private field only can access in the class
//     private ArrayList<Integer> arrayList;

//     // constructor
//     public ArrayListManipulator(){
//         arrayList = new ArrayList<>();
//     } 

//     // public method to add value into the private field "arrayList"
//     public void addElement(int element){
//         arrayList.add(element);
//     }

//     // remove particular element in an array (take obj as argument)
//     public void removeByElement(int element){
//         arrayList.remove(Integer.valueOf(element));
//     }

//     // remove particular index in an array (take int as argument)
//     public void removeByIndex(int index){
//         arrayList.remove(index);
//     }

//     public void sortArray(){
//         arrayList.sort(null);
//     }

//     // display all element in the array
//     public void display(){
//         for(int element : this.arrayList){
//             System.out.printf("%d ",element);
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {

//         ArrayListManipulator arrayListManipulator = new ArrayListManipulator();

//         arrayListManipulator.addElement(4);
//         arrayListManipulator.addElement(3);
//         arrayListManipulator.addElement(2);
//         arrayListManipulator.addElement(5);
//         arrayListManipulator.addElement(1);
//         System.out.print("Before: ");
//         arrayListManipulator.display();

//         // arrayListManipulator.removeByElement(2);
//         // arrayListManipulator.removeByIndex(0);
//         arrayListManipulator.sortArray();
//         System.out.print("After:  ");
//         arrayListManipulator.display();

//     }









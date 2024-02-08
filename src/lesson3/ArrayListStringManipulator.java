package lesson3;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStringManipulator {

    private ArrayList<String> arrayList;

    public ArrayListStringManipulator() {
        arrayList = new ArrayList<>();
    }

    public void addElement(String element) {
        arrayList.add(element);
    }

    public void removeElementByValue(String element) {
        arrayList.remove(element);
    }

    public void removeElementByIndex(int index) {
        if (index >= 0 && index < arrayList.size()) {
            arrayList.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public int searchElement(String element) {
        return arrayList.indexOf(element);
    }

    public void sortList() {
        Collections.sort(arrayList);
    }

    public static void main(String[] args) {
        ArrayListStringManipulator stringManipulator = new ArrayListStringManipulator();
        stringManipulator.addElement("Japan");
        stringManipulator.addElement("Uzbekistan");
        stringManipulator.addElement("Brazil");
        stringManipulator.addElement("UAE");
        stringManipulator.addElement("France");

        System.out.println(stringManipulator.getArrayList().toString());
        stringManipulator.sortList();
        System.out.println(stringManipulator.getArrayList().toString());

        stringManipulator.removeElementByValue("UAE");
        System.out.println(stringManipulator.getArrayList().toString());

        stringManipulator.removeElementByIndex(2);
        System.out.println(stringManipulator.getArrayList().toString());
    }
}

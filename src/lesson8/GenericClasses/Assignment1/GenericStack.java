package lesson8.GenericClasses.Assignment1;
import java.util.ArrayList;
import java.util.List;

public class GenericStack<T> {

    private List<T> stack;

    public GenericStack(){
        stack = new ArrayList<>();
    }

    public void push (T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()){
            throw new IllegalStateException("Stack is empty. Cannot pop from an empty stack.");
        }
        return stack.remove(stack.size() -1);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // test GenericStack with Integer
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(10);
        intStack.push(20);
        System.out.println("Popped from intStack: " + intStack.pop());
        System.out.println("Is intStack empty? " + intStack.isEmpty());

        // test GenericStack with String
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Hello");
        stringStack.push()
    }
    
}

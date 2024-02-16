package lesson8.GenericClasses.Assignment2;

public class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A first, B second){
        this.first = first;
        this.second = second;
    }

    public A getFirst(){
        return first;
    }

    public void setFirst(A first){
        this.first = first;
    }

    public B getSecond(){
        return second;
    }

    public void setSecond(B second){
        this.second = second;
    }

    public static void main(String[] args) {
        // usage of Pair class with Integer abd String
        Pair<Integer, String> pair = new Pair<>(42, "Java");

        // Get values
        System.out.println("First element: " + pair.getFirst() + "\n");
        System.out.println("Second element: " + pair.getSecond() + "\n");

        // Set new values
        pair.setFirst(99);
        pair.setSecond("Programming");

        // Get updated values
        System.out.println("Updated first element: " + pair.getFirst() + "\n");
        System.out.println("Updated second element: " + pair.getSecond()+ "\n");
    }
    
}

package lesson11.quiz4.Question51;

public class Test {

    public static void main(String[] args) {
        int var = 3;
        String[][] arr = new String[--var][var++]; // Line n1
        arr[1][1] = "X"; // Line n2
        arr[1][2] = "Y"; // Line n3

        // Loop through the 2D array and print non-null values
        for (String[] arr1 : arr) {
            for (String s : arr1) {
                if (s != null) {
                    System.out.print(s + " ");
                }
            }
        }
    }
}

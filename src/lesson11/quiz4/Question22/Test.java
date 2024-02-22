package lesson11.quiz4.Question22;

public class Test {
    public static void main(String[] args) {
        GetSetGo[] arr = new GetSetGo[5]; // Line n2

        for (GetSetGo obj : arr) {
            // The following line is not valid since obj is null for each element in the array
            obj.count++; // Line n3
        }

        System.out.println(GetSetGo.count); // Line n4
    }
}

    


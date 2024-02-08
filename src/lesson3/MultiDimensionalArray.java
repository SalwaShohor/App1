package lesson3;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        int[][][] a = { { { 1, 2, 3 }, { 4, 5 }, { 6 } }, { { 7, 8 }, { 9 } } };
        // int[][][] a: This declares a three-dimensional array named a. 
        // It's an array of arrays of arrays, where each innermost array represents 
        // a one-dimensional array, each middle array represents a two-dimensional array, 
        // and the outer array represents the three-dimensional array.
        // The initialization of a uses an array initializer with nested arrays to define the values.

        System.out.println("a.length = " + a.length);
        // Prints the length of the outermost array a.
        
        //Iterates over the first dimension of a (outermost array).
        for (int i = 0; i < a.length; i++) {
        // Iterates over the first dimension of a (outermost array).    
            System.out.println("\na[" + i + "].length = " + a[i].length);
            // Prints the length of the second dimension for each sub-array.

            for (int j = 0; j < a[i].length; j++) {
            // Iterates over the second dimension of each sub-array.    
                System.out.println("\na[" + i + "][" + j + "].length = " + a[i][j].length);
                // Prints the length of the third dimension for each sub-array.

                for (int k = 0; k < a[i][j].length; k++) {
                // Iterates over the third dimension (innermost array) of each sub-array.
                    System.out.println("\na[" + i + "][" + j + "][" + k + "] = " + a[i][j][k] + ",");
                    // Prints the value of each element in the three-dimensional array.
                }
            }
        }
    }
}


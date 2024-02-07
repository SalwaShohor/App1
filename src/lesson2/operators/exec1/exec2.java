package lesson2.operators.exec1;

public class exec2 {
    // static double d;
    // static double xoff;
    // static double yoff;
    // static double zoff;
    // static int x1 = 0;
    // static int x2 = 0;
    // static int y1 = 0;
    // static int y2 = 0;
    // static int z1 = 0;
    // static int z2 = 0;


    // public static void main(String[] args) {
        
    //     xoff = Math.pow(x1 - x2, 2);
    //     yoff = Math.pow(y1 - y2, 2);
    //     zoff = Math.pow(z1 - z2, 2);
    //     d = Math.sqrt(xoff + yoff + zoff);
    //     System.out.println(d);

    // }

        public static void main(String[] args) {
            // Coordinates of the first point (x1, y1, z1)
            double x1 = 2;
            double y1 = 1;
            double z1 = 3;
    
            // Coordinates of the second point (x2, y2, z2)
            double x2 = 0;
            double y2 = 0;
            double z2 = 6;
    
            // Calculate the distance using the formula
            double distance = calculateDistance(x1, y1, z1, x2, y2, z2);
    
            // Display the result
            System.out.println("The distance between the points is: " + distance);
        }
    
        // Function to calculate the distance between two points in 3D space
        private static double calculateDistance(double x1, double y1, double z1, double x2, double y2, double z2) {
            double deltaX = x1 - x2;
            double deltaY = y1 - y2;
            double deltaZ = z1 - z2;
    
            return Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
        }
    }
    


    

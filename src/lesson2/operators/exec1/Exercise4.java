package lesson2.operators.exec1;

public class Exercise4 {

        public static void main(String[] args) {
            // Scenario 1: p=true; q=true
            boolean p1 = true;
            boolean q1 = true;
            evaluateLogic(p1, q1);
    
            // Scenario 2: p=true; q=false
            boolean p2 = true;
            boolean q2 = false;
            evaluateLogic(p2, q2);
    
            // Scenario 3: p=false; q=true
            boolean p3 = false;
            boolean q3 = true;
            evaluateLogic(p3, q3);
    
            // Scenario 4: p=false; q=false
            boolean p4 = false;
            boolean q4 = false;
            evaluateLogic(p4, q4);
        }
    
        private static void evaluateLogic(boolean p, boolean q) {
            if (p && q) {
                q = false;
            } else {
                if (!q) {
                    System.out.println(p);
                }
                if (p == q) {
                    System.out.println(p || q);
                }
            }
            System.out.println(q);
            System.out.println("------");
        }
    }
    
    


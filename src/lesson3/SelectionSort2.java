package lesson3;


public class SelectionSort2 {

    public static int findMinIdx(double [] d,int k){ 
        int minIdx = k; 
        for(int i=k+1;i<d.length;i++){ 
            if(d[i] < d[minIdx]){ 
                minIdx = i; 
            } 
        } 
        return minIdx; 
    }
   
    public static int findMaxIdx(double [] d,int k){ 
        int maxIdx = k; 
        for(int i=k+1;i<d.length;i++){ 
            if(d[i] > d[maxIdx]){ 
                 maxIdx = i; 
            }  
        }
        return maxIdx;
   } 
   

}

package lesson1;

public class SecondIntegerHandler {
    private int x;
    private int[] a = {2,4,6 };

    public SecondIntegerHandler(int x,int[] a){
       this.x=x;
       this.a=a;
    }

    private int getVolume(){
        return a[0] * a[1] * a[2];
    }

    public int getTotalVolume(){
        return x * getVolume();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
}

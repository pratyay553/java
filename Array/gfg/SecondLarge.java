package gfg;
public class SecondLarge {
    public static int findMax(int[] x){
        int max = x[0];
        for (int i = 1; i < x.length; i++) {
            if(x[i] > max){
                max = x[i];
            }
        }
        return max;
    }
    
    public static int find2ndMax(int[] x) {
        int Smax = 0;
        for (int i = 1; i < x.length; i++) {
            if (x[i] < SecondLarge.findMax(x) && x[i] > Smax) {
                Smax = x[i];
                
            }
        }
        return Smax;
    }
    public static void main(String[] args) {
        int[] a = {1,2,5,4,5};
        int max = SecondLarge.findMax(a);
        int Smax = SecondLarge.find2ndMax(a);
        System.out.println("Largest element is : " + max);
        System.out.println("Second Largest is : " + Smax);
    }
}

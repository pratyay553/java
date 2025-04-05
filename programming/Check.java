
public class Check{
    public static int m2(int n){
        if (n==0) {
            return 1;
        }

        return n*m2(--n);
        
        
    }
    public static void main(String[] args) {
        Check c = new Check();
        System.out.println(c.m2(10));
        
    }
}
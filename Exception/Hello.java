public class Hello {
    public static int fi(int n){
        if(n<=1){
            return n;
        }

        return fi(n-1)+fi(n-2);
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fi(n));
    }
}

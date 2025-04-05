package programming;



public class Armstrong {
    public static int getLength(int n){
        int temp = 0;
        while (n!=0) {
            temp = n%10;  
        }
        return temp;
    }

    public static int getPower(int n,int pow){
        if (pow == 0) {
           return 1; 
        }
        return (n%10)*getPower(n, --pow);
    }

    public static void main(String[] args) {
        int n = 234;
        int pow = getLength(n);
        System.out.println(getPower(n,pow));
        if (n == getPower(n, pow)) {
            System.out.println("Armstrong");
        }        
    }
}

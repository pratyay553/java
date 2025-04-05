package mjava;
public class Prime {
    public static int calculateprime(int x) {
        int cnt=0;
        for (int i = 2; i < x/2; i++) {
            if (x%i==0) {
                cnt++;
            }
        }
        if (cnt==0) {
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        if (calculateprime(8)==1) {
            System.out.println("number is prime number");
        }
        else
        {
            System.out.println("it is not a prime number");
        }
    }
}

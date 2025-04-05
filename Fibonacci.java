package mjava;

public class Fibonacci {
    public static void createfib(int n) {
        int fd = 0;
        int sd = 1;
        System.out.print(fd+" "+sd+" ");
        for(int i=1;i<=n;i++)
        {
            int ld = fd + sd;
            fd = sd;
            sd = ld;
            System.out.print(ld+" ");
        }
    }
    public static void main(String[] args) {
        createfib(12);
    }
}

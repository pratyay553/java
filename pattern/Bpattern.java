public class Bpattern {
    public static void main(String[] args) throws InterruptedException {
        int n =9;

        for (int i = 0; i < n; i++) {
          for (int j = 0; j <= n/2; j++) {
              if ((i == 0 && j < n / 2) || (j == 0) || (i == n / 2 && j!=n/2) || (j == n / 2 && i>0 && i!=n/2 && i!=n-1) || (i==n-1 && j!=n/2)  ) {
                  Thread.sleep(100);
                  System.out.print("* ");
              } else {
                  System.out.print("  ");
                  Thread.sleep(100);
              }
              
          }  
          System.out.println();
        }
    }
}

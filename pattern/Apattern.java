public class Apattern {
    public static void main(String[] args) throws InterruptedException{

        int n=7;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n/2+1; j++) {
        //         if ((i==0 && j < n / 2 && j!=0)||(j==0 && i!=0)||(i==n/2)||(j==n/2 && i!=0) ) {
        //             Thread.sleep(100);
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //             Thread.sleep(100);
        //         }
        //     }
        //     System.out.println();
        // }
        for (int i = 0; i < n; i++) {
   for (int j = 0; j < i; j++) {
    
   }
    
for (int j = n-1; j >= i; j--) {
        System.out.print("*");
}

System.out.println();
}

    }
}

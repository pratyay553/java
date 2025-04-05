public class Sawastik{
    public static boolean checkLeapyear(int y){
        if(y%4 != 0){
            return true;
        }

        return false;
    }
    public static void main(String[] args) throws InterruptedException {
        if (checkLeapyear(2020)) {
            System.out.println("y");
        }else{
            System.out.println("not");
        }
        // int n = 30;
        // for (int i = 0; i <= n; i++) {
        //     for (int j = 0; j <= n; j++) {
        //         if (j==(n/2) || i==(n / 2) || (i==0 && j>n / 2 ) || (j==0 && i<=(n / 2)) || (i==n && j<=(n / 2)) || (j==n && i>=(n / 2 ))) {
        //             Thread.sleep(100);
        //             System.out.print("* ");
        //         }else{
        //             Thread.sleep(100);
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
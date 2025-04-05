

public class HollowSquare{
//     public void m1(int n,int row,int n1){
//         if (n<0) {
//             return;
//         }

//         if (n==0) {
//            System.out.print(); 
//         }
      
//     }
// public void pattern(int n){
//     if(n<0){
//         return;
//     }
    
    

// }

public static void main(String[] args) {
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 6; j++) {
            if(i == 0 || j == 0 || i == 5 || j == 5){
                System.out.print("* ");
            }
            else{
                System.out.print("   ");
            }
        }
        System.out.println();
    }
}
}
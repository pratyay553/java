public class FindMissing {
    public static int find(int[] a){
        // int cnt=1;
        // int missing = 0;
        int sum = 1;
        int sumo = 0;
        // inner1: for (int i = 1; i <= a.length; i++) {
            
        //     // if(cnt!=a[i]){
        //     //     missing = cnt;
        //     //     break inner1;
        //     // }
        //     //cnt++;
            
        //     // if (a[i]!=i+1) {
        //     //     return i+1;
        //     // } 

        // }
        int i = 0;
        while (i<a.length) { 
            sumo = sumo + a[i]; 
            i++;
            sum = sum + i;
            
        }
        int res = sumo - sum;
        System.out.println(sum);
        System.out.println(sumo);
        return res;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6,7,8,9};
        System.out.println(find(a));
    }
}

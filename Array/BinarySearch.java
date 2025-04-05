public class BinarySearch {
    public static  int findIndex(int[] a,int key){
        int l = 0;
        int h = a.length-1;
        int mid = l+(h-l)/2;
        while(l<h){
            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]>key){
                h = mid-1;
            }else if(a[mid]<key){
                l = mid + 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
       int[] a={1,2,3,4,5,6,7,8,9,0}; 
        int f = findIndex(a,5);
        System.out.println(f);
    }
}
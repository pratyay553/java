public class MedianSorted {
    // public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        
    // }

    public static void main(String[] args) {
        int[] nums1={3,4};
        int[] nums2 = {1,2};
        int[] k = new int[nums1.length + nums2.length];
        int n = 0;
        int j = 0;
        int s = 0;
        int sum =0;
        while (n<k.length) {
           if (j<nums1.length) {
            k[n]=nums1[j];
            sum = sum + k[n];
            j++;
            n++;
           }else{
            k[n]=nums2[s];
            sum = sum + k[n];
            n++;
            s++;
           }
                
        }

      
        System.out.println(sum);
        double median = sum / k.length;
       System.out.println(median);
       
    }
}

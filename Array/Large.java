class Large{
    public static int calculateLarge(int[] a){
        int l = Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
            if(l<a[i]){
                l = a[i];
            }
        }
        return l;
    }
    
    public static int calculateSmall(int[] a) {
        int s = Integer.MAX_VALUE;
        for (int i = 1; i < a.length; i++) {
            if (s > a[i]) {
                s = a[i];
            }
        }
        return s;
    }

    public static int calculateSecondLargest(int[] a) {
        int s = Integer.MIN_VALUE;
        int ss = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (s < a[i]) {
                 s = a[i];
            }
            if(ss<a[i] && a[i]<s){
                ss = a[i];
            }
        }
        return ss;
    }

    public static int calculateSecondSmallest(int[] a) {
        int s = Integer.MAX_VALUE;
        int ss = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (s > a[i]) {
                s = a[i];
            }
            if (ss > a[i] && a[i] > s) {
                ss = a[i];
            }
        }
        return ss;
    }
    public static void main(String[] args) {
        int[] a = {4,2,10,7,8,4,9,2};
        
        System.out.println("largest value is :"+calculateLarge(a));
        System.out.println("smallest value is: " +calculateSmall(a));
        System.out.println("second large :"+calculateSecondLargest(a));
        System.out.println("second large :" + calculateSecondSmallest(a));

    }
}
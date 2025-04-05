public class AverageFromArray {
    public static double positive(int[] a) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>0){
                sum = sum + a[i];
                count = count + 1;
            }
        }
        return sum/count;
    }

    public static double negative(int[] a) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                sum = sum + a[i];
                count = count + 1;
            }
        }
        return sum / count;
    }

    public static void main(String[] args) {
        int[] a = {1,-3,-4,6,7,2,9,0,-2};
        System.out.println(positive(a));
        System.out.println(negative(a));
    }
}

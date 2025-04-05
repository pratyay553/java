public class SumOfOdd {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,11};
        int sum = 0;
        for (int i : a) {
            if(i%2!=0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}

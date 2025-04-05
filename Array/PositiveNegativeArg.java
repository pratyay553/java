public class PositiveNegativeArg {

public static int[] arrangent(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>=0 && i<arr.length-1){
            for (int j = i+1; j < arr.length; j++) {

                if(arr[j]<0 && i < arr.length-1 && j<arr.length){
                    int k = j;
                    for (int j2 = i+1; j2 <= j; j2++) {
                        arr[j2]=arr[k++];
                    }

                }
            }
        }
    }
    return arr;
}

    public static void main(String[] args) {
        int[] arr = {1,2,3,4-5,-6,-7,8,9};
        System.out.println(arrangent(arr));
    }
}

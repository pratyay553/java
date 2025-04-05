

public class FrequencyOfElement {
    public static void occurance(int[] a){
        int[] m = new  int[a.length];
        for (int i = 0; i < a.length-1; i++) {
            m[i] = 1;
                   
            for (int j = i+1 ; j < a.length; j++) {
                if(a[i] == a[j] && a[j]!=-1 && a[i]!=-1){
                    a[j]=-1;
                    m[i]++;   
                }
            }       
        }
       for (int i = 0; i < a.length; i++) {
        if (a[i]!=-1) {
            System.out.println(a[i] + " occured "+ m[i] + " times");
        }
       }
    }
    public static void main(String[] args) {
        int[] a = {3,4,4,7,4,5,3,5,6,8,8,9,2};
        occurance(a);
    }

}

package mjava;

public class Pairsum {
    public Pairsum(int a[],int n,int sum){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == sum) {
                System.out.println(i);
            }
            for (int index = i+1; index < a.length; index++) {
                if(a[i]+a[index]==sum){
                    System.out.println(i+" ,"+index);
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,4,5,7,8,4};
        int len = a.length;
        int sum = 5;
        Pairsum p1 = new Pairsum(a,len,sum);
        
    }
}

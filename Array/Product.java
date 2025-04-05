public class Product {
    public static void main(String[] args) {
        int[] a = {1,2,5,6,7,8,9};
        int product = 1;
        for (int i : a) {
            if (i != 0) {
                product = product * i;
            }           
        }
        System.out.println(product);
    }
}

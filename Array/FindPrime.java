public class FindPrime {
    public static void main(String[] args) {
        int[] a = { 2, 43, 65, 68, 12, 55 };
        for (int i = 0; i < a.length; i++) {
            int cnt = 0;
            for (int j = 1; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    cnt++;
                }
            }
            if (cnt <= 1) {
                System.out.println(a[i]);
            }

        }
    }
}

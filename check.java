package mjava;

public class check {
    int a;
    int b;

    public void m1() {
        System.out.println(this.a);
        System.out.println(this.b);
    }

    check(int a) {
        this.a = a;

    }

    check(int a, int b) {
        this(a);
        this.b = b;
    }

    public static void main(String[] args) {
        check c1 = new check(8, 9);
        c1.m1();

    }
}

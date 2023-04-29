public class recursion {
    public static void print(int i) {
        if (i == 0)
            return;
        System.out.println(i);
        print(i - 1);

    }

    public static void print1(int n) {

        if (n == 6)
            return;

        System.out.print(n);
        print1(n + 1);

    }

    public static void sum(int i, int n, int s) {

        if (i == n) {
            s += i;
            System.out.println(s);
            return;
        }
        s += i;
        sum(i + 1, n, s);
    }

    public static int facto(int n) {
        int fact = 1;
        if (n == 1 || n == 0) {
            return 1;
        }

        return fact = n * facto(n - 1);

    }

    public static void main(String args[]) {

        // print(5);
        // print1(1);
        // sum(1, 5, 0);
        System.out.println(facto(4));

    }

}

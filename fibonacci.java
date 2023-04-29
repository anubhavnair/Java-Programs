public class fibonacci {

    public static void fib(int a, int b, int n) {

        if (n == 0) {
            return;

        }

        int c = a + b;
        System.out.print(c);
        fib(b, c, n - 1);
    }

    public static int power(int x, int n) {

        if (n == 0)
            return 1;
            

        int c = x * power(x, n - 1);
        return c;

    }

    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        System.out.print(a);
        System.out.print(b);
        fib(a, b, 5);
    }

}

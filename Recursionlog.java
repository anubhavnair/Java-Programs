public class Recursionlog {

    public static int lognHight(int x, int n) {

        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int c = x* lognHight(x, n / 2);

        return c;
    }

    public static void main(String args[]) {

        int c = lognHight(2, 5);
        System.out.println(c);
    }

}

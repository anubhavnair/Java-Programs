public class Power {

    public static int powerOf(int x, int n) {
        int pow;
        if (n == 0) {
            return 1;

        }
        if (x == 0)
            return 0;
        else

            return pow = x * powerOf(x, n - 1);

    }

    public static void main(String args[]) {
        System.out.print(powerOf(2, 4));

    }

}

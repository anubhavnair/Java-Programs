public class FactorialByRecursion {

    public static int factorial(int n) {
        int f = 1;
        if (n == 1 || n == 0)
            return 1;
        else

            return f = n * factorial(n - 1);

    }

    public static void main(String args[]) {
        int n = 5;

        System.out.print(factorial(n));

    }

}

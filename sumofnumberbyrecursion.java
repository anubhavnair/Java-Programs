

public class sumofnumberbyrecursion {

    public static int sumOfNumber(int i, int sum, int number) {

        if (number == 0)
            return sum;

        else {

            sum += i;
            return sumOfNumber(i + 1, sum, number - 1);

        }
    }

    public static void main(String args[]) {
        int z = sumOfNumber(1, 0, 5);
        System.out.println(z);

    }

}

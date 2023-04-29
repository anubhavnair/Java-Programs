public class PrintSumOfNatural {

    public static int givSumUpto(int n, int sum, int i) {

        if (i == n) {
            sum = sum + i;
            return sum;

        }else
        {
            return sum+i+givSumUpto(n, sum, i+1);
        }
    }

    public static void main(String args[]) {
        int s = givSumUpto(5, 0, 1);
        System.out.println(s);
    }

}

import java.util.*;

public class Sumofn {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int sum = 0;

        System.out.println("enter the number upto you want the sum");
        int n = in.nextInt();

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.print("The sum of "+n+"given number is "+sum);
        in.close();
    }
}
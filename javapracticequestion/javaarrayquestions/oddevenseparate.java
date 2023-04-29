import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.swing.SpinnerDateModel;;

public class oddevenseparate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fst[] = new int[n];
        int sec[] = new int[n];
        int th[] = new int[n];
        int j = 0;
        int k = 0;
        System.out.println("enter elements");

        for (int i = 0; i < n; i++) {
            fst[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (fst[i] % 2 == 0) {
                sec[j] = fst[i];
                j++;
            } else {
                th[k] = fst[i];
                k++;
            }
        }
        System.out.println("odd array");
        for (int i = 0; i <j; i++) {
            System.out.println(th[i]);

        }
        System.out.println("even array");
        for (int i = 0; i <k; i++) {
            System.out.println(sec[i]);
        }
    }

}

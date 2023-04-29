import java.util.*;

public class Table {

    public static void main(String args[]) {
        System.out.println("enter the number upto table you want");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "X" + j + "=" + i * j);
            }
            System.out.println();
        }

        in.close();
    }
}
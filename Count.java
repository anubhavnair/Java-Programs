
import java.util.*;

public class Count {

    public static void main(String args[]) {

        Scanner n = new Scanner(System.in);

        int pos = 0;
        int neg = 0;
        int zer = 0;
        System.out.println("enter the E for exit");

        do {

            System.out.println("ener number");
            int b = nextInt();

            if (b > 0)
                pos++;
            else if (b < 0)
                neg++;
            else
                zer++;

        } while (true);
    }

    private static int nextInt() {
        return 0;
    }
}
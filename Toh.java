import java.util.*;

public class Toh {

    public static void Tower(int n, String source, String helper, String Destination) {

        if (n == 1) {
            System.out.println("Transfer disc" +" "+ n + " "+"from " + source +" "+ "to" + " "+ Destination);
            return;
        }

        Tower(n - 1, source, Destination, helper);
        System.out.println("Transfer disc" +" "+ n + " "+"from " + source + "to" + Destination);
        Tower(n - 1, helper, source, Destination);

    }

    public static void main(String args[]) {

        int n;
        String S="Source";
        String H="Helper";
        String D="Destination";

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Tower(n,S,H,D);
    }
}
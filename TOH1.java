public class TOH1 {
    public static void sToh(int n, char s, char h, char d) {

        if (n == 1) {
            System.out.println("transfer" + " " + n + "Disc" + "from" + " " + s + "to" + " " + d);
            return;
        }

        sToh(n - 1, s, d, h);
        System.out.println("transfer" + " " + n + "Disc" + "from" + " " + s +" "+ "to" + " " + d);
        sToh(n - 1, h, s, d);
    }

    public static void main(String args[]) {

        sToh(3,'s','h','d');
    }
}
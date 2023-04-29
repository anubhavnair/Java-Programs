public class pascalbyfor {
    public static void main(String args[]) {

        int i, j, k;
        int a, b, c;

        for (i = 0; i <= 4; i++) {
            for (j = 0; j <= 4 - i; j++) {

                System.out.print("  ");
            }
            for (j = 0; j <= i; j++) {
                k = 1;
                a = 1;
                while (k <= i) {
                    a = a * k;
                    k++;
                }
                k = 1;
                b = 1;
                while (k <= j) {
                    b = b * k;
                    k++;
                }
                k = 1;
                c = 1;
                while (k <= i-j) {
                    c = c * k;
                    k++;
                }

                System.out.print(a / (b * c)+"  ");

            }
            System.out.println();
        }
    }
}
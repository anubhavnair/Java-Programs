public class Pascal {

    public static void main(String args[]) {

        int i, j, k;
        int a, b, c;

        for (i = 0; i <= 8; i++) {

            for (j = 0; j <= 8 - i; j++) {
                System.out.print(" ");

            }

            for (j = 0; j <= i; j++) {

                a = 1;
                k = 1;

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
                c = k;
                while (k <= i - j) {
                    c = c * k;
                    k++;
                }
                System.out.print(a / (b * c)+"  ");

            }
            System.out.println();

        }

    }
}
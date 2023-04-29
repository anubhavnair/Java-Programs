import java.util.Scanner;

public class Array_descending {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int i, j, k;
        System.out.println("enter first array size");
        a = sc.nextInt();
        System.out.println("enter the second array size");
        b = sc.nextInt();

        int ar1[] = new int[a];
        int ar2[] = new int[b];
        int ar3[] = new int[a + b];

        System.out.println("Enter First Array's Element");
        for (i = 0; i < ar1.length; i++) {
            System.out.println("Enter " + " " + i + 1 + " elemet");
            ar1[i] = sc.nextInt();
            ar3[i] = ar1[i];

        }
        System.out.println("enter second Array Elemetn");

        for (j = 0; j < ar2.length; j++) {
            ar2[j] = sc.nextInt();
            ar3[i] = ar2[j];
            i++;
        }

        for (i = 0; i < ar3.length; i++) {

            for (j = i + 1; j < ar3.length; j++) {

                if (ar3[i] < ar3[j]) {
                    int t = ar3[i];
                    ar3[i] = ar3[j];
                    ar3[j] = t;
                }
            }

        }

        for (int l : ar3) {
            System.out.print(l+" ");
            
        }

    }
}

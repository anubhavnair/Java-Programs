import java.util.Scanner;

public class Find_unique_element_array {

    public static void main(String[] args) {

        int arr[] = new int[10];
        int i, j, k;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

        }

        for (i = 0; i < 5; i++) {
            count = 0;
            for (j = 0; j < i - 1; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                }

            }

            for (k = i + 1; k < 5; k++) {

                if (arr[i] == arr[k]) {
                    count++;
                }

            }

            if (count == 0) {

                System.out.println(arr[i]);
            }

        }

    }

}

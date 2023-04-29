import java.util.Scanner;

class Array_Duplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element");
        int n = sc.nextInt();
        int i, j;
        int count = 0;
        int a = 1;

        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int arr3[] = new int[n];

        for (i = 0; i < n; i++) {

            System.out.println("enter element");
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
            arr3[i] = 0;

            for (j = 0; j < n; j++) {

                if (arr1[i] == arr2[j]) {
                    arr3[j] = a;
                    a++;
                }

            }
            a = 1;

            if (arr3[i] == 2) {
                count++;
            }
        }

        System.out.println("In The Given Array There are :" + count + "Duplicate values  are present");

    }

}
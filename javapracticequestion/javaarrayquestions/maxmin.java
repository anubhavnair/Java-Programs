import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element");
        n = sc.nextInt();
        int arr[] = new int[n];
   
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {

            for (int j = i+1; j < n; j++)

            {
                if (arr[j] <= min) {
                    min = arr[j];
                }
                 else if (arr[j] >= max) {
                    max = arr[j];
                }
            }
        }
        System.out.println("max is " + max);
        System.out.println("min is " + min);
    }

}

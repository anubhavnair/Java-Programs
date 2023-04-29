import java.util.Scanner;

public class matrix {

    public static void main(String[] args) {

        int arr[][] = new int[3][5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                arr[i][j]=sc.nextInt();

            }
        }

        for(int k=0;k<3;k++){

            for(int l=0;l<5;l++){

                System.out.print(arr[k][l]);
            }
            System.out.println("   ");
        }
    }
}

import java.util.Scanner;

public class anubhav {

    public static void main(String args[]) {

        int[] marks = new int[5];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            marks[i] = in.nextInt();

        }

        for (int element : marks) {
            System.out.print(marks[element]);
        }
        in.close();

    }

}
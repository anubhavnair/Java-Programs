import java.util.Scanner;

public class sumoff {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = 0;

        System.out.println("hown many nummber have to add");
        int z = sc.nextInt();

        int number[] = new int[z];

        for (int i = 0; i < z; i++) {

            number[i] = sc.nextInt();
            s += number[i];
        }

        System.out.println("sum of given" + z + "number is ::" + s);

        sc.close();

    }

}

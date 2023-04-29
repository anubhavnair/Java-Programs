import java.util.Scanner;

public class factorial {

    public static void main(String args[]) {

        int fact = 1;

        int i = 1;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number you want to factorial");
        int num = n.nextInt();
        while (i <= num) {

            fact *= i;
            i++;

        }

        System.out.println("The factorial of given number i s" + fact);
        n.close();

    }

}

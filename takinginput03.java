import java.util.Scanner;

public class takinginput03 {

    public static void main(String args[]) {
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the fist number ");
        int a = sc.nextInt();
        System.out.println("enter the second number ");
        int b = sc.nextInt();

        int c = a + b;
        System.out.println("the sum is \n");
        System.out.println(c);
        sc.close();

    }
}

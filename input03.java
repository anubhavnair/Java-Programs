import java.util.Scanner;

public class input03 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number you wanna add");
        int a = sc.nextInt();
        System.out.println("enter the second number ");
        int b = sc.nextInt();

        System.out.println("THE sum is ");
        System.out.println(a + b);

        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println(name);

        sc.close();
    }
}

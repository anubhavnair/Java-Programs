import java.util.*;

public class Function {

    public static void main(String args[]) {

        int a;
        int b;

        Scanner in = new Scanner(System.in);

        System.out.println("enter the first number");
        a = in.nextInt();

        System.out.println("enter the second numbre");
        b = in.nextInt();

        int c = add(a, b);

        System.out.println("The sum is :" + c);
        in.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }

}
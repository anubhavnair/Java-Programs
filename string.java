import java.util.Scanner;

public class string {

    public static void main(String args[]) {

        Scanner n = new Scanner(System.in);
        System.out.println("enter your name herer");
        String name = n.nextLine();
        System.out.println("your name is " + name);

        n.close();

        String v = new String("anubhav nair");

        System.out.println(v);

    }

}

import java.util.Scanner;

public class switchcase {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        switch (a) {
            case 1: 
                System.out.println("you entered one");
                System.out.println("the next number is two");
                break;

            

        }
        in.close();
    }
}

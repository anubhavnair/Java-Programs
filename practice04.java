import java.util.Scanner;

public class practice04 {

    public static void main(String args[]) {

        int a, b, c, d, e;

        Scanner marks = new Scanner(System.in);

        System.out.println("enter the first subject marks");
        a = marks.nextInt();
        System.out.println("enter the second subjects marks");
        b = marks.nextInt();
        System.out.println("ente the third subject marks");
        c = marks.nextInt();
        System.out.println("enter the fourth subject marks");
        d = marks.nextInt();

        System.out.println("enter the fifth subject marks");
        e = marks.nextInt();

        float per = ((a + b + c + d + e) / 5);

        System.out.println("you got percent");
        System.out.println(per);

        marks.close();
    }

}

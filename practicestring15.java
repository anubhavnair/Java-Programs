import java.util.Scanner;

public class practicestring15 {
    public static void main(String args[]) {

        String name;
        Scanner s = new Scanner(System.in);
        System.out.println("\"Enter your string herer \"");

        name = s.nextLine();
        System.out.println(name.toLowerCase());

        s.close();

    }

}

import java.util.*;

public class Function1 {

    public static void printMyName(String n) {
        System.out.println("hello dear sir"  + "\t" +n  + "\t"+ "Goodmornig");
    }

    public static void main(String args[]) {

        String name;
        Scanner str = new Scanner(System.in);
        System.out.println("enter your name");
        name = str.nextLine();

        printMyName(name);
        str.close();
    }
}
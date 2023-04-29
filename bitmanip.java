import java.lang.ref.Reference;
import java.rmi.StubNotFoundException;

public class bitmanip {

    public static void main(String args[]) {
        int n = 5;
        int pos = 1;
        int reference = 1 << pos;

        System.out.println(n & reference);
        System.out.println(n | reference);
        System.out.println(n | ((reference)));

    }

}

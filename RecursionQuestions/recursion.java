
import javax.lang.model.element.Element;

public class recursion {

    public static int factorial(int number) {
        int fact = 1;
        if (number == 1 || number == 0) {
            return 1;
        } else
            return (number * factorial(number - 1));

    }

    public static void main(String args[]) {
        System.out.println(factorial(4));
    }

}

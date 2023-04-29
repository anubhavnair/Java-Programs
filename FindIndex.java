import java.util.*;

public class FindIndex {

    public static int first = -1;
    public static int last = -1;

    public static void findIndex(String str, int index, char ch) {

        if (index == str.length()) {

            System.out.print("fist index is " + first);
            System.out.print("fist index is " + last);
            return;

        }

        if (str.charAt(index) == ch) {

            if (first == -1) {
                first = index;
            
            }
            
             
            else
                last = index;
        }

        findIndex(str, index + 1, ch);

    }

    public static void main(String arg[]) {


        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your String");
        String str=sc.nextLine();
      
       

        findIndex(str,0,'a');


    }
}
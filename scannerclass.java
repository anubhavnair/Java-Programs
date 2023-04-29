import java.util.Scanner;

public class scannerclass {

    public  static void main(String args[])
    {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter YOur Name");
        String name = sc.nextLine();
        System.out.println(name);

        int a,b;
        System.out.println("enter the first value");
        a=sc.nextInt();
        System.out.println("enter the second value ");
        b=sc.nextInt();

        System.out.println("the addition of given number is "+" "+(a+b));
    }
    
}

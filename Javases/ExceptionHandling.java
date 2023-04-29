import java.util.Scanner;

public class ExceptionHandling {


    public static void main(String[] args) {
        
        int a,b,c;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter First Nummber");
        a=sc.nextInt();
        System.out.println("enter second number");
        b= sc.nextInt();
        try{

            System.out.println("The Divison of number is "+a/b);
        }
        catch(Exception E){
            
        }
        finally{
            System.out.println("by by");
        }



    }
    
}

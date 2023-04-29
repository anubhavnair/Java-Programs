import java.util.Scanner;

public class ArrayAccessing {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        int ind;
        arr[0]=1;

        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

       do{

        System.out.println("enter indext that you want to accessl");

       
         ind= sc.nextInt();

        try{
            System.out.println(arr[ind]);
        }
        catch(ArrayIndexOutOfBoundsException e){
               System.out.println("INdex se jada kaise access hoga bhai");
               
        }

       }
       while(true);

    }
    
}

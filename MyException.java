import java.util.Scanner;

class Ex extends Exception{

    public String toString(){
        return super.toString()+"i am toString()";
    } 
    public String getMessage(){
        return super.getMessage()+"i am get message()";
    }
}


public class MyException {
    
    public static void main(String[] args) {
        int a;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        if(a<99){


            try{
                throw new Ex();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}

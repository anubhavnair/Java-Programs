

public class Print10to1 {
    public static void print10to1(int number){
        if(number==0){
            return ;
        }

        System.out.print(number +" ");
        print10to1( number-1);
    }
    
    public static void main(String args[])
    {
        print10to1(10);
    }
}

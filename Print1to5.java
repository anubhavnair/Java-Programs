public class Print1to5{

    public static void print1to5(int i,int num){
        
        if(i==num){
            System.out.println(i);
            return;
        }


        System.out.println(i);
        print1to5(i+1, num);
    }

    public static void main(String args[])
    {

        print1to5(1, 10);
        
    }
    
}
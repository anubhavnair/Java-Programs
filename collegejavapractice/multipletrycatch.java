public class multipletrycatch {
    
    public static void main(String[] args) {
        
        try{
            // int a[]=new int[5];
            // a[5]=20/0;
            String s=null;
            System.out.println(s.length());

        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not possible");
        }
        catch(ArrayIndexOutOfBoundsException b){
            System.out.println("Invalid input");

        }
        catch(Exception e){
            System.out.println("parent Exception occures");

        }

        System.out.println("Rest of thee code is here");
    }
}

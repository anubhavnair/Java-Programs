public class PracException {

    public static void main(String[] args) {
        
        try{
            int x=5;
            int y=0;
            int ans=x/0;
            System.out.println("Quotienstn="+ans);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("this is remaining part of program");
    }
    
}

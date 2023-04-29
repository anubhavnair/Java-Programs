import java.io.PrintWriter;

public class Exeptionnhandling {


    public static void main(String[] args) {
       
       PrintWriter pw;
       try{
        pw=new PrintWriter("kec.text");
        pw.println("Saved");
       }catch(Exception e){
        System.out.println(e);
       }
       System.out.println("file saved succesfully");
    }
    
}

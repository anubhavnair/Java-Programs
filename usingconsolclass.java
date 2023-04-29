import java.io.*;
public class usingconsolclass {
    


    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("enter your name ");
        String str= c.readLine();

        System.out.println("YOur entered the strign ::"+str);
        System.out.println("enter password");
        char ch[]= c.readPassword();

        String pass = String.valueOf(ch);
        System.out.println("pass word is "+ pass);

        
    }
}

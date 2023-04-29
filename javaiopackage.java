import java.io.*;

public class javaiopackage {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);

         BufferedReader br = new BufferedReader(ir);
        System.out.println("enter string ");
        String str = br.readLine();
        System.out.println(str);
        System.out.println("enter numer ");
        int a = Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        System.out.println(a+b);

    }

}

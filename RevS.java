import java.util.*;

public  class RevS{

public static void strrev(int index, String str){

    if(index==0){
        System.out.println(str.charAt(index));
        return;

    }


    System.out.println(str.charAt(index));
    strrev(index-1,str);
}




    public static void main(String args[]){

    
        String str;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your String ");
        str=sc.nextLine();
        
        int index= (str.length()-1);
        strrev(index,str);
        

    }
}
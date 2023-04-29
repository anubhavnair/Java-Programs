package javaanj.classfiles;

public class method {

  int avg(int a, int b){
        return((a+b)/2);
    }

    public static void main(String[] args) {

        method obj= new method();
        int a= obj.avg(3, 5);
        System.out.println(a);

        
    }
    
}

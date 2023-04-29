class over{
   

     int add(int a, int b){
        return(a+b);
     }
}

class overM extends over{
    int add(int a, int b ,int c){
        return(a+b+c);
    }
}


public class override {

    public static void main(String[] args) {
        
        over o1=new over();
        overM m1=new overM();
       int a= o1.add(5, 6);
       int b= m1.add(6, 7, 8);
       System.out.println("sum is "+a);
       System.out.println("sum is "+b);

    }
    
}

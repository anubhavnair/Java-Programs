import java.nio.channels.AlreadyBoundException;

public class overloadingmethod {

 static  float area(float l,float w){
    return(l*w);
  }
  static  double  area(float  side ){
    return(side*side);
  }
   static float area(int radius){
    return(3.14f*radius*radius);
  }
   static float area(int base,int hight){ 
    return(1/2*base*hight);
  }

    public static void main(String[] args) {

        // System.out.println("sum of given number is:"+add(1,2,3));
        // System.out.println("sum of given number is:"+add(1.1f,2.8f,3.1f));
        // System.out.println("sum of given number is:"+add(1,2.8f,3.1d));
        // overloadingmethod o1;


        
        System.out.println("Area of Rectangle is "+area(4.5f,4.5f));
        System.out.println("Area of Squar is :"+area(2.5f));
        System.out.println("area of circle is "+area(5));
        System.out.println("are of triagnle is "+ area(2,5));


        
    }
    
}

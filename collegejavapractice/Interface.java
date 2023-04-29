interface Shape{
     void area();
    // void greet(){
    //     System.out.println("GOOD AFTERNOON Sir !");
    // }
}


class Rectangle implements Shape{
    int l;
    int b;
    Rectangle(int a, int c){
        l=a;
        b=c;
    }
   public void area(){
        System.out.println("The area of rectangle is ::" +l*b);
    }
}


class Circle implements Shape{
    int radious;
    Circle(int a){
       radious=a;
    }
 public void area(){
        System.out.println("The area of Circle is ::"+(3.14*radious*radious));
    }
}



public class Interface {

    public static void main(String[] args) {
        
        Shape rec= new Rectangle(4, 5);
        rec.area();
        // rec.greet();
        Shape cir= new Circle(5);
        cir.area();
        // cir.greet();
    }
    
}

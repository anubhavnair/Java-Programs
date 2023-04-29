abstract class  Shape{
    abstract void area();
    void greet(){
        System.out.println("GOOD AFTERNOON Sir !");
    }
}


class Rectangle extends Shape{
    int l;
    int b;
    Rectangle(int a, int c){
        l=a;
        b=c;
    }
    void area(){
        System.out.println("The area of rectangle is ::" +l*b);
    }
}


class Circle extends Shape{
    int radious;
    Circle(int a){
       radious=a;
    }
    void area(){
        System.out.println("The area of Circle is ::"+(3.14*radious*radious));
    }
}


public class Abstract {

    public static void main(String[] args) {
        
        Shape rec= new Rectangle(4, 5);
        rec.area();
        rec.greet();
        Shape cir= new Circle(5);
        cir.area();
        cir.greet();
    }
    
}

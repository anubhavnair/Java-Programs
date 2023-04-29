import java.net.SocketTimeoutException;

class Circle {

    double pi = 3.14;

    public double area() {

        calculate cal = new calculate();
        int qr = cal.squar(5); 
        // System.out.println("area of squar is :" + arapi * );

        return(pi*qr); 

    }

}

class calculate {
    int squar(int r) {
        return (r * r);
    }
}

public class CalculateArea {
  
    public static void main(String[] args) {

        Circle c1 = new Circle();
        double area= c1.area();

        System.out.println("area of gven circle "+area);
    }

}

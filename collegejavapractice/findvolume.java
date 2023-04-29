import java.util.*;

class Box{

    public int length;
    public int widhth;
    public int height;

    Box(){

        length=10;
        widhth=20;
        height=30;

        System.out.println("volume is ::"+(length*widhth*height));

    }
    Box(int a,int b, int c){
        length=a;
        widhth=b;
        height=c;

    }

  public int calculateVolume(){
        return(length*widhth*height);
    }
}




public class findvolume {
    

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number ");
         int a=sc.nextInt();
         System.out.println("enter second number ");
         int b=sc.nextInt();
         System.out.println("enter last number");
         int c=sc.nextInt();


        Box a1 =new Box(a,b,c)  ;
        Box b1= new Box();
        // System.out.println("the volume of the box is "+ a1.calculateVolume());
        int vol=a1.calculateVolume();
        System.out.println("the volume is "+ " "+vol);

        
    }
}

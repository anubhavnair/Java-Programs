class Counter1{
    int count =0;

    Counter1(){
        count++;

    }
  public  void show(){
    System.out.println(count);
    }
}





public class Counter {

   
    public static void main(String[] args) {
        Counter1 a=new Counter1();
        Counter1 b= new Counter1();   
       Counter1 c= new Counter1();
        a.show();
        b.show();
        c.show();
    }
}

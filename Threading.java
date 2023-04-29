
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<=10){

            System.out.println("MY cooking thread is running ");
            System.out.println("i am happy");
            i++;
        }

    }
}


class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<=40){

            System.out.println("MY thread 2  chatting with herj ");
            System.out.println("i am sad");
            i++;
        }

    }
}


public class Threading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2= new MyThread2();
        t1.start();
        t2.start();
        
    }
    
}

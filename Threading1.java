class MyThread1 extends Thread{

    public void run(){

        int i=0;
        while(i<=40){
            System.out.println("This is Thread 1");
            System.out.println("i am doing my first work");
            i++;
        }
    }
}

class MyThread2 extends Thread{

    public void run(){

        int i=0;
        while(i<=40){
            System.out.println("This is Thread 2");
            System.out.println("i am doing my second work");
            i++;
        }
    }
}



public class Threading1 {
    public static void main(String[] args) {
        
        MyThread1 m1= new MyThread1();
        MyThread2 m2= new MyThread2();
        m1.start();
        m2.start();
    }

    
}

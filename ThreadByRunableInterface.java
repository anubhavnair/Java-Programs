class MYThread1 implements Runnable {
    public void run() {
        int i = 0;

        while (i <= 10) {
            System.out.println("i am thread 1");
            i++;
        }
    }
}

class MYThread2 implements Runnable {
    public void run() {
        int i = 0;

        while (i <= 10) {
            System.out.println("i am thread 2");
            i++;
        }
    }
}

class ThreadByRunableInterface {

    public static void main(String[] args) {

        MYThread1 m1 = new MYThread1();
        Thread gun1 = new Thread(m1);
        MYThread2 m2 = new MYThread2();
        Thread gun2 = new Thread(m2);

        gun1.start();
        gun2.start();
    }

}
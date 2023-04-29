class animal {
    String color = "brownn";

    void Sleeping() {
        System.out.println(" animal sleeping");
    }
}

class dog extends animal {
    String color = "white";

    void colorprint() {
        System.out.println(color);
        System.out.println(super.color);

    }

    void sleeping() {
        System.out.println("dog is sleeping");
    }

    void bark() {
        System.out.println("dog is barking");
    }

    void work() {
        bark();
        super.Sleeping();
    }
}

public class methodcallsupper {

    public static void main(String[] args) {

        dog d1 = new dog();
        d1.colorprint();
        d1.work();
        d1.sleeping();
    }

}


abstract class pen {
    abstract void write();

    abstract void refil();
}

  class FountainPen extends pen {
     void write() {
        System.out.println("writing");
    }

    void refil() {
        System.out.println("Refilling");
    }

    void ChangeNib(){
        System.out.println("Changing Nib");
    }

}

public class abstractmethod {

    public static void main(String args[]) {
        FountainPen sc = new FountainPen();
        sc.ChangeNib();
    }

}

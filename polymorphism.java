interface smartphone {
    void ring();

    void calling();

}

interface camera {
    void click();
}

class both implements camera, smartphone {

    public void ring() {

        System.out.println("ring ring ");

    }

    public void calling() {
        System.out.println("calling to person");
    }

    public void click() {
        System.out.println("photo clicked");
    }

}

public class polymorphism {

    public static void main(String args[]) {

        camera bs = new both();
        // bs.calling();
    }
}
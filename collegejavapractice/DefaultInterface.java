interface A{

    void show();
    default void msg(){
        System.out.println("this is default");
    }
}

class B implements A{
    public void show(){
        System.out.println("welcome to  learning interfaces");
    }
}





public class DefaultInterface {
    
    public static void main(String[] args) {
        
        A a= new B();
        a.msg();
        a.show();
    }
}

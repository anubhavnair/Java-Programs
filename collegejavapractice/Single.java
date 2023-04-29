class Parent{

    void messegeParent(){
        System.out.println("Hello I am parent class ");

    }
}

class Child extends Parent{

    void messegeChild(){
        System.out.println("Hello I am child who extends the properties of parents class");
    }
}


public class Single {
    public static void main(String[] args) {

        Parent p1= new Parent();
        p1.messegeParent();
        // p1.child();

        Child c1= new Child();
        c1.messegeParent();
        c1.messegeChild();
        
    }
    
}

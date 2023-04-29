class animal{
    animal(){
        System.out.println("Animal is sleeping");

    }
}
class dog extends animal{

    dog(){
        super();
        System.out.println("dog is sleeping");
    }
}



public class supperconstructor {
    public static void main(String[] args) {

        dog d1= new dog();
        
    }
}

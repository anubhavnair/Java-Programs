class animal{

    void walk(){
        System.out.println("walking");
    }
    void eat(){
        System.out.println("eating");
    }
}

class Adimanav extends animal{

    void Farming(){
        System.out.println(" learned farming addtional");
    }

}

class Human extends Adimanav{

    void Comunicate(){
        System.out.println("Human communicate with");
    }
}




public class MultiLevel {

    public static void main(String[] args) {

        Human h1=new Human();
        h1.eat();
        h1.walk();
        h1.Farming();
        h1.Comunicate();


        
    }
    
}

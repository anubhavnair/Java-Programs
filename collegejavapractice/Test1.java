class Animal{
    void sound(){
        System.out.println("ye animal class hai ");
    }
}
class Dog{
    void sound(){
        System.out.println("dogs bark and sound like bhau bhau");
    }
}


public class Test1 {
  public static void main(String[] args) {
    Animal a1=new Animal();
    Dog d1= new Dog();
    a1.sound();
    d1.sound(); 
  }

    
}

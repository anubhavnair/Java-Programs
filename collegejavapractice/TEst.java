class animal{
    String color="brownn";
}
class dog extends animal{
    String color="white";
    void colorprint(){
        System.out.println(color);
        System.out.println(super.color);
    
    }
}


public class TEst {

    public static void main(String[] args) {

        dog d1= new dog();
        d1.colorprint();
        
    }
    
}

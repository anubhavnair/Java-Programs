class a{
    public int x=25;
    protected int y=65;
    int z= 87;
    private int l=95;

    public void prinnt(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(l);
    }
}

public class AcessModifiers {

    public static void main(String[] args) {
        
        a a1= new a();
        a1.prinnt();
    }
    
}

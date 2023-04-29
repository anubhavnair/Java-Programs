class Stud{
    int roll_no;
    String name;
    static String cname="KEC";

    Stud(int r, String n){
        roll_no=r;
        name=n;

    }
    static void change(){
        cname="KISC";
    }

    void display(){
        System.out.println(roll_no);
        System.out.println(name);
        System.out.println(cname);
    }


    
}



public class staticmethod {
    
}

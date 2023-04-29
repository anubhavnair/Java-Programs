class Stud{
int roll_no;
String name;
Stud(int n, String s){

    roll_no=n;
    name=s;



}

void display(){
    System.out.println("roll number is "+ roll_no);
    System.out.println("name is "+ name);
}


}




public class ParaMeter {

public static void main(String args[]){

 Stud s1= new Stud(1001,"Anubhav");
 Stud s2 = new Stud(1002,"Resham");

 s1.display();
 s2.display();

}
    
}

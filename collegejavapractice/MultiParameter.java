class Stud{
    int roll_no;
    String name;
    int sesion;
    Stud(int n, String s){
    
        roll_no=n;
        name=s;
        
    
    
    
    }

    Stud(int n, String s, int ssn){
        roll_no=n;
        name=s;
        sesion=ssn;

    }
    
    void display(){
        System.out.println("roll number is "+ roll_no);
        System.out.println("name is "+ name);
        System.out.println("session is "+sesion);
    }


    
    
    }
    
    
    
    
  
    
   
    
   
    


public class MultiParameter {
    
   
    public static void main(String args[]){
    
     Stud s1= new Stud(1001,"Anubhav");
     Stud s2 = new Stud(1002,"Resham");
     Stud s3=new Stud(1003,"gulshan",2025);
    
     s1.display();
     s2.display();
    
    }
       




}

import java.util.ArrayList;


public class CollectFramework_arraylist {
    
    public static void main(String[] args) {


        ArrayList<Integer> li= new ArrayList<>();
        ArrayList<Integer> li1= new ArrayList<>(5);
        li1.add(5);
        li1.add(5);
        li1.add(5);
        li1.add(5);
        li1.add(5);
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        // li.add(12,5);
        li.set(1,55000);

        // new ArrayList<Integer>()=li.clone();
       System.out.println(li.contains(10));


       
        li.addAll(3, li1);
         for( int i=0;i<li.size();i++){
            System.out.println(li.get(i));
        }
   
    }
}

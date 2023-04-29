public class printStrin{



    public static void printStringRev(int index, String Name)
    {
        if(index==0){
            System.out.print(Name.charAt(index));
            return;
        }
        System.out.print(Name.charAt(index));
        printStringRev(index-1,Name);

    }

    public static void main(String args[])
    {

        // int marks[]={7,8,3,1,2};

        String Name="Anubhav Nair";
        int index=Name.length()-1;

        printStringRev(index,Name);


    }
}
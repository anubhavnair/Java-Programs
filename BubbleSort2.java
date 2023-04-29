public class BubbleSort2{
 
    public static void printArray(int ary[]) {

        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");
        }
    }
    
 
 
    public static void main(String args[])
    {



        int mark[]={7,8,3,1,2};

        for(int i=0;i<mark.length-1;i++){

            for(int j=0;j<mark.length-i-1;j++)
            {
                if(mark[j]>mark[j+1]){

                    int t= mark[j];
                    mark[j]=mark[j+1];
                    mark[j+1]=t;
                }
            }
        }





        printArray(mark);

    }
}
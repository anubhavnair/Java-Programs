public class SelectionSort3{

    public static void printArray( int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }





    public static void main(String args[])
    {

        int number[]={7,8,3,1,2};

        for(int i=0;i<number.length;i++){

            for(int j=i+1;j<number.length;j++)
            {
                if(number[i]>number[j]){
                    int t=number[i];
                    number[i]=number[j];
                    number[j]=t;
                }
            }
        }

        printArray(number);
    }
}
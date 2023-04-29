public class selectionsort {

    public static void show(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {

        int i, j, small;
        int number[] = { 7, 8, 3, 1, 2 };

        for (i = 0; i < number.length-1; i++) {
            small=i;

            for(j=i+1;j<number.length;j++){
                if(number[small]>number[j])
                {
                    small=j;

                }

                int t= number[small];
                number[small]=number[i];
                number[i]=t;
            }
        }

        show(number);
   


    }
}
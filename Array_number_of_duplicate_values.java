import java.util.Scanner;

public class Array_number_of_duplicate_values {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int arr1[]=new int[5];
        int arr2[]=new int[5];
        int arr3[]=new int[5];
        int i,j;
        int mm=1;
        int count=0;

        for(i=0;i<5;i++){

            System.out.println("Enter Element");
            arr1[i]=sc.nextInt();

            arr2[i]=arr1[i];
            arr3[i]=0;
            

            for(j=0;j<5;j++){
                if(arr1[i]==arr2[j]){
                    arr3[j]=mm;
                    mm++;
                }
            }
            mm=1;

            if(arr3[i]==2){
                count++;
            }

        }


        System.out.println("The number of Duplicate values is ::" +count);

        sc.close();
    }

}

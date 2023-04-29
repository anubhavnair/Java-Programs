import java.util.Scanner;

public class ArrayUnique {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elementt");
        int n= sc.nextInt();
        int i,j,k;
        int count=0;
        int arr[]=new int[n];

        System.out.println("The unique element is :: ");

        for(i=0;i<n;i++){
            System.out.println("enter the elemet");
            arr[i]=sc.nextInt();

            count=0;
            for(j=0;j<1-i;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            for(k=i+1;k<n;k++){
                if(arr[i]==arr[k]){
                    count++;
                }
            }

            if(count==0){
                System.out.println(arr[i]);
            }

        }
        
    }
    
}

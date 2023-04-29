import java.util.Scanner;

public class Element_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k, n;
        int count = 1;

        System.out.println("enter the number of element");
        n = sc.nextInt();
        int arr1[] = new int[n];

        int arr2[] = new int[n];

        for(i=0;i<n;i++){
            arr1[i]=sc.nextInt();
            arr2[i]=-1;
            
        }

    for(i=0;i<n;i++)
    {
        count=1;
        for(j=i+1;j<n;j++){
            if(arr1[i]==arr1[j]){
                count++;
                arr2[j]=0;
            }
        }
        if(arr2[i]!=0){
            arr2[i]=count;
            System.out.println(arr1[i] +"is presend"+arr2[i]);
        }
    }
    }

}

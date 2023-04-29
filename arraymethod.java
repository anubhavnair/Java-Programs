public class arraymethod {


  static  int  minOfArray(int[]a) {
        
        int min=a[0];

        for(int i=1;i<a.length;i++){
            if(min>a[i])
            {
                min=a[i];
            }
        }

        return(min);

        
    }

    public static void main(String[] args) {
        

                int []a={8,10,9,8,7,5,1};

               int c= minOfArray(a);
               System.out.println("the minimum value of given arrayy "+ c);



    }
    
}

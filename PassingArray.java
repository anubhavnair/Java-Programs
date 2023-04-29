// package collegejavapractice;


public class PassingArray {


    static int[] printArray(){
        return(new int[]{45,77,100,98,81});
    }
    

  public static void main(String[] args) {
    

    int[]a= printArray();

    for (int i : a) {
        System.out.println(i);
    }
  }


    
}

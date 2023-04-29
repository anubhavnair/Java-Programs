public class FindIndex1 {

    public static int first = -1;
    public static int last = -1;

    public static void findIndex( int i,String str, char ele) {

        if (i == str.length() ) {
            System.out.print("first time element found at index" + " " + first);
            System.out.print("last time element found at index" + " " + last);
            return;
        }

        if (str.charAt(i) == ele) {

            if (first == -1) {
                first = i;

            } 
            else{

                last = i;
            }
        }
    findIndex(i+1,str,ele);
    }

    public static void main(String args[]) {

        String str = "aaabbbsssaaa";

        findIndex( 0 ,str, 'a');

    }
}
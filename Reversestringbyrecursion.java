public class Reversestringbyrecursion {

    public static void revString(int index, String str) {
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index) + " ");
        revString(index - 1, str);

    }

    public static void main(String args[]) {
        String str = "Anubhav Nair";
        int index=(str.length()-1);
        revString( index, str);

    }

}

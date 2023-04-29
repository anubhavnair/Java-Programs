public class occarance {

    public static int first = -1;
    public static int last = -1;

    public static void occarance(int index, char ele, String str) {
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if (str.charAt(index) == ele) {
            if (first == -1)
                first = index;
            else
                last = index;
        }
        occarance(index+1, ele, str);

    }

    public static void main(String args[]) {
        int index = 0;
        occarance(index, 'a', "anubhav nair");
    }

}

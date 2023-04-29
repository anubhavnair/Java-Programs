import java.util.HashSet;

public class uniqesubseq {

    public static void printSubseq(String str, int index, String newStr, HashSet<String> set) {
        if (index == str.length()) {
            if(set.contains(newStr)){

                return;
            }
            else
            {

                System.out.println(newStr);
                set.add(newStr);
                return;
            }


        }

        char curentchar = str.charAt(index);

        // if its in then
        printSubseq(str, index + 1, newStr + curentchar,set);

        // if it not in
        printSubseq(str, index + 1, newStr,set);
    }

    public static void main(String args[]) {

        HashSet<String> set= new HashSet<>();

        printSubseq("aaa", 0, " ", set);

    }

}

import javax.print.attribute.standard.PrinterName;

public class subsequence {

    public static void printSubseq(String str, int index, String newStr) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        char curentchar = str.charAt(index);

        // if its in then
        printSubseq(str, index + 1, newStr + curentchar);

        // if it not in
        printSubseq(str, index + 1, newStr);
    }

    public static void main(String args[]) {


        printSubseq("abc", 0, " ");

    }



}

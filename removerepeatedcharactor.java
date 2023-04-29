public class removerepeatedcharactor {

    public static boolean map[] = new boolean[26];

    public static void removeRepeatedchar(String str, int index, String newStr) {

        if (index == str.length()) {
            System.out.println(newStr);
            return;   
        }

        if ((map[str.charAt(index) - 'a'] == true)) {
            removeRepeatedchar(str, index + 1, newStr);
        } else {
            newStr += str.charAt(index);
            map[str.charAt(index) - 'a'] = true;
            removeRepeatedchar(str, index + 1, newStr);

        }

    }

    public static void main(String args[]) {

        String str = "aaabbbaaaacjjj";
        int index = 0;
        removeRepeatedchar(str, index, "");

    }

}

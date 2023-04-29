public class stringmethod14 {

    public static void main(String args[]) {

        String name = "anubhav nair";

        System.out.println(name);

        System.out.println("The length of given string is ::" + name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 11));
        System.out.println(name.replace('a', 's'));
        System.out.println(name.replace("anu", "vai"));
        System.out.println(name.startsWith("anu"));
        System.out.println(name.endsWith("nair"));
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf("nair"));
        System.out.println(name.indexOf("anu", 2));
    }

}

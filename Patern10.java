public class Patern10 {

    public static void main(String arg[]) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k <= 2* i-1; k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
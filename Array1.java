public class Array1 {

    public static void main(String args []) {

        int array[][][] = new int[2][5][3];

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 5; j++) {

                for (int k = 0; k <3; k++) {
                    System.out.print(array[i][j][k]);
                }
                System.out.println();
            }
        }
    }
 
}

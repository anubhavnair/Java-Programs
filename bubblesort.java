
public class bubblesort {
    public static void main(String args[]) {

        int number[] = { 7, 8, 3, 1, 2 };
        int i, j;
        int size = number.length;

        // bubble sort which swap the element into assending order....

        for (i = 0; i < size - 1; i++) {
            for (j = 0; j < size - i - 1; j++) {
                if (number[j] > number[j + 1]) {
                    int t = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = t;
                }
            }
        }

        for (i = 0; i < number.length; i++) {

            System.out.print(number[i] + "  ");

        }

        // bubble sortt dessending order
        int des[] = { 2, 1, 3, 8, 7 };
        for (i = 0; i < des.length - 1; i++) {
            for (j = 0; j < des.length - i - 1; j++) {
                if (des[j] < des[j + 1]) {
                    int t = des[j];
                    des[j] = des[j + 1];
                    des[j + 1] = t;
                }
            }
        }

        for (i = 0; i < des.length; i++) {

            System.out.print(des[i] + "  ");

        }
    }

}
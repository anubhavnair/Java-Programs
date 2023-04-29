
public class InsertionSort {

    public static void printArray(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }
    }

    public static void main(String args[]) {

        int number[] = { 7, 8, 3, 1, 2 };

        for (int i = 1; i < number.length; i++) {

            int cur = number[i];
            int j = i - 1;
            while (j >= 0 && cur< number[j]) {
                number[j + 1] = number[j];
                j--;

            }
            number[j + 1] = cur;
        }
        printArray(number);
    }

}

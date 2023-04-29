public class SlectionnSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String args[]) {

        int number[] = { 7, 8, 3, 2, 1 };
        int small = 0;

        for (int i = 0; i < number.length - 1; i++) {
            small = i;
            for (int j = i + 1; j < number.length; j++) {

                if (number[small] > number[j]) {
                    small = j;
                }

            }
            int t = number[small];
            number[small] = number[i];
            number[i] = t;

        }
        printArray(number);
    }

}
public class Bubble {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int number[] = { 7, 8, 3, 1, 2 };

        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - 1; j++) {

                if (number[j] > number[j + 1]) {

                    int t = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = t;

                }
            }
        }

        printArray(number);

    }

}

public class insertion1 {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int number[] = { 7, 8, 3, 1, 2 };

        for (int i = 1; i < number.length; i++) {
            int curent = number[i];
            int j = i - 1;

            while (j >= 0 && curent > number[j]) {
                number[j + 1] = number[j];
                j--;

            }
            number[j + 1] = curent;
        }
        printArray(number);

    }

}

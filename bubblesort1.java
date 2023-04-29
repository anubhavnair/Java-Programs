public class bubblesort1 {

    public static void printArray(int ary[]) {

        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");
        }
    }

    public static void main(String args[])

    {

        int number[] = { 7, 8, 3, 1, 2 };
        System.out.println("Before sorting array is :");
        printArray(number);
        System.out.println();
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - i - 1; j++) {

                if (number[j] < number[j + 1]) {
                    int t = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = t;

                }
            }
        }

        System.out.println("After sorting array is ::");
        printArray(number);

    }
}
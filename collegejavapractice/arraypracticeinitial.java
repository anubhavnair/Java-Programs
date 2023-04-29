// package collegejavapractice;  

class arraypracticeinitial {

    public static void main(String[] args) {
        int[] a = new int[] { 4, 3, 2, 1,5 };
        for (int i : a) {

            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {

            for (int j =i+1; j < 5; j++) {
                if (a[i] < a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;

                }
            }
        }

        for (int i : a) {

            System.out.println(i);
        }



    }

}

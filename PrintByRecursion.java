public interface PrintByRecursion {

    public static void printNumberByRecursion(int n) {
        
        if (n == 6)
            return;

        System.out.print(n+" ");
        printNumberByRecursion( n+1);
    }

    public static void main(String args[]) {
        printNumberByRecursion(1);
    }
}

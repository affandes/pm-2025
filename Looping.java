public class Looping {
    public static void main(String[] args) {
        printNumber(1);
    }

    public static void printNumber(int n){           
        if (n <= 1000) {
            System.out.println(n);
            printNumber(n + 1);
        }
    }
}

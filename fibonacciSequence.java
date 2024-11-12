import java.util.Scanner;

public class fibonacciSequence_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        long[] fib = Fibonacci(n);
        Array(fib);
    }
    public static long[] Fibonacci(int n) {
        long[] fib = new long[n];
        fib[0] = 0;
        if (n > 1) {
            fib[1] = 1;
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }
        return fib;
    }
    public static void Array(long[] arr) {
        System.out.println("Fibonacci Sequence Series is :");
        for (long num : arr) {
            System.out.print(num + " ");
        }
    }
}

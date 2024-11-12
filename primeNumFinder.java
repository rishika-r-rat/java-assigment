import java.util.Scanner;

public class primeNumFinder_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("check if your enter no is prime or not-------");
        System.out.println("Enter the integers:");
        for (int i = 0; i < 10; i++) {
            num[i] = scanner.nextInt();
        }

        System.out.println("Prime numbers are :");
        for (int num2 : num) {
            if (isPrime(num2)) {
                System.out.println(num2);
            }
        }
    }

    public static boolean isPrime(int num2) {
        if (num2 <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num2; i++) {
            if (num2 % i == 0) {
                return false;
            }
        }
        return true;
    }
}

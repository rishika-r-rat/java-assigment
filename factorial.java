import java.util.Scanner;

public class factorial_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Integer : ");
        int n = sc.nextInt();

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        int digitSum = 0;
        String factorialStr = Long.toString(fact);
        for (char c : factorialStr.toCharArray()) {
            digitSum += Character.getNumericValue(c);
        }

        System.out.println(n + "! = " + fact);
        System.out.println("Sum of digits: " + digitSum);


    }
}

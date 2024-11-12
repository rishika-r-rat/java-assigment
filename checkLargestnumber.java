import java.util.Scanner;

public class checkLargestnumber_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int secondLargest = findSecondLargest(numbers);

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest number: " + secondLargest);
        } else {
            System.out.println("No second largest number found.");
        }
    }
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE; // Not enough elements
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return (secondMax == Integer.MIN_VALUE) ? Integer.MIN_VALUE : secondMax;
    }
}

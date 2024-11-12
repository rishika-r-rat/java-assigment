import java.util.Scanner;

public class occurrences_search_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String inputString = sc.nextLine();
        System.out.print("Enter a character to search for : ");
        char targetChar = sc.next().charAt(0);

        int count = 0;
        for (char c : inputString.toCharArray()) {
            if (c == targetChar) {
                count++;
            }
        }
        System.out.println("The character '" + targetChar + "' appears " + count + " times in the string.");
    }
}


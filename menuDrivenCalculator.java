import java.util.Scanner;

public class menuDrivenCalculator_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter num2 : ");
        double num2 = sc.nextDouble();


        System.out.print("Choose an operation (1 = +,2 = -,3 = *,4 = /, 5 = exit) : ");
        int operation = sc.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Your sum is : " + (num1 + num2));
                break;
            case 2:
                System.out.println("Your sub is : " + (num1 - num2));
                break;
            case 3:
                System.out.println("Your mul is : " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Your Div is : " + (num1 / num2));
                } else {
                    System.out.println("Error You Can't divide Here!");
                }
                break;
            case 5:
                System.out.println("exited your calculator");
                break;
            default:
                System.out.println("Please choose operation between 1 to 5");
        }
    }
}

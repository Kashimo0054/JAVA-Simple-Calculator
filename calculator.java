import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your method of operation"); // Reading user input for operation ("+","-","/","*")
        String operation = scanner.nextLine();

        System.out.println("Enter your first number");

        int num1 = scanner.nextInt();

        System.out.println("Enter your first number");
        int num2 = scanner.nextInt();

        if (operation.equals("+")) {

            int addition = num1 + num2;
            System.out.println(addition);

        } else if (operation.equals("-")) {
            int subtraction = num1 + num2;
            System.out.println(subtraction);

        } else if (operation.equals("*")) {
            int multiplication = num1 * num2;
            System.out.println(multiplication);

        } else if (operation.equals("/")) {
            int division = num1 / num2;
            System.out.println(division);
        }

        scanner.close();
    }
}

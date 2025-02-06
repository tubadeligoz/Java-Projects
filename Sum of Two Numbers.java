import java.util.Scanner;  // Importing Scanner class for user input

public class SumExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Creating a Scanner object

        // Prompting the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();  // Reading the first integer

        // Prompting the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();  // Reading the second integer

        int sum = num1 + num2;  // Adding the two numbers

        // Displaying the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        input.close();  // Closing the Scanner to free resources
    }
}

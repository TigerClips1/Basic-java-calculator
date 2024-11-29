// Import the input class to I can get user input.
import java.util.Scanner;
// Make a main class.
public class Main {
    // Make a main function to the code can run.
    public static void main(String[] args) {
        // Try to catch any errors for example if import a string instead of a double or a float it will catch the error to you won't get a debugging wired error.
        try {
            // Handle the User input
            System.out.print("Enter a Number: ");
            Scanner num1 = new Scanner(System.in);
            double number1 = num1.nextDouble();
            System.out.print("Enter a operator: ");
            Scanner operator = new Scanner(System.in);
            String op = operator.nextLine();
            System.out.print("Enter anther number: ");
            Scanner num2 = new Scanner(System.in);
            double number2 = num2.nextDouble();
            //Handle the operator or math.
            switch (op)
            {
                case "+":
                    double plus = number1 + number2;
                    System.out.println("The answer is: " + plus);
                    break;
                case "-":
                    double minus = number1 - number2;
                    System.out.println("The answer is: " + minus);
                    break;
                case "*":
                    double times = number1 * number2;
                    System.out.println("The answer is: " + times);
                    break;
                case "/":
                    double divide = number1 / number2;
                    System.out.println("The answer is: " + divide);
                    break;
                case "%":
                    double remainder = number1 % number2;
                    System.out.println("The answer is: " + remainder);
                    break;
                default:
                    System.out.println("Please Enter an valid operator");

            }
        }
        // Catch the exception and make output something nice.
        catch (Exception e) {
            System.out.println("Please Enter an valid number");
        }
    }
}
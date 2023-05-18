import java.util.Scanner;

public class MethodsExercises {
    public static int addition(int numOne, int numTwo) {
        int sum = numOne + numTwo;
        return sum;
    }
    public static int subtraction(int numOne, int numTwo) {
        int sum = numOne - numTwo;
        return sum;
    }
    public static int multiplication(int numOne, int numTwo) {
        int sum = numOne * numTwo;
        return sum;
    }
    public static double division(int numOne, int numTwo) {
        int sum = numOne / numTwo;
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Basic Arithmetic

Create four separate methods. Each will perform an arithmetic operation:
Addition ,Subtraction, Multiplication, Division.
Each function needs to take two parameters/arguments so that the operation can be performed.
Test your methods and verify the output.
Add a modulus method that finds the modulus of two numbers.
Food for thought: What happens if we try to divide by zero? What should happen?
Bonus

Create your multiplication method without the * operator (Hint: a loop might be helpful).
Do the above with recursion.  */

        System.out.println(addition(10,5));
        System.out.println(subtraction(10,5));
        System.out.println(multiplication(10,5));
        System.out.println(division(10,5)); // Dividing by zero break the code

    }
}

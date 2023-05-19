import java.util.Scanner;

public class MethodsExercises {

    //Methods --------
//    private static int addition(int numOne, int numTwo) {
//        int result = numOne + numTwo;
//        return result;
//    }
//    private static int subtraction(int numOne, int numTwo) {
//        int result = numOne - numTwo;
//        return result;
//    }
//    private static int multiplication(int numOne, int numTwo) {
//        int result = numOne * numTwo;
//        return result;
//    }
//    private static double division(double numOne, double numTwo) {
//        double result = numOne / numTwo;
//        return result;
//    }
//    private static double modulus(double numOne, double numTwo) {
//        double result = numOne % numTwo;
//        return result;
//    }
//    private static int multiply(int numOne, int numTwo) {
//        int result = 0;                    //Give the first one a result of zero .
//        for(int i = 0; i < numTwo; i++){   //For every iteration of num2 it going to add the numone to the result
//            result  += numOne;
//        }
//        return result;
//
//    };
//    private static int recursion(int numOne, int numTwo) {
//       if(numTwo == 0){  // This is what stopping this from going on forever
//           return 0; // If this is any other number it return that number
//       } return numOne + recursion(numOne,numTwo -1); // There is a minus because this is going to subtract that
//        //number until it reaches the base case which is zero .
//    };


   // ----------------Number two exercise
//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        int userInput;
//
//        do {
//            System.out.printf("Please enter a number between %d and %d",min,max);
//            while (!scanner.hasNextInt()) {    //hasNextInt   method returns true if the next token in this scanner's input can be interpreted as an int value
//                System.out.print("Invalid input please try again ");
//                scanner.next();
//            }
//            userInput = scanner.nextInt();
//        } while (userInput < min || userInput > max);  // if the loop is outside the range of less than the number or greater than , the loop will continue
//
//        return userInput;
//    }





    // Number three exercise ---------------------------------

//    public static long factorial(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        long userInput;
//
//
//        do {
//            System.out.printf("Please enter a number between %d and %d  ",min,max);
//             userInput = scanner.nextLong();
//            System.out.println(userInput);
//
//            if (userInput < min || userInput > max){
//                System.out.println("Invalid input, please try again");
//            }
//
//        } while (userInput < min || userInput > max);  // if the loop is outside the range of less than the number or greater than , the loop will continue
//
//      //-----------factorial section -----------------
//            long factorial = 1;
//            for(int i = 1; i <= userInput; ++i)
//            {
//                // factorial = factorial * i;
//                factorial *= i;
//            }
//            System.out.printf("Factorial of %d = %d", userInput, factorial);
//
//
//
//        return userInput;
//    }

    //-------------------- Problem 4 ----------------------------

        public static long dice(int numOne, int numTwo){
            Scanner scanner = new Scanner(System.in);
        long userInput;

        do {
            System.out.printf("Please enter a number between %d and %d",numOne,numTwo);
            while (!scanner.hasNextInt()) {    //hasNextInt   method returns true if the next token in this scanner's input can be interpreted as an int value
                System.out.print("Invalid input please try again ");
                scanner.next();
            }
            userInput = scanner.nextInt();
        } while (userInput < numOne || userInput > numTwo);  // if the loop is outside the range of less than the number or greater than , the loop will continue

        return userInput;
    }














    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print out an equation");
//        System.out.println("Type in first Number");
//        int number1 = input.nextInt();
//        System.out.println("Type in second Number");
//        int number2 = input.nextInt();
//        int resultOfAddition = addition(number1,number2);
//        System.out.println(resultOfAddition + "  is the result of addition");
//
//        int resultOfSubtraction = subtraction(number1,number2);
//        System.out.println(resultOfSubtraction + "  is the result of subtraction");
//
//        int resultOfMultiplication = multiplication(number1,number2);
//        System.out.println(resultOfMultiplication + " is the result of multiplication");
//
//        double resultOfDivision= division(number1,number2);
//        System.out.println(resultOfDivision + "  is the result of division");
//        System.out.println("thank you for the math class proceed with this lesson");

       // This was for fun  trying to use a scanner


//        System.out.println(addition(10,5));
//        System.out.println(subtraction(10,5));
//        System.out.println(multiplication(10,5));
//        System.out.println(division(10,5)); // Dividing by zero break the code
//        System.out.println(modulus(10,8)); // Dividing by zero break the code
//        System.out.println(multiply(10,8)); //
//        System.out.println(recursion(1,9)); //

//-------------------- Problem 2 ----------------------------
/* Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range.
 If not, prompt the user to input their number again until the input is within range.
 The method signature should look like this:
 public static int getInteger(int min, int max);

and is used like this:

System.out.print("Enter a number between 1 and 10: ");
int userInput = getInteger(1, 10);

If the input is invalid, prompt the user again.

Hint: recursion might be helpful here!

 */

//        int userInput = getInteger(100, 1000);
//        System.out.println("Your number is  = " + userInput);



        // Number 3 ---------------------------

//        Calculate the factorial of a number.
//
//        Prompt the user to enter an integer from 1 to 10. ✅
//        Display the factorial of the number entered by the user.✅
//        Ask if the user wants to continue.
//        Use a for loop to calculate the factorial.
//                Assume that the user will enter an integer, but verify it’s between 1 and 10.
//        Use the long type to store the factorial.
//        Continue only if the user agrees to.
//        A factorial is a number multiplied by each of the numbers before it.
//                Factorials are denoted by the exclamation point (n!). Ex:
//
//
//        1! = 1               = 1
//        2! = 1 x 2           = 2
//        3! = 1 x 2 x 3       = 6
//        4! = 1 x 2 x 3 x 4   = 24

//        factorial(1,10);


        //Exercise 4 ------------------------------------

      /*  Create an application that simulates dice rolling.

        Ask the user to enter the number of sides for a pair of dice.
        Prompt the user to roll the dice.
        "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
        Use static methods to implement the method(s) that generate the random numbers.
         Use the .random method of the java.lang.Math class to generate random numbers.

       */





        dice(1,12);




    }
}

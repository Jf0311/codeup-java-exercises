import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

        int x = 5 * 4 % 3 ;
        System.out.println(x);
        //Welcome to the world of game development!
        //You are going to build a high-low guessing game. Create a class named HighLow inside of src.

        //The specs for the game are:
        //
        //Game picks a random number between 1 and 100.✅
        //Prompts user to guess the number.✅
        //All user inputs are validated.
        //If user's guess is less than the number, it outputs "HIGHER".
        //If user's guess is more than the number, it outputs "LOWER".
        //If a user guesses the number, the game should declare "GOOD GUESS!"
        //Hints
        //
        //Use the random method of the java.lang.Math class to generate a random number.

//         double randomNumber = (Math.random() * 100);       // Math random get any number and use mutiplication to get the range
//         int  numberRounded =  (int) Math.floor(randomNumber); // Applied casting here to get the double to a interger .

//guessingGame();

//        System.out.println("Guess a number from 1 to 100");
//        userInput = scanner.nextInt();
//        System.out.println(numberRounded);



    }

//        public static void guessingGame(){
//            Scanner scanner = new Scanner(System.in);
//            int userInput  ;
//            double randomNumber = (Math.random() * 100);       // Math random get any number and use mutiplication to get the range
//            int  numberRounded =  (int) Math.floor(randomNumber); // Applied casting here to get the double to a interger
//
//            do {
//                System.out.println("Guess a number from 1 to 100");
//                userInput = scanner.nextInt();
//
//                if (userInput < numberRounded) {
//                    System.out.println("HIGHER");
//                } else if (userInput >numberRounded) {
//                    System.out.println("LOWER");
//                } else if (userInput == numberRounded) {
//                    System.out.println("GOOD GUESS");
//                    break;
//                }
//            } while(true);
//
//
//        }
}

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //While
        //Create an integer variable i with a value of 5.
        //Create a while loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        //Your output should look like this:
        //5 6 7 8 9 10 11 12 13 14 15

        int i = 5;
        while (i <= 15){
            System.out.print(i + " ");
            i++;
        }

        /* Do While
Create a do-while loop that will count by 2's starting with 0 and ending at 100.
Follow each number with a new line.
Alter your loop to count backwards by 5's from 100 to -10.
Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal :
                         2
                         4
                         16
                         256
                         65536     */
//            int  numLoop = 0;
//        do {
//            System.out.println(numLoop);
//            numLoop += 2;
//        } while (numLoop <= 100 );

        for (int c = 100; c >= -10; c -=5){
            System.out.println("c = " + c);
        }

        //--------------------------

//         numLoop = 100;
//        do {
//            System.out.println(numLoop);
//            numLoop -= 5;
//        } while (numLoop >= -10 );
        // For loop version
//
        for (int x = 100; x >= -10; x-=5){
            System.out.println(x);
        }




        //For loop version Finished

//       long num = 2;
//        do {
//            System.out.println(num);    one version of this
//            num = num * num;
//        } while (num  < 1_000_000);

// Another version of the last do while loop
        long num = 2;
        do {
            System.out.println(num);
            num *= num;
        } while (num  < 1_000_000);

        // Last part

        long m = 2;        //Kept getting a variable error so i defined it outside the  for scope

        for (; m < 1_000_000; m *= m);{

            System.out.println(m);

        }

        for (long n = 2; n < 1_000_000; n*= n){  // Second way to do this
            System.out.println(n);


        }

        /*Fizzbuzz

One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

Write a program that prints the numbers from 1 to 100.
For multiples of three: print “Fizz” instead of the number.
For the multiples of five: print “Buzz”.
For numbers which are multiples of both three and five: print “FizzBuzz”. */


          for( int q = 1; q <= 100; q++ ){
              if (q % 3 == 0 && q % 5 == 0){
                  System.out.println("FizzBuzz");
              } else if(q % 5 == 0 ){
                  System.out.println("Buzz");
              } else if( q % 3 == 0){
                  System.out.println("Fizz");

              }
              System.out.println(q);
          }
//---------------------------------

        Scanner sc = new Scanner(System.in);
          int userInput ;
        boolean confirm = true;
          do {

              System.out.println("What Number would you like to go up to ? ");
              userInput = Integer.parseInt(sc.nextLine());

              System.out.println("Here is your table!");
              System.out.println("Number | squared | cubed");
              System.out.println("----- | ------ | -----");


              for (int u = 1; u <= userInput; u++) {
                  int squared = u * u;
                  int cubed = u * u * u;
                  System.out.printf("%-7d | %-9d| %-6d%n", u, squared, cubed);
              }
              System.out.println("Continue [y/n]" );
             confirm = sc.next().equalsIgnoreCase("y");
          } while (confirm);
        System.out.println(" Cool see you next time");
        //--------------------------------------------------------------
            Scanner sc2 = new Scanner(System.in);
                    int userInputAgain ;
                    String grade ;
        System.out.println("What is your Score? ");
        userInputAgain = sc2.nextInt();
        do {


            if (userInputAgain >= 88) {
                grade = "A";
            } else if (userInputAgain >= 80) {
                grade = "B";
            } else if (userInputAgain >= 67) {
                grade = "C";
            } else if (userInputAgain >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.printf("Your grade is : %s", grade);




/* The equalsIgnoreCase() method compares two strings, ignoring lower case and upper case differences.
This method returns true if the strings are equal, and false if not. */


            System.out.println("  Do you wish to continue ? (yes/no)");   //
            String answer = sc2.next();
//            if (answer.equalsIgnoreCase("yes")){
//                break;
            if(answer.equals("no")){
                break;
            }

        } while (true);
        System.out.println("Thank you have a great day ");


    }
        }


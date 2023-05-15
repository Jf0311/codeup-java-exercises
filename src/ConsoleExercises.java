import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
//        System.out.println(pi);
//        System.out.printf("The value of pi is approximately, %f", pi);
//
//        Scanner sc = new Scanner(System.in);
////        int userInput ;
////
////        System.out.println(" Enter Number:  ");
////        userInput = Integer.parseInt(sc.nextLine());
////
////        System.out.println("You entered: " + userInput);
////
////        Scanner sc = new Scanner(System.in);
//
////        Scanner myObj = new Scanner(System.in);
//
//
//
//        System.out.println("Enter three different words: ");
//
//        // String input
////        String wordOne = sc.nextLine();   This you can fill up the lines as much as we want
////        String wordTwo = sc.nextLine();
////        String wordThree = sc.nextLine();
//
//        String wordOne = sc.next();  // You can type all in one line
//        String wordTwo = sc.next();
//        String wordThree = sc.next();
//
//
//
//
//
//
//        // Output input by user
//        System.out.printf("Words are  : %s %n %s %n %s %n", wordOne,wordTwo,wordThree );

        Scanner sctTwo = new Scanner(System.in);
        // get perimeter of Codeup
        System.out.println("Enter length and width: ");

         int length = Integer.parseInt(sctTwo.nextLine());
         int width = Integer.parseInt(sctTwo.nextLine());

        System.out.printf("length is %d, %n , and width is %d,  "  , length, width);
        /* Display the area and perimeter of that classroom.
The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal
 to 2 times the length plus 2 times the width.*/

        int areaOfRectangle = length * width;
        int perimeterOfRectangle = (length * 2) + (width * 2);
        System.out.println(areaOfRectangle);
        System.out.println(perimeterOfRectangle);


    }
}

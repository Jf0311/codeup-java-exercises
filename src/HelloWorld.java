
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput ;

        System.out.println("Enter Something: ");
        userInput =sc.nextLine();


        System.out.println("You entered:" + userInput);




        System.out.println("Hello, World!");
        int myFavoriteNumber = 32;
        System.out.println(myFavoriteNumber);


        String myString = "This is a String Value";
        System.out.println(myString);


        myString = "a";
        System.out.println(myString);


//        long myNumber ;
//        System.out.println(myNumber);

//        myNumber = 3.14159;  //cannot print its a double aka  Real number instead of a whole Number
//        myNumber = 123L;  // java: incompatible types: possible lossy conversion from double to long , does not take the L

//        myNumber =123;
//        System.out.println(myNumber);

//        float myNumber = 3.14; //java: incompatible types: possible lossy conversion from double to float
//        System.out.println(myNumber); however you can put a 3.13f to make it a float



//        char myString = 'j';
//        System.out.println(myString);


// This does not work either , its defined in scope
//         double myString = 3.14159;


//        int x = 5;
//        System.out.println(x++); this print out 5 it put value first then increments it by one
//        System.out.println(x);   This print out 6 here

//        int x = 5;
//        System.out.println(++x); This print out 6 it increments first then add the value
//        System.out.println(x);  This print out 6

//        class someThingDumb = "donkey"; Cannot do
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;  String theNumberThree = "three";
//Object o = theNumberThree;
//int three = (int) o;
//                String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";



//        int x = 4;
////        x = x + 5;
//        x += 5 ;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
////        y = y * x;
//         y *= x ;      // Why is this 4 when flip ?
//         System.out.println(y);
//         System.out.println(x);


        int x = 10;
        int y = 2;
//        x = x / y;
//        y = y - x;   //sout shortcut
        x /= y ;
        y -= x ;
                 System.out.println(x);
         System.out.println(y);

         int myValue = 10000;
        System.out.println(myValue);

        
         System.out.println("myValue = " + myValue);
//    int myMinIntValue = Interger.MIN_VALUE;
//        System.out.println(myMinIntValue);
//
//        int myMAXIntValue = Interger.MAX_VALUE;
//        System.out.println(myMAXIntValue);


        // Last one is a overflow when it goes above
        int num = 6;
        String yo = "Crazy";

        System.out.printf("Hello there , %s. Nice to meet you. %s",  num,yo);


    }
}

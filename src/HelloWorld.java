import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
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
//        System.out.println(myNumber);



//        char myString = 'j';
//        System.out.println(myString);


// This does not work either , its defined in scope
//         double myString = 3.14159;


//        int x = 5;
//        System.out.println(x++); this print out 5
//        System.out.println(x);   This print out 6 here

//        int x = 5;
//        System.out.println(++x); This print out 6
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

        System.out.println();

        System.out.println("args = " + Arrays.toString(args));
        System.out.println("args = " + Arrays.toString(args));
        System.out.println("HelloWorld.main");
        System.out.println("y = " + y);




    }
}

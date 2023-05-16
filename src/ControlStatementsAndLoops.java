import java.util.Scanner;

public class ControlStatementsAndLoops {
    public static void main(String[] args) {
        System.out.println(10 > 5);//true
        System.out.println(5 == 5);// true
        System.out.println(true == false); //false
        System.out.println(2 <= 2);//true

        boolean isLoggedIn = true;
        boolean isAdmin = true;

        if (isLoggedIn && isAdmin) {
            System.out.println("admin page");  //Strings are immutable cannot change each string are object in java

            // got to use a .equals method in java to compare  a double == check a value its self might not get the
            // correct output
        }

        // String Comparison

//        String String1 = "a";
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Type 'a'");
//
//        String String2 = sc.nextLine();
//        System.out.println("String1 == " + String1);
//        System.out.println("String2 == " + String2);
//        System.out.println("String1 == " + String2);

        // Boolean comparison IF ELSE STATEMENT
        boolean lectureTime = true;

        if (lectureTime) {
            System.out.println("Here is some JAVA code");
        }

        boolean noClassTomorrow = false;

        if (noClassTomorrow) {
            System.out.println("Party Time");
        } else {
            System.out.println("Bummer");

        }
        // ------------IF, ELSE IF , ELSE ,  STATEMENT ---------------
//
//            boolean learningJava = true;
//            boolean learningJS = false;
//            boolean learningCss = false;
//
//        if (learningJava) {
//            System.out.println("You are learning Java");
//        } else if (learningJS){
//            System.out.println("You are learning JS!");
//        } else if (learningCss) {
//            System.out.println("You are learning CSS!");
//        } else {
//            System.out.println("You are learning Something Else!");
//
//        }
        //-----Switch Statements ----------

//        int rand = (int)(Math.random() * 3 ) + 1;
//        System.out.println("rand : = " + rand);
//
//        switch (rand){
//            case 1:
//                System.out.println("Case 1");
//                break;
//            case 2:
//                System.out.println("Case 2");
//                break;
//            case 3:
//                System.out.println("Case 3");
//                break;
//        }

        // -------While Loop ------

        boolean needToOrder = true;

        while (needToOrder) {
            System.out.println("Order food!");
            needToOrder = false;
        }

        // -------Do While ------

        do {
            System.out.println("Order More Food!");
            needToOrder = false;
        } while (needToOrder);

        //----For Loops  -----

        for (int i = 0; i < 20; i++) {
            if (i == 7) {
                System.out.println("Whoa - lucky number 7 ");
                continue;
            }
            if (i == 9) {
                System.out.println("Stop the loop  ");
                break;

            }
            System.out.println("i = " + i);

        }
        for(int i = 0; i < 10; i += 1) {
            System.out.println("i is " + i);
        }

    }
}

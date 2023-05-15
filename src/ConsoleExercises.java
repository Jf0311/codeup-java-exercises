import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.println(pi);
        System.out.printf("The value of pi is approximately, %f", pi);

        Scanner sc = new Scanner(System.in);
//        int userInput ;
//
//        System.out.println(" Enter Number:  ");
//        userInput = Integer.parseInt(sc.nextLine());
//
//        System.out.println("You entered: " + userInput);
//
//        Scanner sc = new Scanner(System.in);

//        Scanner myObj = new Scanner(System.in);



        System.out.println("Enter three different words: ");

        // String input
        String wordOne = sc.next();
        String wordTwo = sc.next();
        String wordThree = sc.next();





        // Output input by user
        System.out.printf("Words are  : %s %n %s %n %s %n", wordOne,wordTwo,wordThree );


    }
}

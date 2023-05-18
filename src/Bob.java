import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {

//        String bobResponse ;
//        Scanner input = new Scanner(System.in);

//        System.out.println("Hello , my name is Bob  ");
//        bobResponse = input.next();


        Scanner sc = new Scanner(System.in);
        String myResponse;
        Boolean confirm = true;

        do {
            System.out.println("Bob : ... ");
            myResponse = sc.nextLine();

            if (myResponse.isEmpty()) {
                System.out.println("Bob: Fine. Be that way!");
            } else if (myResponse.endsWith("?")) {
                System.out.println("Bob: Sure.");
            } else if (myResponse.endsWith("!")){
                System.out.println("Bob: Whoa, chill out!");
            } else {
                System.out.println("Bob: Whatever.");
            }
        } while (!myResponse.equals("bye"));

        System.out.println("Bob: Bye!");
    }
}







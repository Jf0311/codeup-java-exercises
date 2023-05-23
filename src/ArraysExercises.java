import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));  // Number will give you the address, have to put it in arrays to string.

//       String  People  [] =  {"Jim","John","Jack"};
//        System.out.println(People[0]); // "Jim" // This is a normal way to do this .
//        System.out.println(People[1]); // "John"
//        System.out.println(People[2]); // "Jack"

//        for (int i = 0; i < People.length; i += 1) {
//            System.out.println(People[i]);
//        }

        String[] people = new String[3];
        people[0] = ("Jim");
        people[1] = ("John");
        people[2] = ("Jack");

        for (String i : people) {
            System.out.println(i);
        }


    }
    }



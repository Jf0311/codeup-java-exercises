import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));// Number will give you the address, have to put it in arrays to string.
//       String  People  [] =  {"Jim","John","Jack"};
//        System.out.println(People[0]); // "Jim" // This is a normal way to do this .
//        System.out.println(People[1]); // "John"
//        System.out.println(People[2]); // "Jack"

//        for (int i = 0; i < People.length; i += 1) {
//            System.out.println(People[i]);
//        }
// Create an array of Person objects
        People[] persons = new People[3];

        // Assign a new instance of Person class to each element
        persons[0] = new People("Rocky");
        persons[1] = new People("Ryder");
        persons[2] = new People("Luther");

        // Iterate through the array and print the name of each person
        for (People person : persons) {
            System.out.println(person.getName());
        }

        // Add a new person to the array
        People newPerson = new People("Author Morgan");
        persons = addPerson(persons, newPerson);

        // Print the names of all persons after adding a new person
        for (People person : persons) {
            System.out.println(person.getName());
        }
    }

    public static People[] addPerson(People[] people, People newPerson) {
        People[] updatedArray = Arrays.copyOf(people, people.length + 1);
        updatedArray[people.length] = newPerson;
        return updatedArray;
    }
}

class People {
    private String name;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


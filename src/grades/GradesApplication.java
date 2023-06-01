package grades;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        // Create a HashMap to store students and their GitHub usernames
        HashMap<String, Student> students = new HashMap<>();

        // Add students with GitHub usernames directly to the map
        students.put("Zach_github1", createStudent("Zach", 85, 90, 92));
        students.put("Ryan_github2", createStudent("Ryan", 78, 82, 80));
        students.put("Jessica_github3", createStudent("Jessica", 92, 88, 90));
        students.put("Fernado_github4", createStudent("Fernando", 79, 85, 92));
        students.put("Luis_github5", createStudent("Luis", 95, 92, 97));

        // Create a scanner to read user input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Here are the GitHub usernames of our students:");
        printGitHubUsernames(students);

        String userInput;
        boolean continueLoop = true;

        do {
            System.out.println();
            System.out.println("What student would you like to see more information on?");
            userInput = scanner.nextLine();

            Student student = students.get(userInput);
            if (student == null) {
                System.out.println();
                System.out.println("Sorry, no student found with the GitHub username of \"" + userInput + "\".");
            } else {
                System.out.println();
                System.out.println("Name: " + student.getName() + " - GitHub Username: " + userInput);
                System.out.println("Current Average: " + student.getGradeAverage());
            }

            System.out.println();
            System.out.println("Would you like to see another student? (yes/no)");
            userInput = scanner.nextLine();

            if (!userInput.equalsIgnoreCase("yes")) {
                continueLoop = false;
            }
        } while (continueLoop);

        System.out.println();
        System.out.println("Goodbye, and have a wonderful day!");

        // Close the scanner
        scanner.close();
    }

    private static Student createStudent(String name, int... grades) {
        Student student = new Student(name);
        for (int grade : grades) {
            student.addGrade(grade);
        }
        return student;
    }

    private static void printGitHubUsernames(Map<String, Student> students) {
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println();
    }
}
//import java.util.HashMap;
//import java.util.Map;
//
//public class GradesApplication {
//    public static void main(String[] args) {
//        // Create a HashMap to store students and their GitHub usernames
//        HashMap<String, Student> students = new HashMap<>();
//
//        // Add students with GitHub usernames directly to the map
//        students.put("john123", createStudent("John", 11, 22,33));
//        students.put("alice456", createStudent("Alice", 95, 85, 92));
//        students.put("bob789", createStudent("Bob", 70, 80, 78));
//        students.put("emma321", createStudent("Emma", 88, 92, 90));
//
//        // Access and print student information from the map
//        for (Map.Entry<String, Student> entry : students.entrySet()) {
//            String username = entry.getKey();
//            Student student = entry.getValue();
//            System.out.println("GitHub Username: " + username);
//            System.out.println("Student Name: " + student.getName());
//            System.out.println("Average Grade: " + student.getGradeAverage());
//            System.out.println();
//        }
//    }
//
//    private static Student createStudent(String name, int... grades) {
//        Student student = new Student(name);
//        for (int grade : grades) {                    //For each loop
//            student.addGrade(grade);
//        }
//        return student;
//    }
//}
//







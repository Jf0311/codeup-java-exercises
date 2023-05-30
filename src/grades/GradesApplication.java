package grades;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {
        // Create a HashMap to store students and their GitHub usernames
        HashMap<String, Student> students = new HashMap<>();

        // Add students with GitHub usernames directly to the map
        students.put("john123", createStudent("John", 11, 22,33));
        students.put("alice456", createStudent("Alice", 95, 85, 92));
        students.put("bob789", createStudent("Bob", 70, 80, 78));
        students.put("emma321", createStudent("Emma", 88, 92, 90));

        // Access and print student information from the map
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            String username = entry.getKey();
            Student student = entry.getValue();
            System.out.println("GitHub Username: " + username);
            System.out.println("Student Name: " + student.getName());
            System.out.println("Average Grade: " + student.getGradeAverage());
            System.out.println();
        }
    }

    private static Student createStudent(String name, int... grades) {
        Student student = new Student(name);
        for (int grade : grades) {                    //For each loop
            student.addGrade(grade);
        }
        return student;
    }
}








package grades;

public class StudentTest {
    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student("John");
        Student student2 = new Student("Alice");
        Student student3 = new Student("Luther");
        Student student4 = new Student("Alice");


        // Add grades to each student
        student1.addGrade(80);
        student1.addGrade(90);
        student1.addGrade(75);

        student2.addGrade(95);
        student2.addGrade(85);
        student2.addGrade(92);

        // Get and print the average grades
        System.out.println(student1.getName() + "'s average grade: " + student1.getGradeAverage());
        System.out.println(student2.getName() + "'s average grade: " + student2.getGradeAverage());
    }
}

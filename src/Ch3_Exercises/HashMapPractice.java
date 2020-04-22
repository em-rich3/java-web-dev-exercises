package Ch3_Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main (String[] args) {
        HashMap<String, Integer> roster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter student name (or ENTER to finish): ");

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newStudentID = input.nextInt();
                roster.put(newStudent, newStudentID);

                input.nextLine();
            }

        } while (!newStudent.equals(""));

        System.out.println("\nClass roster:");
        for (Map.Entry<String, Integer> student: roster.entrySet()) {
            System.out.println(student.getKey() + " (ID: " + student.getValue() + ")");
        }
    }
}

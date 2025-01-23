import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Define the number of subjects
        int numSubjects = 10;

        // Create an array to store the marks of each student in 10 subjects
        int[] marks = new int[numSubjects];

        // Take input from the user
        System.out.println("Enter marks for 10 subjects:");

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Print marks of students who scored more than 60
        System.out.println("\nMarks greater than 60:");

        for (int i = 0; i < numSubjects; i++) {
            if (marks[i] >= 60) {
                System.out.println("Subject " + (i + 1) + ": " + marks[i]);
            }
        }

        // Close the scanner
        scanner.close();
    }
}

import java.util.Scanner;

public class maxnum {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Define the number of subjects
        int numSubjects = 15;

        // Variable to store the maximum marks
        int maxMarks = Integer.MIN_VALUE;

        // Take input from the user
        System.out.println("Enter number for 15 :");

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter number for  " + (i + 1) + ": ");
            int marks = scanner.nextInt();

            // Update maxMarks if the current marks are greater
            if (marks > maxMarks) {
                maxMarks = marks;
            }
        }

        // Print the maximum marks
        System.out.println("The maximum number are: " + maxMarks);

        // Close the scanner
        scanner.close();
    }
}

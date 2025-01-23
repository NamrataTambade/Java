import java.util.Scanner;

public class dowhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("The number " + number + " is even.");
            } else {
                System.out.println("");
            }

            System.out.print("Do you want to enter another number? (yes/no): ");
            userChoice = scanner.next();
        } while (userChoice.equalsIgnoreCase("yes"));

        System.out.println("Goodbye!");
        scanner.close();
    }
}

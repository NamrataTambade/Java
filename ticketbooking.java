import java.util.Scanner;

public class ticketbooking {
    public static void main(String[] args) {
        // Movie prices
        double movie1Price = 150.00;
        double movie2Price = 200.00;
        double movie3Price = 250.00;

        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Movie seating arrangement (3 rows x 5 seats)
        int[][] movie1Seats = new int[3][5];  // Movie 1 seating (3 rows, 5 seats per row)
        int[][] movie2Seats = new int[3][5];  // Movie 2 seating
        int[][] movie3Seats = new int[3][5];  // Movie 3 seating

        // Display available movies
        System.out.println("Welcome to the Movie Ticket Booking System!");
        System.out.println("Please choose a movie:");
        System.out.println("1. Movie 1 - Price: Rs. 150");
        System.out.println("2. Movie 2 - Price: Rs. 200");
        System.out.println("3. Movie 3 - Price: Rs. 250");

        // User selects a movie
        System.out.print("Enter your choice (1/2/3): ");
        int movieChoice = scanner.nextInt();

        // Initialize selected movie price and seating arrangement
        double selectedPrice = 0.0;
        int[][] selectedSeats = null;

        // Set the selected movie price and seating arrangement
        switch (movieChoice) {
            case 1:
                selectedPrice = movie1Price;
                selectedSeats = movie1Seats;
                break;
            case 2:
                selectedPrice = movie2Price;
                selectedSeats = movie2Seats;
                break;
            case 3:
                selectedPrice = movie3Price;
                selectedSeats = movie3Seats;
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                scanner.close();
                return;
        }

        // Ask user how many tickets they want to book
        System.out.print("Enter the number of tickets you want to book: ");
        int numberOfTickets = scanner.nextInt();

        // Display the seating arrangement for the selected movie
        displaySeatingArrangement(selectedSeats);

        // Book tickets for the user
        int bookedTickets = 0;
        while (bookedTickets < numberOfTickets) {
            System.out.print("Enter the row (1-3) and seat (1-5) to book (e.g., 1 3 for row 1, seat 3): ");
            int row = scanner.nextInt() - 1;
            int seat = scanner.nextInt() - 1;

            if (row < 0 || row >= 3 || seat < 0 || seat >= 5) {
                System.out.println("Invalid seat number. Please try again.");
                continue;
            }

            // Check if the seat is already booked
            if (selectedSeats[row][seat] == 1) {
                System.out.println("Sorry, this seat is already booked. Please choose another one.");
            } else {
                // Book the seat
                selectedSeats[row][seat] = 1;
                bookedTickets++;
                System.out.println("Seat booked successfully!");
            }
        }

        // Calculate the total cost
        double totalCost = selectedPrice * numberOfTickets;

        // Display booking summary
        System.out.println("Booking Summary:");
        System.out.println("Movie: Movie " + movieChoice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Total Cost: Rs. " + totalCost);

        // Display updated seating arrangement after booking
        displaySeatingArrangement(selectedSeats);

        // Close the scanner
        scanner.close();
    }

    // Method to display the seating arrangement
    public static void displaySeatingArrangement(int[][] seats) {
        System.out.println("Seating Arrangement:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 0) {
                    System.out.print("[O] ");  // O = Available
                } else {
                    System.out.print("[X] ");  // X = Booked
                }
            }
            System.out.println();
        }
    }
}

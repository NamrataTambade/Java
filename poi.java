import java.util.Scanner;

public class poi {
    public static void main(String[] args) {
        // Bus seat arrangement: 5 rows, 4 seats per row
        int rows = 5;
        int seatsPerRow = 4;
        
        // Price per seat
        double seatPrice = 300.00;
        
        // 2D array to represent bus seating arrangement (0 = available, 1 = booked)
        int[][] busSeats = new int[rows][seatsPerRow];
        
        // Create scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Bus Ticket Booking System!");
        
        while (true) {
            // Display seating arrangement
            displaySeatingArrangement(busSeats);
            
            // Ask user how many tickets they want to book
            System.out.print("Enter the number of tickets you want to book (or 0 to exit): ");
            int numberOfTickets = scanner.nextInt();
            
            // Exit if the user enters 0
            if (numberOfTickets == 0) {
                System.out.println("Thank you for using the Bus Ticket Booking System. Goodbye!");
                break;
            }

            // Check if there are enough available seats
            int availableSeats = countAvailableSeats(busSeats);
            if (numberOfTickets > availableSeats) {
                System.out.println("Sorry, not enough available seats. We only have " + availableSeats + " seats available.");
                continue;
            }

            // Book the tickets
            int bookedTickets = 0;
            while (bookedTickets < numberOfTickets) {
                System.out.print("Enter the row (1-" + rows + ") and seat (1-" + seatsPerRow + ") to book (e.g., 1 2 for row 1, seat 2): ");
                int row = scanner.nextInt() - 1;
                int seat = scanner.nextInt() - 1;

                if (row < 0 || row >= rows || seat < 0 || seat >= seatsPerRow) {
                    System.out.println("Invalid seat number. Please try again.");
                } else if (busSeats[row][seat] == 1) {
                    System.out.println("Sorry, this seat is already booked. Please choose another seat.");
                } else {
                    // Book the seat
                    busSeats[row][seat] = 1;
                    bookedTickets++;
                    System.out.println("Seat booked successfully for row " + (row + 1) + ", seat " + (seat + 1));
                }
            }

            // Calculate and display total cost
            double totalCost = seatPrice * numberOfTickets;
            System.out.println("Total Cost for " + numberOfTickets + " ticket(s): Rs. " + totalCost);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to display the seating arrangement
    public static void displaySeatingArrangement(int[][] seats) {
        System.out.println("Seating Arrangement (0 = Available, 1 = Booked):");
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

    // Method to count the number of available seats
    public static int countAvailableSeats(int[][] seats) {
        int availableSeats = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 0) {
                    availableSeats++;
                }
            }
        }
        return availableSeats;
    }
}

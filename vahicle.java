// Define the Vehicle class
class Vehicle {
    // Declare fields for vehicle properties
    String name;
    String model;
    int year;
    double price;

    // Constructor to initialize the fields
    public Vehicle(String name, String model, int year, double price) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }
}

// Main class to run the program
public class vahicle {
    public static void main(String[] args) {
        // Create an array of Vehicle objects
        Vehicle[] vehicles = new Vehicle[3];

        // Initialize the array with Vehicle objects
        vehicles[0] = new Vehicle("Toyota Corolla", "2022", 2022, 1800000.00);
        vehicles[1] = new Vehicle("Honda Civic", "2021", 2021, 2200000.00);
        vehicles[2] = new Vehicle("Ford Mustang", "2023", 2023, 3500000.00);

        // Display details of each vehicle
        System.out.println("Vehicle Details:");
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].displayDetails();
        }
    }
}

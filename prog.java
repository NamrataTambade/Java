class Student {
    // Instance variables
    String name;
    int age;

    // Constructor to initialize the object
    public Student(String name, int age) {
        // Use 'this' to differentiate between instance variables and parameters
        this.name = name;
        this.age = age;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Method to set name with 'this'
    public void setName(String name) {
        this.name = name; // 'this.name' refers to the instance variable, 'name' refers to the parameter
    }

    public static void main(String[] args) {
        // Create a new Student object
        Student student1 = new Student("Alice", 20);
        
        // Display initial info
        student1.displayInfo();
        
        // Set new name using setName method
        student1.setName("Bob");
        
        // Display updated info
        student1.displayInfo();
    }
}

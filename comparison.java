import java.util.Scanner;

public class comparison {
	
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("Enter first number:");
	    	int num1 = scanner.nextInt();
	    	
	    	System.out.println("Enter first number:");
	    	int num2 = scanner.nextInt();
	        
	        if (num1 >= num2) {
	            System.out.println(num1 + " is the greatest number.");
	        } else if (num2 >= num1) {
	            System.out.println(num2 + " is the greatest number.");
	        } 
	    }
	
}

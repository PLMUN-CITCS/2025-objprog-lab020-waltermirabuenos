import java.util.Scanner;

public class MenuDrivenProgram {
    
    // Method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }
    
    // Method to check if a number is even or odd
    public static void checkEvenOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is an " + result + " number.");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Greet User");
            System.out.println("2. Check Even/Odd");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();
            
            // Process user choice
            switch (choice) {
                case 1:
                    greetUser();
                    break;
                case 2:
                    checkEvenOdd(scanner);
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 3.");
            }
        } while (choice != 3);
        
        scanner.close();
    }
}

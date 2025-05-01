import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a scanner object to get input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check voting eligibility using IF-ELSE
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Close the scanner
        scanner.close();
    }
}

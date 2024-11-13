package TravelPlanner;

import java.util.Scanner;

public class TravelItineraryPlanner {
    public static void main(String[] args) {
        // Initialize Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the destination
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();

        // Prompt the user for travel dates
        System.out.print("Enter travel dates: ");
        String travelDates = scanner.nextLine();

        // Prompt the user for budget
        System.out.print("Enter budget: ");
        double budget = scanner.nextDouble();

        // Prompt the user for number of days
        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();

        // Display a summary of the travel itinerary
        System.out.println("\nTravel Itinerary:");
        System.out.println("Destination: " + destination);
        System.out.println("Travel Dates: " + travelDates);
        System.out.println("Budget: $" + budget);
        System.out.println("Number of days: " + days);

        // Note: Additional features like maps and weather info can be added

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

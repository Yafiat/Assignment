import java.util.Scanner;
import java.util.Random;


public class ESPTest {
   
    // Define color constants
    private static String COLOR_RED = "Red";
    private static String COLOR_GREEN = "Green";
    private static String COLOR_BLUE = "Blue";
    private static String COLOR_ORANGE = "Orange";
    private static String COLOR_YELLOW = "Yellow";
    private static String COLOR_PURPLE = "Purple";
    private static String COLOR_PINK = "Pink";
   
    public static void main(String[] args) {
        // Initialize Scanner and Random objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
       
        // User input for personal details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
       
        System.out.print("Describe yourself: ");
        String description = scanner.nextLine();
       
        System.out.print("Enter Due Date (MM/DD/YY): ");
        String dueDate = scanner.nextLine();
       
        // Initialize variables for ESP test
        int correctGuesses = 0;
        String[] colors = {COLOR_RED, COLOR_GREEN, COLOR_BLUE, COLOR_ORANGE, COLOR_YELLOW, COLOR_PURPLE, COLOR_PINK};
       
        // Repeat test 11 times
        for (int i = 0; i < 11; i++) {
            // Randomly select a color
            int colorIndex = random.nextInt(7);
            String selectedColor = colors[colorIndex];
           
            // Prompt user for guess
            System.out.print("Guess the color (Red, Green, Blue, Orange, Yellow, Purple, Pink): ");
            String userGuess = scanner.nextLine();
           
            // Check if user's guess is correct
            if (userGuess.equalsIgnoreCase(selectedColor)) {
                correctGuesses++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The correct color was: " + selectedColor);
            }
        }
       
        // Display the number of correct guesses
        System.out.println("You guessed correctly " + correctGuesses + " out of 11 times.");
       
        // Display user details
        System.out.println("User Details:");
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Due Date: " + dueDate);
       
        // Close scanner
        scanner.close();
    }
}   
/**
 * HelloApp.java - A greeting application that accepts a name via
 * command-line argument.
 *
 * UC2: Accept a name as a command-line argument and display a
 *      personalized greeting. If no argument is provided, display
 *      an error message and exit.
 *
 * @author Aditya Pratap
 * @version 2.0
 * @since UC1
 */
public class HelloApp {

    public static void main(String[] args) {
        // Validate that the user provided a name argument
        if (args.length == 0) {
            System.err.println("Error: Please provide a name as a command-line argument.");
            System.err.println("Usage: java HelloApp <name>");
            System.exit(1);
        }

        // Store the name from the command-line argument
        String name = args[0];

        // Build the greeting message using the provided name
        String greeting = "Hello, " + name + "!";

        // Display the personalized greeting
        System.out.println(greeting);
    }
}

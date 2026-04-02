/**
 * HelloApp.java - A simple Java application that accepts a name as a
 * command-line argument and displays a personalized greeting. If no name
 * is provided, it defaults to greeting "World".
 *
 * UC3: Display "Hello" with a default greeting when no name is provided.
 * - If a name is provided, it will display "Hello, [Name]!" to the console.
 * - If no name is provided, it will display "Hello, World!"
 *
 * Usage: java HelloApp [name]
 *
 * @author Aditya Pratap
 * @version 3.0
 * @since UC1
 */

// Key Concepts for HelloApp UC3:
// 1. Command-line Arguments: Accessing user input via args[] parameter
// 2. Conditional Statements: Using if-else to check argument presence
// 3. Default Values: Providing a fallback when no arguments are provided
// 4. String Concatenation: Building the greeting message

// Sample Code for HelloApp UC3:
// String name;
// if (args.length == 0) {
//     name = "World";
// } else {
//     name = args[0];
// }

public class HelloApp {
    public static void main(String[] args) {
        // Declare name variable to store the greeting target
        String name;

        // Check if a name argument was provided
        if (args.length == 0) {
            // Default to "World" when no argument is given
            name = "World";
        } else {
            // Use the provided command-line argument as the name
            name = args[0];
        }

        // Build and display the personalized greeting
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);
    }
}

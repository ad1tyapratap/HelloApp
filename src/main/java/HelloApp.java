/**
 * HelloApp.java - A simple Java application that accepts multiple names as
 * command-line arguments and displays a personalized greeting for each user.
 * If no names are provided, it displays the default greeting "Hello, World!".
 *
 * UC4: Display "Hello" with Multiple Command-Line Arguments.
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!"
 * - If no names are provided, it will display "Hello, World!"
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 *
 * @author Aditya Pratap
 * @version 4.0
 * @since UC1
 */

// Key Concepts for HelloApp UC4:
// 1. Command-line Arguments: Accessing multiple user inputs via args[] parameter
// 2. Array Iteration: Using a for loop with index to traverse all arguments
// 3. StringBuilder: Efficiently building a string in a loop
// 4. Conditional Logic: Checking index to avoid trailing delimiter
// 5. Default Values: Providing a fallback when no arguments are provided

// Sample Code for HelloApp UC4:
// StringBuilder nameBuilder = new StringBuilder();
// for (int i = 0; i < args.length; i++) {
//     nameBuilder.append(args[i]);
//     if (i < args.length - 1) {
//         nameBuilder.append(", ");
//     }
// }

public class HelloApp {
    public static void main(String[] args) {
        // Declare name variable to hold the final greeting target
        String name;

        // Check if no arguments were provided
        if (args.length == 0) {
            // Default to "World" when no names are given
            name = "World";
        } else {
            // Use StringBuilder for efficient string construction
            StringBuilder nameBuilder = new StringBuilder();

            // Iterate through all arguments using indexed for loop
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                // Append delimiter only if not the last element
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            name = nameBuilder.toString();
        }

        // Display the personalized greeting
        System.out.println("Hello, " + name + "!");
    }
}

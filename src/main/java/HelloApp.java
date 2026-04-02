/**
 * HelloApp.java - A simple Java application that accepts multiple names as
 * command-line arguments and displays a personalized greeting using an
 * enhanced for loop. If no names are provided, it displays "Hello, World!".
 *
 * UC5: Display "Hello" with Multiple Command-Line Arguments using enhanced for loop.
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!"
 * - If no names are provided, it will display "Hello, World!"
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 *
 * @author Aditya Pratap
 * @version 5.0
 * @since UC1
 */

// Key Concepts for HelloApp UC5:
// 1. Command-line Arguments: Accessing multiple user inputs via args[] parameter
// 2. Array Iteration: Using enhanced for loop to traverse all arguments
// 3. Enhanced For Loop: Simplifies iteration over arrays without manual index management
// 4. StringBuilder: Efficiently building a string in a loop without creating multiple
//    immutable string objects
// 5. Default Values: Providing a fallback when no arguments are provided
// 6. Boolean Flag: Using a boolean variable to control delimiter placement

// Sample Code for HelloApp UC5:
// StringBuilder nameBuilder = new StringBuilder();
// boolean first = true;
// for (String name : args) {
//     if (!first) {
//         nameBuilder.append(", ");
//     }
//     nameBuilder.append(name);
//     first = false;
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

            // Boolean flag to track whether we are on the first iteration
            boolean first = true;

            // Iterate through all arguments using enhanced for loop
            for (String arg : args) {
                // Prepend delimiter before every element except the first
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(arg);
                first = false;
            }
            name = nameBuilder.toString();
        }

        // Display the personalized greeting
        System.out.println("Hello, " + name + "!");
    }
}

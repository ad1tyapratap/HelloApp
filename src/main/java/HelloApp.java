/**
 * HelloApp.java - A simple Java application that greets multiple users by name
 * if provided as command-line arguments using the String.join() method, or defaults
 * to greeting "World" if no names are provided.
 *
 * UC7: Display "Hello" with Multiple Command-Line Arguments using String.join() Method.
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!"
 * - If no names are provided, it will display "Hello, World!"
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 *
 * @author Aditya Pratap
 * @version 7.0
 * @since UC1
 */

// Key Concepts for HelloApp UC7:
// 1. String.join() Method: A built-in method to concatenate strings with a delimiter
// 2. Command-line Arguments: Accessing user input via args[] parameter
// 3. Conditional Statements: Using if to check conditions
// 4. Boolean Logic: Using logical conditions to control flow
// 5. Array Length: Checking the number of command-line arguments
// 6. Code Simplification: Reducing code complexity by leveraging built-in methods
// 7. Readability and Maintainability: Writing cleaner code with fewer lines and less
//    manual string manipulation

// Sample Code for HelloApp UC7:
// String names = "World";
// if (args.length > 0) {
//     names = String.join(", ", args);
// }

public class HelloApp {
    public static void main(String[] args) {
        // Declare the name variable to hold the final greeting target
        String name;

        // Check if no arguments were provided
        if (args.length == 0) {
            // Default to "World" when no names are given
            name = "World";
        } else {
            // Use String.join() to concatenate all names with ", " as delimiter
            // No manual loop or trailing delimiter cleanup needed
            name = String.join(", ", args);
        }

        // Display the personalized greeting
        System.out.println("Hello, " + name + "!");
    }
}

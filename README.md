# HelloApp

A simple Java console application that greets the user. Built incrementally through use cases, each introducing new Java concepts.

## Use Case Roadmap

| UC | Branch | Description | Status |
|----|--------|-------------|--------|
| UC1 | `feature/UC1-hello-world` | Display `Hello, World!` | Done |
| UC2 | `feature/UC2-greet-user` | Accept one name via command-line arg, greet or error | Done |
| UC3 | `feature/UC3-display-name-default` | Default to `World` if no argument provided | Done |
| UC4 | `feature/UC4-display-multiple-names` | Accept multiple names, comma-separated (indexed loop) | Done |
| UC5 | `feature/UC5-enhanced-for-loop` | Refactor UC4 using enhanced for-each loop + boolean flag | Done |
| UC6 | `feature/UC6-substring-method` | Use `substring()` to remove trailing delimiter | Done |
| UC7 | `feature/UC7-string-join` | Use `String.join()` for the cleanest multi-name greeting | Done |

## Project Structure

```
HelloApp/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            └── HelloApp.java
```

## Prerequisites

- Java 8+
- Maven 3.6+

## Maven Commands to Compile and Run

```bash
# Compile the project
mvn compile

# Run with default greeting (Hello, World!)
mvn exec:java -Dexec.mainClass="HelloApp"

# Run with a single name
mvn exec:java -Dexec.mainClass="HelloApp" -Dexec.args="Alice"

# Run with multiple names (UC4+)
mvn exec:java -Dexec.mainClass="HelloApp" -Dexec.args="Alice Bob Charlie"
```

## Example Output

```
# No arguments
Hello, World!

# Single argument: Alice
Hello, Alice!

# Multiple arguments: Alice Bob Charlie
Hello, Alice, Bob, Charlie!
```

## Branch Strategy

- `main` — stable, production-ready code
- `dev` — integration branch for all feature branches
- `feature/UC*` — individual use case implementation branches

## Author

**Aditya Pratap**

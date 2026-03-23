# HelloApp

A simple Java console application that greets the user. Built incrementally through use cases.

## Use Case Roadmap

| Use Case | Branch | Description | Status |
|----------|--------|-------------|--------|
| UC1 | `feature/UC1-hello-world` | Display `Hello, World!` | Done |
| UC2 | `feature/UC2-greet-user` | Accept a name via command-line arg and greet | Done |
| UC3 | `feature/UC3-display-name-default` | Default to `World` if no name provided | Planned |
| UC4 | `feature/UC4-greet-multiple` | Accept multiple names, display comma-separated | Planned |
| UC5 | `feature/UC5-enhanced-for-loop` | Refactor UC4 using enhanced for-each loop | Planned |

## Project Structure

```
HelloApp/
├── src/
│   └── main/
│       └── java/
│           └── HelloApp.java
├── pom.xml
└── README.md
```

## Requirements

- Java 8+
- Maven 3.6+

## Build & Run

```bash
# Compile
mvn compile

# Run (UC1 — no arguments)
mvn exec:java -Dexec.mainClass="HelloApp"

# Run (UC2 — with a name)
mvn exec:java -Dexec.mainClass="HelloApp" -Dexec.args="Aditya"
```

## Branch Strategy

```
main
 └── dev
      ├── feature/UC1-hello-world
      ├── feature/UC2-greet-user
      └── ...
```

## Author

**Aditya Pratap**

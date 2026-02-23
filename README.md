# OTP1 – In-Class Assignment

**Unit Testing and Code Coverage with Maven & JaCoCo & Jenkins**

---

## 1. Purpose

This project was created as part of the OTP1 in-class assignment to demonstrate:

* Writing unit tests for existing Java code
* Verifying correctness using JUnit
* Measuring test coverage using JaCoCo
* Generating and publishing a coverage report

The main objective was to validate the functionality of a simple temperature conversion utility and ensure meaningful test coverage.

---

## 2. Project Overview

The project is a standard Maven-based Java application.

It includes:

* A production class responsible for temperature conversion
* A dedicated test class covering the conversion logic
* JaCoCo integration for coverage reporting

The focus of the assignment was correctness, test quality, and measurable coverage — not application complexity.

---

## 3. Technologies Used

* **Java**
* **Maven**
* **JUnit**
* **JaCoCo (Java Code Coverage Library)**
* **Jenkins**

---

## 4. Project Structure

```
OTP1_inclass_assignment/
│
├── src/main/java/        # Production source code
├── src/test/java/        # Unit tests
├── pom.xml               # Maven configuration
└── target/               # Build output (generated)
```

---

## 5. Functionality

### TemperatureConverter

The core class provides temperature conversion functionality.

Typical supported operations:

* Celsius → Fahrenheit
* Fahrenheit → Celsius

The logic is deterministic and does not rely on external dependencies, which makes it suitable for unit testing.

---

## 6. Testing Strategy

A dedicated test class (`TemperatureConverterTest`) was created to:

* Verify correct conversion results
* Validate edge cases
* Ensure all methods behave as expected
* Achieve high code coverage

Tests are executed using JUnit via Maven.

---

## 7. Code Coverage and Jenkins Build Result

JaCoCo is configured through Maven to:

1. Instrument the code during test execution
2. Collect coverage data
3. Generate an HTML coverage report

### Published Coverage Report

Coverage report is available at:

[https://users.metropolia.fi/~taifj/Sep1_Imp_2025/site/jacoco/default/index.html](https://users.metropolia.fi/~taifj/Sep1_Imp_2025/site/jacoco/default/index.html)

The Jenkins Build Result report includes:

**`Jenkins Report as img.png`** ![file link](https://github.com/taifjalo/OTP1_inclass_assignment/blob/master/Jenkins_Tempreture_V1.png).


The project achieves high overall coverage, indicating that the test suite effectively exercises the implemented logic.

---

## 8. How to Build and Run

### 1. Compile the project

```bash
mvn clean compile
```

### 2. Run unit tests

```bash
mvn test
```

### 3. Generate coverage report

```bash
mvn jacoco:report
```

After generation, open:

```
target/site/jacoco/index.html
```

in a browser to view the coverage report locally.

---

## 9. Key Takeaways

* Unit testing improves reliability and maintainability.
* Code coverage provides measurable insight into test effectiveness.
* Even simple logic benefits from structured testing.
* Maven + JaCoCo provides a clean and automated workflow for validation.

---

## 10. Future Improvements

Possible enhancements include:

* Adding boundary value tests
* Introducing parameterized tests
* Integrating CI pipeline coverage checks
* Enforcing minimum coverage thresholds in Maven

---

## Author

Taif Jalo
OTP1 – In-Class Assignment
Metropolia University of Applied Sciences

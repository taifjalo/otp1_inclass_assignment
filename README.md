# OTP1 – CI/CD Assignment

**Unit Testing and Code Coverage with Maven & JaCoCo & Jenkins & Docker**

---

## 1. Purpose

This project was created as part of the OTP1 in-class assignment to demonstrate:

* Writing unit tests for existing **Java** code
* Verifying correctness using **JUnit**
* Continuous Integration with **Jenkins** Pipeline stages
* Measuring and reporting **code coverage** with **JaCoCo**
* Generating and publishing a **coverage report**
* Building and publishing a **Docker image** for Continuous Integration

The main objective was to validate the functionality of a simple temperature conversion utility and ensure meaningful, measurable test coverage inside a CI/CD workflow.

---

## 2. Project Overview

The project is a standard Maven-based Java application.

It includes:

* A production class responsible for temperature conversion
* A dedicated test class covering the conversion logic
* JaCoCo integration for coverage reporting
* CI/CD pipelines with Jenkins
* Docker containerization for consistent build environments

The focus of the assignment was correctness, test quality, automation, and reproducibility — not application complexity.

---

## 3. Technologies Used

* **Java**
* **Maven**
* **JUnit**
* **JaCoCo (Java Code Coverage Library)**
* **Jenkins**
* **Docker**

---

## 4. Project Structure

```
OTP1_inclass_assignment/
│
├── src/main/java/        # Production source code
├── src/test/java/        # Unit tests
├── pom.xml               # Maven configuration
├── README.md             # This documentation
├── Dockerfile            # Docker build instructions
├── Jenkinsfile           # Jenkins Pipeline configuration
└── target/               # Build output
```

---

## 5. Functionality

### TemperatureConverter

The core class provides temperature conversion functionality.

Typical supported operations:

* Celsius → Fahrenheit
* Fahrenheit → Celsius

The logic is deterministic and does not rely on external dependencies, making it ideal for isolated unit testing and CI validation.

---

## 6. Testing Strategy

A dedicated test class (`TemperatureConverterTest`) was created to:

* Verify correct conversion results
* Validate edge and typical cases
* Ensure all methods behave as expected
* Achieve high code coverage

Tests are executed using JUnit through Maven during both local builds and Jenkins pipeline execution.

---

## 7. Code Coverage and Jenkins Build Result

### JaCoCo Configuration

JaCoCo is configured through Maven to:

1. Instrument the code during test execution
2. Collect execution coverage data
3. Generate an HTML coverage report automatically

### Published Coverage Report

Coverage report is available at:

[https://users.metropolia.fi/~taifj/Sep1_Imp_2025/site/jacoco/default/index.html](https://users.metropolia.fi/~taifj/Sep1_Imp_2025/site/jacoco/default/index.html)

### Jenkins Pipeline

The `Jenkinsfile` defines automated pipeline stages such as:

1. **Checkout** – Retrieves the source code from GitHub
2. **Build** – Executes `mvn clean compile`
3. **Test** – Runs `mvn test`
4. **Coverage Report** – Generates JaCoCo report
5. **Docker Build** – Builds the Docker image
6. **Post Actions** – Archives reports and publishes results

The pipeline ensures:

* Every commit is automatically validated
* Tests must pass before Docker image creation
* Coverage is generated during CI execution

### Jenkins Build Result

The Jenkins build output includes:

**`Jenkins Pipeline Stages as image`**
![file link](https://i.ibb.co/Y5FnNyF/Jenkins-OTP1-week6-assignment.png)

The project achieves high overall coverage, indicating that the test suite effectively exercises the implemented logic.

---

## 8. Docker Integration

The project includes a `Dockerfile` to containerize the build process.

### Docker Purpose

Docker is used to:

* Ensure consistent build environments
* Remove dependency on local machine configuration
* Allow Jenkins to build inside a controlled container
* Enable reproducible CI builds

### Docker Build Process

The Docker image:

* Uses a Java + Maven base image
* Copies the project files
* Executes Maven build commands
* Produces compiled artifacts

### Build Docker Image Locally

```bash
docker build -t otp1_inclass_assignment:v1
```

### Run the Container

```bash
docker run --rm otp1_inclass_assignment:v1
```

This ensures the application builds and tests successfully inside an isolated container environment.

---

## 9. How to Build and Run (Local Environment)

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
mvn clean verify
```

OR

```bash
mvn jacoco:report
```

After generation, open:

```
target/site/jacoco/index.html
```

in a browser to view the coverage report locally.

---

## 10. CI/CD Workflow Summary

The full automation flow works as follows:

1. Code is pushed to GitHub
2. Jenkins detects changes
3. Maven build is executed
4. Unit tests run
5. JaCoCo generates coverage report
6. Docker image is built
7. Results are archived and published

This guarantees that only validated, tested code is packaged.

---

## 11. Key Takeaways

* Unit testing improves reliability and maintainability.
* Code coverage provides measurable insight into test effectiveness.
* Jenkins automates quality verification.
* Docker ensures build consistency across environments.
* Maven + JaCoCo + Jenkins + Docker creates a complete CI workflow.

---

## 12. Future Improvements

Possible enhancements include:

* Enforcing minimum coverage thresholds in Maven
* Publishing Docker images to Docker Hub
* Adding branch protection rules in CI
* Introducing parameterized tests
* Adding automated deployment stage

---

## Author

Taif Jalo
OTP1 – In-Class Assignment
Metropolia University of Applied Sciences

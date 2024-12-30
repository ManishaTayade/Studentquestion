# Student System

A Spring Boot application that manages student information with support for both MySQL (for relational data) and MongoDB (for NoSQL data). The application provides RESTful APIs to interact with student data and questions.

## Features

- **MySQL**: Stores student data in a relational database.
- **MongoDB**: Stores question data in a NoSQL database.
- **REST API**: Exposes endpoints to perform CRUD operations on student data.
- **Postman**: Used for testing the `POST` request to insert data into MySQL.

## Technologies Used

- **Spring Boot**: Framework for building Java-based applications.
- **JPA (Java Persistence API)**: ORM tool to manage MySQL database interactions.
- **Hibernate**: ORM implementation for Java.
- **MongoDB**: NoSQL database for storing question data.
- **MySQL**: Relational database for storing student information.
- **Postman**: Tool for testing API requests.
- **Maven**: Build automation tool.

## Prerequisites

Before running the application, ensure you have the following installed:

- **Java 17 or higher**
- **Maven** (for building and running the project)
- **MySQL** (Install and set up a MySQL database)
- **MongoDB** (Install and set up MongoDB)

## Setup Instructions

### 1. Clone the Repository

Clone the project to your local machine:

```bash
git clone https://github.com/your-username/student-management.git
cd student-management


```bash
git clone https://github.com/your-username/student-management.git
cd student-management



student-management-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── controller/           # REST Controllers
│   │   │   │   │   ├── StudentController.java
│   │   │   │   │   ├── QuestionController.java
│   │   │   ├── dao/                      # Repository interfaces
│   │   │   │   ├── StudentRepository.java
│   │   │   │   ├── QuestionRepository.java
│   │   │   ├── model/                    # Entity/Model classes
│   │   │   │   ├── Student.java
│   │   │   │   ├── Question.java
│   │   │   ├── service/                  # Business logic layer
│   │   │   │   ├── StudentService.java
│   │   │   │   ├── QuestionService.java
│   │   │   ├── Application.java          # Main class for Spring Boot app
│   ├── resources/
│   │   ├── application.properties        # Configuration file for MySQL & MongoDB
│   │   ├── static/                       # Static assets (CSS, JS, images)
│   │   ├── templates/                    # HTML templates (if using Thymeleaf or similar)
│   ├── test/                             # Test files (unit/integration tests)
│   └── target/                           # Compiled class files (auto-generated)
└── pom.xml                               # Maven project configuration



---

### Additional Notes:

- **Folder Structure**: The project is divided into the following main parts:
  - `controller/`: Contains the REST API controllers.
  - `dao/`: Contains the repository interfaces for JPA and MongoDB.
  - `model/`: Contains the model/entity classes (`Student`, `Question`).
  - `service/`: Contains the service classes where business logic resides.

- **Running the Application**: Use `mvn spring-boot:run` to start the application on port `8080`. Ensure that both MySQL and MongoDB are running on your local machine (or update the `application.properties` to connect to remote databases if needed).

- **Postman**: You can use Postman to test the application by sending API requests to `http://localhost:8080`.

---


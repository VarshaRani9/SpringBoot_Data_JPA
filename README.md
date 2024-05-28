# User Management - REST API with Spring Boot

This Spring Boot project demonstrates the creation of REST APIs for managing user entities, featuring endpoints for creating, updating, deleting, and retrieving user details. Each user entity includes an auto-generated ID, name, city, and status. The project also implements custom finder methods and leverages JPQL/native queries for advanced database operations.

## Features

- RESTful API endpoints for user management:
  - Create user (POST)
  - Retrieve user (GET)
  - Update user (PUT)
  - Delete user (DELETE)
- Auto-generated user ID
- Custom finder methods
- Advanced database operations using JPQL and native queries

## Technologies Used

- Spring Boot
- Spring Data JPA
- MySQL Database
- Maven

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- MySQL

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/VarshaRani9/SpringBoot_Data_JPA.git
    cd SpringBoot_Data_JPA
    ```

2. Set up your MySQL database:
    - Create a new database named user_management.
    - Update the `application.properties` file with your MySQL database credentials:
        ```properties
        spring.datasource.url=jdbc:mysql://localhost:3306/user_management
        spring.datasource.username=your_username
        spring.datasource.password=your_password
        spring.jpa.hibernate.ddl-auto=update
        spring.jpa.show-sql=true
        ```

3. Build the project using Maven:
    ```bash
    mvn clean install
    ```

4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

The application will start on `http://localhost:8080`.

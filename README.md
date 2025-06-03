![sms](https://github.com/user-attachments/assets/80abf126-e879-4d7f-a577-d010928eb036)

# Student Management System

A full-featured **Student Management System** built with **Spring Boot**, **Thymeleaf**, and **MySQL**. This application enables administrators to perform CRUD (Create, Read, Update, Delete) operations on student records through a simple and responsive web interface.

---

## Table of Contents

* [Features](#features)
* [Technology Stack](#technology-stack)
* [Project Structure](#project-structure)
* [Setup & Installation](#setup--installation)
* [Usage](#usage)
* [API Endpoints](#api-endpoints)
* [Screenshots](#screenshots)
* [License](#license)

---

## Features

* List all students
* Add a new student
* Update student details
* Delete a student
* Responsive frontend using Bootstrap and Thymeleaf

---

## Technology Stack

* **Backend**: Spring Boot 3.5.0
* **View**: Thymeleaf
* **Database**: MySQL
* **ORM**: Spring Data JPA (Hibernate)
* **Build Tool**: Maven
* **Language**: Java 17

---

## Project Structure

```
hritik-6918-student-management-system/
└── student-management-system/
    ├── src/
    │   ├── main/java/net/springboot/sms/
    │   │   ├── controller/          # Web layer (StudentController.java)
    │   │   ├── entity/              # Student entity class
    │   │   ├── repository/          # JpaRepository interface
    │   │   ├── service/             # Service and implementation
    │   │   └── StudentManagementSystemApplication.java
    │   └── resources/
    │       ├── application.properties   # App config
    │       └── templates/              # Thymeleaf views
    ├── pom.xml                              # Maven configuration
    ├── mvnw, mvnw.cmd, .mvn/               # Maven wrapper
    ├── .gitignore, .gitattributes
```

---

## Setup & Installation

### Prerequisites

* Java 17+
* Maven
* MySQL (running locally)

### Steps

1. **Clone the repository**

```bash
git clone https://github.com/your-username/student-management-system.git
cd student-management-system
```

2. **Configure the database**
   Edit the `src/main/resources/application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sms?useSSL=false&serverTimezone=UTC
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

Ensure a database named `sms` exists.

3. **Run the application**

```bash
./mvnw spring-boot:run
```

The application will start on [http://localhost:8080](http://localhost:8080).

---

## Usage

Visit `http://localhost:8080/students` to view the main student management dashboard.

* Click **"Add Student"** to add a new record.
* Use **"Update"** and **"Delete"** buttons on each row to manage student records.

---

## API Endpoints

| HTTP Method | Endpoint              | Description        |
| ----------- | --------------------- | ------------------ |
| GET         | `/students`           | List all students  |
| GET         | `/students/new`       | Render create form |
| POST        | `/students`           | Save new student   |
| GET         | `/students/edit/{id}` | Render update form |
| POST        | `/students/{id}`      | Update student     |
| GET         | `/students/{id}`      | Delete student     |

---

## License

This project is licensed under the [Apache 2.0 License](https://www.apache.org/licenses/LICENSE-2.0).

---

## Author

* **Hritik Kumar**

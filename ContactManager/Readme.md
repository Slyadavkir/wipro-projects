# ContactManager

A Spring Boot based Contact Management application.

---

## Prerequisites

Before running the project, make sure the following software is installed:

- Java JDK 17 (or compatible version)
- Maven
- Eclipse IDE
- MySQL 

---

# How to Run the Project

## 1. Clone the Repository

```bash
git clone <repository-url>
```

---

## 2. Open Project in Eclipse

1. Open Eclipse
2. Go to:

```text
File → Import → Existing Maven Projects
```

3. Select the project folder
4. Click **Finish**

---

## 3. Update Maven Dependencies

Right-click project:

```text
Maven → Update Project
```

---

## 4. Configure Database

Open:

```text
src/main/resources/application.properties
```

Update database configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/contactmanager
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 5. Run the Application

Locate the main class:

```text
ContactManagerApplication.java
```

Right-click file and select:

```text
Run As → Java Application
```

## Maven Dependency Errors

Run:

```text
Maven → Update Project
```

or:

```bash
mvn clean install
```

---

# Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- JSP

---

# Project Structure

```text
src/main/java
src/main/resources
src/test/java
```

---

# Author

ContactManager Project Team
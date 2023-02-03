
# Library Management System
Library Management System spring boot application

![Library Management System(jpg)](https://www.skoolbeep.com/blog/wp-content/uploads/2020/12/WHAT-IS-THE-PURPOSE-OF-A-LIBRARY-MANAGEMENT-SYSTEM-min.png)


## About
<li>This libary management api build to manage the book records and user records in the database and to use those data according to need.  </li>


## Features

- A user can borrow a book easily and user will get the due date.
- It will restrict a perticuler user to borrow more then 5 books.
- A user can return a book easily. 
- It will calculate fine( 50 rupees file per day) if user returned the book after due date .

## Technologies and Dependencies Used
- Java (Efficient language to handle backend operations)
- Spring Boot (used to build hassle free web applications and writing REST APIs.)
- Spring Data JPA (Used to reduce the time of writing hardcoded sql queries and instead allows to write much more readable and  scalable code )
- MySQL (used as a Java persistence store)
- Swagger UI (Used to visualize and interact with the API’s resources without having any of the implementation logic in place.)
- Lambok  (Reduces the time  of writing java boiler plate code.)
- Maven (used as a dependency management tool.)


## Backend Design 
### Entities 
Actors/Entities are inspired by the real world entities that can use the applications  
1. **Student** having attributes:
* unique primary key student_id, country, emailId, name, age, card_id(foreign key) 
2. **Card** having attributes:
* unique primary key card_id, createdOn, updatedOn, status(ACTVATED/DEACTIVATED)
3. **Book** having attributes:
* Unique primary key book_id, isAvailable(True/False), genre, author_id(foreign key) 
4. **Author** having attributes:
* unique primary key author_id, country, name, emailId
5. **User** used mainly for authentication and authorization has attributes:
* unique primary key user_id, Authorization--> (STUDENT/ADMIN or BOTH), Username(emailId for student), Password. 



# Installation & Run
 - Before running the API server, you should update the database config inside the application.properties file.
- Update the port number, username and password as per your local database configuration.

```
    server.port=8081

    spring.datasource.url=jdbc:mysql://localhost:3306/food;
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=root
```

# API Root Endpoint
```
https://localhost:8800/
```
```
http://localhost:8800/swagger-ui/
```
# ER Diagram
![Er diagram](https://user-images.githubusercontent.com/103572468/203549421-6bb9fb58-bfc7-4863-8be5-7b4658494f07.jpeg)




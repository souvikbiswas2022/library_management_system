
# Library Management System
Library Management System spring boot application

![Library Management System(jpg)](https://www.skoolbeep.com/blog/wp-content/uploads/2020/12/WHAT-IS-THE-PURPOSE-OF-A-LIBRARY-MANAGEMENT-SYSTEM-min.png)


## About
This library management api build to manage the book records and user records in the database and to use those data according to need. 


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
###  ER Diagram


![Screenshot (3619)](https://user-images.githubusercontent.com/101393689/216521400-db6a6e42-1e5d-4e01-9f4d-a7fc24eb6fbe.png)


###  ER Diagram

## Installation & Run
- Before running the API server, you should update the database config inside the application.properties file.
- Update the port number, username and password as per your local database configuration.

```
    server.port=8080

    spring.datasource.url=jdbc:mysql://localhost:3306/library_management_system_database;
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=root
```

## API Root Endpoint
- To borrow a book
```
PUT "http://localhost:8080/users/books/{userid}/{bookid}"
```
-To return a book
```
PUT "http://localhost:8080/users/books/return/{userid}/{bookid}"
```
-You can also check through swagger ui
```
http://localhost:8080/swagger-ui/
```



## To check apis manually

-







## Limitations or Features which can implements in future work
-Spring Security (used for Authentication and Authorization )
-Unit Test (Used to check apis are working fine or not)





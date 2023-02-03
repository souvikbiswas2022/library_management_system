
# Library Management System
Library Management System spring boot application

![Library Management System(jpg)](https://www.skoolbeep.com/blog/wp-content/uploads/2020/12/WHAT-IS-THE-PURPOSE-OF-A-LIBRARY-MANAGEMENT-SYSTEM-min.png)


## About
This library management api build to manage the book records and user records and all activity  in the database which make a hassle free management . 


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


###  Tables in database

![Screenshot_20230203_111209](https://user-images.githubusercontent.com/101393689/216522113-c9282cb9-72f1-4f6c-9caa-737c3c2a4d7f.png)

-Description of address table

![address](https://user-images.githubusercontent.com/101393689/216522711-27f944a3-bf70-43a2-a179-0fd79fa3c8aa.png)

-Description of authors table

![author](https://user-images.githubusercontent.com/101393689/216522767-035cc20e-05d4-4551-aa9b-a6c34c0451ab.png)

-Description of authors_books_published table

![authors_books_published](https://user-images.githubusercontent.com/101393689/216522816-a05956e5-6a43-4945-a48a-52307fa23348.png)

-Description of books table

![book](https://user-images.githubusercontent.com/101393689/216522921-471489b6-110e-4fdd-bfde-12031613f243.png)

-Description of books_authors table

![books_authors](https://user-images.githubusercontent.com/101393689/216522989-63ce97cf-e273-486d-8187-e9f1b10eb271.png)

-Description of categories table 

![categories](https://user-images.githubusercontent.com/101393689/216524364-0ab360b6-4a18-46f8-91e4-f8843fbe5d0f.png)

-Description of  users table 

![users](https://user-images.githubusercontent.com/101393689/216524459-dcf0885a-1034-4c8f-a8c5-3d5619616c59.png)

###  Packages and classes

#### classes in Controller package
- BookCotroller class

#### Classes in Exception package

- BookException 
- ErrorDetails
- GlobalException
- UserException
- AddressException

#### Classes in Repository packag

- BookRepo 
- UserRepo

#### Classes and Interfaces in Service packag

- BookService(I)
- BookServiceImpl(C)

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






## Limitations or Features which can implements in future work
-Spring Security (used for Authentication and Authorization )
-Unit Test (Used to check apis are working fine or not)





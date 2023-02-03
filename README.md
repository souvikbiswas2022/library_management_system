
# Library Management System
Library Management System spring boot application

![Library Management System(jpg)](https://www.skoolbeep.com/blog/wp-content/uploads/2020/12/WHAT-IS-THE-PURPOSE-OF-A-LIBRARY-MANAGEMENT-SYSTEM-min.png)


# About
<li>This libary management api build to manage the book records and user records in the database and to use those data according to need.  </li>


# Collaborators

- [Souvik Biswas](https://github.com/souvikbiswas2022)

# Features

- A user can borrow a book easily and user will get the due date.
- It will restrict a perticuler user to borrow more then 5 books.
- A user can return a book easily. 
- It will calculate fine( 50 rupees file per day) if user returned the book after due date .

# Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Swagger UI
- Lambok
- Maven


## Modules

- Login Module
- Restaurant owner Module
- Customer Module
- Category Module
- FoodCart Module
- Order and Bill Module






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




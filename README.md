# (sw_eja) Semester work on the subject of Enterprise Java

## Semester work

The theme of the work is arbitrary. At least two persistent entities bound by at least the OneToMany/ManyToOne association must be used in the data part. Business logic must be accessible by REST service. For the service, create a client in any technology.

If the contact examination is resumed and the requirement to maintain 2m distances is lifted, the semester papers will be presented during the contact examination. Otherwise, the semester papers will be handed over electrically and must contain:

<ol>
  <li>Source codes</li>
  <li>Presentation video to the extent in which the work would be presented by contact (about 5 min):
    <ul>
      <li>topic of work</li>
      <li>sample use</li>
      <li>application architecture i.e. description of individual components (presentation, business, communication, etc.)
</li>
      <li>brief description of used libraries</li>
    </ul>
  </li>
  <li>Executable shape (uber / fat jar) or build and run instructions</li>
</ol>

# Project Name: Bank Application

## Introduction to the documentation of the project "Bank Application":

This project is a simple banking application developed using the Spring Boot framework. The "Bank Application" project provides a convenient way to manage financial transactions and user accounts.

The purpose of this documentation is to provide a complete description of the functionality, architecture and important aspects of the Bank Application project. Here you will find detailed information about the various components of the project, their interaction and settings.

The main features of the "Bank Application" project include:

1. User management: The application provides the ability to register and authenticate users. Each user has a unique account with personal information and login details.

2. Financial transactions: Users can perform various financial transactions, such as transferring funds, paying bills, viewing transaction history, and others. The application ensures the security and integrity of data during operations.

3. Database integration: The DemoBank project uses a database to store user data, transaction history and other important information. MySQL is used as a DBMS.

4. Web interface: The application provides a user-friendly web interface that allows users to interact with the functionality of the project through a convenient user interface.

This documentation contains a description of each component of the project, its functionality, usage and configuration. You will also find code examples to better understand how to use the various features of the project.

## Architecture
The architecture of the "Bank Application" project is based on the Spring Boot framework and follows the principles of the MVC (Model-View-Controller) architectural pattern. It is divided into several layers, each of which performs certain functions and is responsible for specific aspects of the application. Here is an overview of the main architecture layers of the "Bank Application" project:

1. View layer (View):
This layer contains the components responsible for presenting data and interacting with the user. In the "Bank Application" project, the presentation is carried out using a web interface implemented using HTML, CSS and JavaScript. It allows users to interact with the application and perform various actions such as registering, logging in, performing transactions, and viewing information.

2. Controller layer (Controller):
Controllers are intermediaries between the view and the model layer. They process requests from users, perform appropriate actions, and pass data to the view. In the Bank Application project, the controllers are implemented using Spring MVC annotations and handle various HTTP requests, such as user registration, transaction execution, and data retrieval.

3. Model layer (Model):
The model represents the business logic of the application and the data required for its operation. In the Bank Application project, the model consists of classes representing database entities such as user and transaction. They represent the structure and relationships between data, and provide methods for interacting with the database, including reading, writing, and updating data.

4. Data Access Layer:
This layer is responsible for interacting with the database and performing read and write operations. In the "Bank Application" project, the data access layer is implemented using Spring Data JPA, which provides convenient facilities for working with the database, such as CRUD operations (Create, Read, Update, Delete) and annotation-based queries.

5. Configuration layer:
The "Bank Application" project also has a configuration layer where various application settings are configured, including database connection, server properties, and others. These settings are usually stored in the `application.properties` file and are loaded when the application starts.

6. Services layer:
Services are intermediate components between controllers and the data access layer. They implement the business logic of the application, coordinate the execution of operations, and ensure code reuse. In the "Bank Application" project, services can be used to perform operations with users, transactions and other entities.

The architecture of the "Bank Application" project strives for separation of concerns and modularity, which makes it easier to maintain, test and extend the application. It also takes advantage of the Spring Boot framework for automatic configuration and dependency management, making it easier to develop and deploy your application.

## Examples of using

The main functions of the "Bank Application" project include:

1. User registration:
   - Allows users to create a new account in the system.
   - Requests user information such as name, email address, and password.
   - Checks the uniqueness of the email address and stores the user's data in the database.

2. Login:
   - Allows registered users to log into their account.
   - Checks if the combination of email address and password is correct.
   - Gives authorized users access to the functionality of the application.

3. Viewing user information:
   - Allows users to view their personal information such as name, address and other details provided during registration.

4. Execution of transactions:
   - Allows users to carry out financial transactions such as transferring funds between accounts.
   - Requests information about the account of the sender and recipient, as well as the amount of the transfer.
   - Checks the availability of funds in the sender's account and updates the account balance after a successful transaction.

5. Transaction history:
   - Allows users to view the history of completed transactions.
   - Displays information about each transaction, including the date, the account of the sender and recipient, and the amount.

6. Account Management:
   - Allows users to change their personal information such as address, password and other data.
   - Provides the ability to remove a user account from the system.

7. Security and Authentication:
   - Keeps user data secure with password encryption and other security measures.
   - Implements an authentication and authorization mechanism to protect sensitive information and ensure transaction security.

8. Notices:
   - Provides functionality to send notifications to users, such as via email, when certain events occur, such as a successful transaction or account data change.

9. Handling errors and exceptions:
   - Provides error and exception handling to prevent crashes and ensure application stability.
   - Sends appropriate error messages to users and provides information for diagnosing and fixing problems.
  
## Brief description of the main project files
1. AppConfig.java:
2. MailConfig.java:
3. AdvisorController.java:
4. AccountController.java:
5. AppController.java:
6. AuthController.java:
7. IndexController.java:
8. RegisterController.java:
9. TransactController.java:
10. GenAccountNumber.java:
11. HTML.java:
12. Token.java:
13. AppInterceptor.java:
14. MailMessenger.java:
15. Account.java:
16. Payment.java:
17. PaymentHistory.java:
18. Transact.java:
19. TransactionHistory.java:
20. User.java:
21. AccountRepository.java:
22. PaymentHistoryRepository.java:
23. PaymentRepository.java:
24. TransactHistoryRepository.java:
25. TransactRepository.java:
26. UserRepository.java:
27. RestAuthApiController.java:
28. RestTransactApiController.java:
29. DemoBankApplication.java:
30. application.properties
31. pom.xml

## Working with the database
The Bank Application project uses a database to store and manage data related to users, transactions, and other entities. The project uses MySQL as its database management system (DBMS).

Working with the database in the project is carried out using Spring Data JPA, which provides an abstraction for working with databases through the Java Persistence API (JPA). JPA allows developers to perform data operations such as save, update, delete, and read using an object-oriented approach rather than writing SQL queries by hand.

The project defines entities such as users (User) and transactions (Transaction) that correspond to tables in the database. Each entity is represented as a Java class with annotations that define mapping to a database table and relationships between tables.

To interact with the database, the project uses a repository (UserRepository), which extends the CrudRepository interface from Spring Data JPA. The repository provides methods to perform various data operations such as saving, searching, updating, and deleting. It also allows you to define custom queries using Query annotations.

Database settings such as URL, username, and password are specified in the application.properties file. Spring Boot automatically configures the database connection based on these settings when the application starts.

Working with the database in the "Bank Application" project allows you to save and retrieve data related to users and transactions, ensuring the integrity and constant access to information.

## Error and Exception Handling
In the "Bank Application" project, error and exception handling is carried out using the mechanisms provided by the Spring Boot framework. Here are some ways to handle errors and exceptions in this project:

1. Global exception handler:
    - A project can define a global exception handler that catches all unhandled exceptions in the application.
    - A global exception handler can be implemented using the `@ControllerAdvice` annotation, which allows you to define a class that handles exceptions.

2. Specific exception handlers:
    - You can define specific exception handlers to handle specific types of exceptions.
    - This allows more precise and flexible handling of exceptions that may occur in different parts of the application.

3. Custom error messages:
    - In the project, you can configure custom error messages that will be returned to clients when errors occur.
    - This helps to improve the user experience and provide clear information about problems encountered.

4. Logging exceptions:
    - An important aspect of error and exception handling is the logging of exceptions for subsequent diagnosis and troubleshooting.
    - Exception logging can be configured in the project to write information about exceptions, including stack traces, to application logs.

5. Handling data validation errors:
    - In the project, you can use the built-in data validation mechanisms provided by Spring to check the correctness of the data entered by the user.
    - When validation errors occur, appropriate error messages can be returned indicating incorrect or invalid data.

All these error and exception handling mechanisms allow you to more reliably and safely manage possible errors in the "Bank Application" project. They help prevent crashes, ensure the stability of the application, and provide useful information to the user and developers when problems arise.

## Used Libraries

The "Bank Application" project uses the following libraries:

1. Spring Boot:
    - Spring Boot is the main library on which the whole project is based.
    - It provides a wide range of functionality for web application development, including dependency management, auto-configuration, database integration, and more.
    - Spring Boot simplifies application development by providing a convenient and intuitive way to set up and run applications.

2. Spring Data JPA:
    - Spring Data JPA provides an abstraction for working with databases through JPA (Java Persistence API).
    - It simplifies database interaction by providing the ability to perform CRUD (Create, Read, Update, Delete) operations and execute queries using annotations or named methods of repository interfaces.

3. Spring Web:
    - Spring Web provides functionality for developing web applications, including RESTful API support.
    - It provides convenient tools for creating controllers, handling requests, passing data between client and server, and handling exceptions and errors.

4. MySQL Connector/J:
    - MySQL Connector/J is the official JDBC (Java Database Connectivity) driver for working with the MySQL database.
    - It provides the ability to connect to a MySQL database and perform operations on the data.

5. Spring Boot Starter Mail:
    - Spring Boot Starter Mail provides mail service integration for sending emails.
    - It allows you to configure email settings and send notifications or emails to users on certain events.

6. Spring Boot Starter Test:
    - Spring Boot Starter Test provides tools for writing and running tests in a project.
    - It includes various modules for unit testing, integration testing and REST API testing.

7. Hibernate Validator:
    - Hibernate Validator is an implementation of the Bean Validation specification for data validation.
    - It allows you to define validation rules for objects annotated with special annotations and check them for compliance with specified conditions.

8. Spring Security Crypto:
    - Spring Security Crypto provides functionality to encrypt and hash data in a project.
    - It allows you to ensure the security of user data, including passwords and other sensitive information.

These libraries are essential components of the "Bank Application" project and provide the necessary functionality to develop, test, and secure the application.

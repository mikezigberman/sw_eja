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
### 1. AppConfig.java:
This `AppConfig` file is the configuration class for the web controller application in the Spring Framework. It performs several tasks to set up a web application:

1. It is annotated with `@Configuration` which tells Spring that this class provides the configuration for the Spring container.
2. It is annotated with `@ComponentScan`, indicating the base packages that Spring should scan to detect and register components (classes annotated with `@Component`, `@Controller`, `@Service`, etc.).
3. It extends the `WebMvcConfigurationSupport` class, which allows you to customize the MVC configuration of the web application.

Within the `AppConfig` class, the following methods are defined:

1. `addResourceHandlers(ResourceHandlerRegistry registry)`: This method adds resource handlers that are responsible for serving static resources (eg CSS files, images, JavaScript files). This specifies the paths through which the resources will be available and the corresponding locations of the resources in the project.

2. `viewResolver()`: This method creates and sets up an `InternalResourceViewResolver` which determines which JSP files will be used as views to display the data. It specifies the prefix and suffix for the location of the JSP files and uses `JstlView` to display.

3. `addInterceptors(InterceptorRegistry registry)`: This method adds `AppInterceptor` to the interceptor registry. Interceptors provide the ability to be embedded in the processing of HTTP requests and responses. In this case, `AppInterceptor` will only apply to URLs starting with `/app/`.

Thus, `AppConfig` performs configuration tasks related to resources, views, and hooks for a Spring-based web application.

### 2. MailConfig.java:

This `MailConfig` file is a configuration class for configuring the sending of email in the Spring Framework. It defines a bean (component) that provides settings for sending email via JavaMailSender.

The `MailConfig` class is defined in the `com.demo_bank.config` package. The following method is defined inside the class:

1. `getMailConfig()`: This method is a bean and returns an instance of the `JavaMailSenderImpl` class that is used to send email. Inside the method, the following actions are performed:

    - An instance of `JavaMailSenderImpl` is created.
    - JavaMail properties are set via the `Properties` object. Here you can specify various settings for the protocol for sending mail, authentication and debugging.
    - Mailbox credentials such as host, port, username and password are set.

    After all the settings are done, the generated `JavaMailSenderImpl` is returned as a bean that can be used to send email in the application.

Thus, this `MailConfig` defines the configuration for sending email, including protocol settings, credentials, and JavaMail properties. This allows the application to use `JavaMailSenderImpl` to send emails.

### 3. AdvisorController.java:

This `AdvisorController` file is an advisor controller in the Spring Framework. It performs certain tasks related to the request handling aspects of the application.

The `AdvisorController` class is defined in the `com.demo_bank.controler_advisor` package. The following method is defined inside the class:

1. `getUserDefaults()`: This method is annotated with `@ModelAttribute` to tell Spring that its result should be added to the model on every HTTP request. Here the method returns a new object of type `User`.

    - The `User` object represents the user data model.
    - The `getUserDefaults()` method is used to provide default values for the `User` object in the model. This means that every time an HTTP request is processed, a `User` object will be added to the model with the given name `"registerUser"`.

    The purpose of this method may vary depending on the context of the application. It can be used, for example, to provide an empty `User` object when displaying a user registration form, to populate the fields with default values.

Thus, `AdvisorController` is an aspect controller and its `getUserDefaults()` method is used to add a `User` object with the given name to the model on each HTTP request.

### 4. AccountController.java:

This `AccountController` file is a web application controller in the Spring Framework. It is responsible for handling requests related to the management of bank accounts.

The `AccountController` class is defined in the `com.demo_bank.controllers` package. The following method is defined inside the class:

1. `createAccount()`: This method is annotated with `@PostMapping` and handles an HTTP POST request on the path `/account/create_account`. It takes the following parameters from the request:

    - `account_name`: The name of the new bank account.
    - `account_type`: The type of the new bank account.
    - `redirectAttributes`: The `RedirectAttributes` object used to add the attributes to be passed in the redirect.
    - `session`: An `HttpSession` object representing the current user session.

    Inside the method, the following actions are performed:

    - Check for empty strings for `accountName` and `accountType`. If one of them is empty, then an error attribute is added and redirected to `/app/dashboard`.
    - Getting the `User` object from the current session.
    - Generating a unique account number using `GenAccountNumber.generateAccountNumber()`.
    - Create a new bank account using `accountRepository.createBankAccount()`, passing in the user id, account number, name and account type.
    - Adding a success attribute and redirecting to `/app/dashboard`.

Thus, `AccountController` provides the functionality to create a new bank account. It processes the POST request, validates the parameters, gets the user data from the session, generates a unique account number, and creates a new bank account in the database using `accountRepository`.

### 5. AppController.java:

This `AppController` file is a web application controller in the Spring Framework. It is responsible for handling requests related to the functionality of the application, such as displaying the control panel, payment history, and transaction history.

The `AppController` class is defined in the `com.demo_bank.controllers` package. The following methods are defined inside the class:

1. `getDashboard()`: This method handles a GET request to `/app/dashboard` path and returns a model and a View to display the app's dashboard. Inside the method, the following actions are performed:

    - Getting the `User` object from the current session.
    - Getting a list of user's bank accounts with `accountRepository.getUserAccountsById()`.
    - Getting the total balance of a user's accounts with `accountRepository.getTotalBalance()`.
    - Create a `ModelAndView` object for the "dashboard" view.
    - Set model attributes for user account list and total balance.
    - Return model and view.

2. `getPaymentHistory()`: This method processes a GET request on the path `/app/payment_history` and returns a model and a View to display the payment history. Inside the method, the following actions are performed:

    - Getting the `User` object from the current session.
    - Getting a list of user's payment history records using `paymentHistoryRepository.getPaymentRecordsById()`.
    - Create a `ModelAndView` object to represent "paymentHistory".
    - Setting the model attribute for the list of payment history records.
    - Return model and view.

3. `getTransactHistory()`: This method handles a GET request to `/app/transact_history` and returns a Model and View to display the transaction history. Inside the method, the following actions are performed:

    - Getting the `User` object from the current session.
    - Getting a list of user's transaction history records with `transactHistoryRepository.getTransactionRecordsById()`.
    - Create a `ModelAndView` object to represent "transactHistory".
    - Setting the model attribute for the list of transaction history records.
    - Return model and view.

So `AppController` provides functionality to display control panel, payment history and transaction history. It processes the corresponding GET requests, receives the necessary data from the database using the appropriate repositories and passes it to the model for display in views.

### 6. AuthController.java:

This `AuthController` file is the web application's authentication (authorization) controller in the Spring Framework. It is responsible for handling requests related to the process of logging in (login) and logging out (logout).

The `AuthController` class is defined in the `com.demo_bank.controllers` package. The following methods are defined inside the class:

1. `getLogin()`: This method processes a GET request on the `/login` path and returns a model and a View to display the login page. Inside the method, the following actions are performed:

    - Create a `ModelAndView` object for the "login" view.
    - Generating an authentication token with `Token.generateToken()`.
    - Set model attributes for token and page title.
    - Return model and view.

2. `login()`: This method handles the POST request to the `/login` path and performs the user authentication process. Inside the method, the following actions are performed:

    - Validation of input fields and form data.
    - Checking if there is a user with the specified email address in the database.
    - Compare the entered password with the hashed password from the database using `BCrypt.checkpw()`.
    - Checking the verification status of the user account.
    - Retrieving user data from the database using `userRepository.getUserDetails()`.
    - Setting session attributes for the authenticated user and token.
    - Redirect to the dashboard page.

3. `logout()`: This method handles the GET request on the `/logout` path and performs the user logout process. Inside the method, the following actions are performed:

    - Clearing the current session by calling `session.invalidate()`.
    - Add "logged_out" attribute to flash attributes (`RedirectAttributes`) to indicate successful logout.
    - Redirect to the login page.

Thus, `AuthController` provides the functionality of user authentication, validation of user data, session management and redirects to the appropriate pages depending on the results of authentication or logout.

### 7. IndexController.java:

This `IndexController` file is the controller for the main pages of a web application in the Spring Framework. It is responsible for handling requests related to the main page, error page, and account verification page.

The `IndexController` class is defined in the `com.demo_bank.controllers` package. The following methods are defined inside the class:

1. `getIndex()`: This method handles a GET request on the path `/` (root path) and returns the model and view (View) to display the main page. Inside the method, the following actions are performed:

    - Create a `ModelAndView` object for the "index" view.
    - Setting the model attribute for the page title.
    - Return model and view.

2. `getError()`: This method handles a GET request on the path `/error` and returns a model and a View to display the error page. Inside the method, the following actions are performed:

    - Create a `ModelAndView` object to represent "error".
    - Setting the model attribute for the page title.
    - Return model and view.

3. `getVerify()`: This method handles the GET request on the `/verify` path and is responsible for verifying the user account. Inside the method, the following actions are performed:

    - Creation of a `ModelAndView` object for the view that will display the result of the account verification.
    - Checking the passed token and verification code against the database using `userRepository.checkToken()`.
    - If the token is not valid, then an error page is returned with an expired session message.
    - If the token is valid, then the `userRepository.verifyAccount()` method is called to update and verify the user account in the database.
    - The login page is returned with a message that the account was successfully verified.

Thus, `IndexController` is responsible for handling requests for the main page, error page, and account verification page. It sets the appropriate model and view attributes for displaying information on pages and performs the necessary actions to process queries and interact with the database.

### 8. RegisterController.java:

This `RegisterController` file is the controller for registering web application users in the Spring Framework. It is responsible for handling requests related to the registration of new users.

The `RegisterController` class is defined in the `com.demo_bank.controllers` package. The following methods are defined inside the class:

1. `getRegister()`: This method processes a GET request on the path `/register` and returns a model and a View to display the registration page. Inside the method, the following actions are performed:

    - Create a `ModelAndView` object for the "register" view.
    - Setting the model attribute for the page title.
    - Return model and view.

2. `register()`: This method handles the POST request to `/register` and registers a new user. Inside the method, the following actions are performed:

    - Create a `ModelAndView` object for the "register" view.
    - Check for validation errors (if any) and password matches.
    - Token generation using `Token.generateToken()`.
    - Random code generation using the `Random` class.
    - Formation of the body of the e-mail using an HTML template.
    - Password hashing using `BCrypt`.
    - Registering a user using `userRepository.registerUser()`, passing in the appropriate data (first name, last name, email, hashed password, token and code).
    - Sending email notification using `MailMessenger.htmlEmailMessenger()`.
    - Set model attribute to report successful registration.
    - Return model and view.

Thus, the `RegisterController` is responsible for handling requests for the registration page and executing the process of registering a new user. It performs validations, generates tokens and codes, hashes passwords, registers the user in the database, and sends email notifications.

### 9. TransactController.java:

The `TransactController` file is the web application controller and contains the request handlers associated with user transactions. It is responsible for processing deposits, funds transfers, cash withdrawals and payments.

Here is a brief description of each method in `TransactController`:

1. Method `deposit`: Handles a request to make a deposit. It accepts parameters `deposit_amount` (deposit amount) and `account_id` (account ID). Checks for errors and blanks, then updates the user's account balance, adds a transaction record, and redirects the user to the dashboard page (`/app/dashboard`).

2. Method `transfer`: Handles a request to transfer funds. It accepts parameters `transfer_from` (identifier of the account from which the transfer is made), `transfer_to` (identifier of the account to which the transfer is made) and `transfer_amount` (transfer amount). Checks for errors and empty values, and also checks that there are enough funds in the account to complete the transfer. It then updates the balances of both accounts, adds a transaction record, and redirects the user to the dashboard page.

3. Method `withdraw`: Processes the request for cash withdrawal. It accepts `withdrawal_amount` (withdrawal amount) and `account_id` (account ID) parameters. Checks for errors and empty values, and also checks that there are enough funds in the account to complete the withdrawal. If all checks are successful, updates the account balance, adds a transaction record, and redirects the user to the control panel page.

4. Method `payment`: Processes the request to make a payment. It accepts the parameters `beneficiary` (beneficiary), `account_number` (account number of the beneficiary), `account_id` (user account identifier), `reference` (reference to the payment), and `payment_amount` (payment amount). Checks for errors and empty values, and also checks for sufficient funds in the account to complete the payment. If all checks pass, updates the account balance, adds a payment record and a transaction record, and redirects the user to the control panel page.

The controller uses several repositories (`AccountRepository`, `PaymentRepository`, `TransactRepository`) that provide access to data and perform database operations. It also uses `HttpSession` to get information about the current user, and `RedirectAttributes` to add attributes that will be available after the user is redirected.

### 10. GenAccountNumber.java:

The `GenAccountNumber` file contains a helper class for generating a random account number in a banking application.

The `generateAccountNumber` method is static and returns an integer value. It uses the random number generator from the `Random` class to generate a random number. This random number is then multiplied by the `bound` value, which is 1000 in this case. This generates a random number between 0 and 999,000 (not including 999,000). This number is assigned to the `accountNumber` variable, which is then returned as the result of the method execution.

Thus, calling the `generateAccountNumber` method allows you to get a randomly generated account number in a banking application.

### 11. HTML.java:

This `HTML` file is a helper class for generating an HTML email template. It contains a `htmlEmailTemplate` static method that takes two parameters: `token` (token) of type `String` and `code` (code) of type `int`.

The `htmlEmailTemplate` method generates and returns a string representing an HTML email template. The template includes styling and markup to display the content of the email, including the company name, welcome text, and a button to verify your account.

The `url` variable is created in the method, which contains the URL for verifying the account, including the `token` and `code` parameters.

Then an HTML template is formed that contains all the necessary content of the letter. The template includes CSS styles for styling email elements such as the background, font, and button.

Finally, the generated HTML template is stored in the `emailTemplate` variable and returned as the result of the method execution.

Thus, calling the `htmlEmailTemplate` method allows you to get a ready-made HTML template for creating an email containing a link to verify your account.

### 12. Token.java:

This `Token` file is a helper class for generating tokens. It contains a static `generateToken` method that returns a string representing the generated token.

The `generateToken` method uses the `UUID` class from the `java.util` package to generate a unique identifier (token). The method calls the `randomUUID()` static method, which creates a new `UUID` object using random numbers. The `toString()` method is then called to get the string representation of the generated token.

The resulting token is stored in the `token` variable and returned as the result of the method execution.

Thus, calling the `generateToken` method allows you to get a randomly generated unique token that can be used for various purposes, such as authentication, authorization, or object identification.

### 13. AppInterceptor.java:

This `AppInterceptor` file is the application's request interceptor. It implements the `HandlerInterceptor` interface, which allows you to intercept and process requests before and after they are processed by controllers.

The `AppInterceptor` class is also annotated with `@Component` to indicate that it is a Spring Framework managed bean and will be automatically detected and used in the application.

The methods inside the `AppInterceptor` class do the following:

1. `preHandle`: This method is called before the request is processed by the controller. It checks the request URI and takes some action if the URI starts with `/app`. Here are the following steps:
    - Getting the current session with `HttpServletRequest`.
    - Extracting a token from session attributes.
    - Extracting the user object from session attributes.
    - Checking for the presence of a token and a user object in the session.
    - If the token or user object is not present, it redirects to the login page (`/login`).

2. `postHandle`: This method is called after the request has been processed by the controller, but before the result is returned to the client. In this case, the method simply prints a message to the console.

3. `afterCompletion`: This method is called when the request is completed and the result is returned to the client. In this case, the method also simply prints a message to the console.

Thus, `AppInterceptor` is used to intercept requests related to `/app` and check for the presence of authentication data in the session. If the data is missing, the user is redirected to the login page.

### 14. MailMessenger.java:

The `MailMessenger` file is the class responsible for sending HTML emails via email. It contains the `htmlEmailMessenger` method, which sends an HTML email.

Here is how this class works:

1. `htmlEmailMessenger`: This method accepts the parameters needed to send the email, such as sender (`from`), recipient address (`toMail`), subject (`subject`), and body (`body`).
2. `JavaMailSender`: Inside the method, a `JavaMailSender` object is created, which is the Spring Framework interface for sending email. The object is derived from the `MailConfig` class, which provides the settings for sending mail.
3. Create `MimeMessage`: A `MimeMessage` object is created, which is the message to be sent via email.
4. Create a `MimeMessageHelper`: A `MimeMessageHelper` object is created that makes it easy to create a message and add various attributes to it. It binds to `MimeMessage` to help customize the message.
5. Setting message attributes: The `htmlMessage` method is used to set message attributes such as recipient address (`toMail`), sender address (`from`), message subject (`subject`) and body of the message (`body`). The third argument to the `setText` method sets the `true` flag to indicate that the body of the email is HTML.
6. Sending a message: The `send` method of the `JavaMailSender` object is called to send the email.

Thus, the `MailMessenger` class provides a convenient way to send HTML emails using the configuration provided by the `MailConfig` class.

### 15. Account.java:

The `Account` file represents a model class that represents a user's account in the system. It contains various fields and methods for accessing and setting the values of these fields. Here is an overview of the class functions:

1. `@Entity` annotation: This annotation specifies that the `Account` class is the entity that will be mapped to the database.

2. Class fields:
    - `account_id`: Unique account identifier (field `@Id`).
    - `user_id`: ID of the user associated with this account.
    - `account_number`: Account number.
    - `account_name`: Account name.
    - `account_type`: Account type.
    - `balance`: The balance of the account, represented by the `BigDecimal` object for monetary precision.
    - `created_at`: Date and time the account was created.
    - `updated_at`: The date and time the account was last updated.

3. Access methods (getters and setters): For each field of the `Account` class, access methods are defined for getting and setting field values.

    - Getters (`get...()`): Methods that return field values.
    - Setters (`set...()`): Methods that set field values.

The `Account` class provides a structure for storing user account information and provides access to this information through accessor methods. It is also used in connection with a database, where each `Account` class object represents an account entry in a table.

### 16. Payment.java:

The `Payment` file represents a model class that represents payment information in the system. It contains various fields and methods for accessing and setting the values of these fields. Here is an overview of the class functions:

1. `@Entity` annotation: This annotation specifies that the `Payment` class is the entity that will be mapped to the database.

2. Class fields:
    - `payment_id`: Unique payment identifier (field `@Id`).
    - `account_id`: Identifier of the account associated with this payment.
    - `beneficiary`: The name of the payee.
    - `beneficiary_acc_no`: The account number of the payee.
    - `amount`: Payment amount.
    - `reference_no`: Payment reference number.
    - `status`: Payment status.
    - `reason_code`: Payment reason code.
    - `created_at`: Date and time the payment was created.

3. Access methods (getters and setters): For each field of the `Payment` class, access methods are defined for getting and setting field values.

    - Getters (`get...()`): Methods that return field values.
    - Setters (`set...()`): Methods that set field values.

The `Payment` class provides a structure for storing payment information and provides access to this information through accessor methods. It is also used in connection with a database, where each `Payment` class object represents a payment entry in the table.

### 17. PaymentHistory.java:

The `PaymentHistory` file represents a model class that represents information about the history of payments in the system. It contains various fields and methods for accessing and setting the values of these fields. Here is an overview of the class functions:

1. `@Entity` annotation: This annotation specifies that the `PaymentHistory` class is the entity that will be mapped to the database.

2. `@Table(name = "v_payments")` annotation: This annotation points to the name of the table in the database to which the `PaymentHistory` class will refer.

3. Class fields:
    - `payment_id`: Unique payment identifier (field `@Id`).
    - `account_id`: Identifier of the account associated with this payment.
    - `user_id`: Identifier of the user associated with this payment.
    - `beneficiary`: The name of the payee.
    - `beneficiary_acc_no`: The account number of the payee.
    - `amount`: Payment amount.
    - `status`: Payment status.
    - `reference_no`: Payment reference number.
    - `reason_code`: Payment reason code.
    - `created_at`: Date and time the payment was created.

4. Access methods (getters and setters): For each field of the `PaymentHistory` class, access methods are defined for getting and setting field values.

    - Getters (`get...()`): Methods that return field values.
    - Setters (`set...()`): Methods that set field values.

The `PaymentHistory` class provides a structure for storing payment history information and provides access to this information through accessor methods. It is also used in connection with a database, where each `PaymentHistory` object represents a payment history entry in the `v_payments` table.

### 18. Transact.java:

The `Transact` file represents a model class that describes a transaction in the banking system. It contains various fields and methods for accessing and setting the values of these fields. Here is an overview of the class functions:

1. `@Entity` annotation: This annotation specifies that the `Transact` class is an entity that will be mapped to the database.

2. Class fields:
    - `transaction_id`: Unique transaction ID (`@Id` field).
    - `account_id`: ID of the account associated with this transaction.
    - `transaction_type`: Transaction type, e.g. "purchase", "transfer funds", etc.
    - `amount`: Amount of the transaction.
    - `source`: The source of the transaction, e.g. "internal account", "external account", etc.
    - `status`: Transaction status.
    - `reason_code`: Transaction reason code.
    - `created_at`: Date and time the transaction was created.

3. Access methods (getters and setters): For each field of the `Transact` class, access methods are defined for getting and setting field values.

    - Getters (`get...()`): Methods that return field values.
    - Setters (`set...()`): Methods that set field values.

The `Transact` class provides a structure for storing information about transactions in the banking system and provides access to this information through accessor methods. It is also used in connection with a database, where each object of class `Transact` represents a record of a transaction.

### 19. TransactionHistory.java:

The `TransactionHistory` file represents a model class that describes the history of transactions in the banking system. It contains various fields and methods for accessing and setting the values of these fields. Here is an overview of the class functions:

1. `@Entity` annotation: This annotation specifies that the `TransactionHistory` class is the entity that will be mapped to the database.

2. `@Table(name = "v_transaction_history")` annotation: This annotation specifies the name of the table in the database that the `TransactionHistory` class is associated with.

3. Class fields:
    - `transaction_id`: Unique transaction ID (`@Id` field).
    - `account_id`: ID of the account associated with this transaction.
    - `user_id`: ID of the user associated with this transaction.
    - `transaction_type`: Transaction type, e.g. "purchase", "transfer funds", etc.
    - `amount`: Amount of the transaction.
    - `source`: The source of the transaction, e.g. "internal account", "external account", etc.
    - `status`: Transaction status.
    - `reason_code`: Transaction reason code.
    - `created_at`: Date and time the transaction was created.

4. Access methods (getters and setters): For each field of the `TransactionHistory` class, access methods are defined for getting and setting field values.

    - Getters (`get...()`): Methods that return field values.
    - Setters (`set...()`): Methods that set field values.

The `TransactionHistory` class provides a structure for storing the history of transactions in the banking system and provides access to this information through accessor methods. It is also used in connection with a database, where each `TransactionHistory` object represents a transaction history record.

### 20. User.java:

The `User` file represents a model class that describes users in the banking system. It contains various fields and methods for accessing and setting the values of these fields. Here is an overview of the class functions:

1. `@Entity` annotation: This annotation specifies that the `User` class is the entity that will be mapped to the database.

2. Class fields:
    - `user_id`: Unique user ID (field `@Id`).
    - `first_name`: Username.
    - `last_name`: Last name of the user.
    - `email`: The user's email address (must match the email format).
    - `password`: User password.
    - `token`: User token.
    - `code`: User code.
    - `verified`: Flag indicating whether the user has been verified.
    - `verified_at`: The date the user was verified.
    - `created_at`: Date and time the user was created.
    - `updated_at`: The date and time the user information was last updated.

3. Annotations for validation:
    - `@NotEmpty`: The field cannot be empty.
    - `@Size`: Limit on the length of the field value.
    - `@Email`: The field must match the email format.
    - `@Pattern`: The field must match the given regular expression.

4. Access methods (getters and setters): For each field of the `User` class, access methods are defined for getting and setting field values.

    - Getters (`get...()`): Methods that return field values.
    - Setters (`set...()`): Methods that set field values.

The `User` class provides a structure for storing information about users in the banking system and provides access to this information through access methods. It is also used in connection with a database, where each `User` object represents a user record.

### 21. AccountRepository.java:

The `AccountRepository` file is a repository interface that defines methods for interacting with the database for the `Account` entity. Here is an overview of the functions defined in the interface:

1. Annotation `@Repository`: Indicates that the interface is a repository component that provides access to data.

2. `CrudRepository<Account, Integer>` interface: Extends the `CrudRepository` interface and defines basic methods for creating, reading, updating, and deleting records in the database for the `Account` entity. The `Account` and `Integer` parameter types indicate the entity type and the primary key type.

3. Request methods:
    - `getUserAccountsById(int user_id)`: Execute a database query to get a list of user bank accounts with the given `user_id`.
    - `getTotalBalance(int user_id)`: Executes a database query to get the total balance of all user accounts with the given `user_id`.
    - `getAccountBalance(int user_id, int account_id)`: Executes a database query to get the balance of a specific user account given `user_id` and `account_id`.
    - `changeAccountBalanceById(double new_balance, int account_id)`: Updates the balance of the given account by its `account_id` in the database.
    - `createBankAccount(int user_id, String account_number, String account_name, String account_type)`: Creates a new bank account for a user with the given `user_id`, `account_number`, `account_name` and `account_type` in the database.

4. Annotations:
    - `@Query`: Specifies a database query using SQL or JPQL.
    - `@Modifying`: Indicates that the query modifies data in the database.
    - `@Param`: Used to bind method parameters to query parameters.

5. Annotation `@Transactional`: Indicates that the method should be executed within a transaction, which ensures data consistency when performing multiple operations.

The `AccountRepository` interface provides an abstraction for performing various operations on the `Account` entity data in the database, such as getting account information, updating balances, creating new accounts, and other operations. This interface allows you to interact with the database without requiring you to write SQL queries manually, but instead using annotated query methods.

### 22. PaymentHistoryRepository.java:

The `PaymentHistoryRepository` file is a repository interface that defines methods for interacting with the database for the `PaymentHistory` entity. Here is an overview of the functions defined in the interface:

1. Annotation `@Repository`: Indicates that the interface is a repository component that provides access to data.

2. `CrudRepository<PaymentHistory, Integer>` interface: Extends the `CrudRepository` interface and defines the basic methods for creating, reading, updating, and deleting records in the database for the `PaymentHistory` entity. The `PaymentHistory` and `Integer` parameter types indicate the entity type and the primary key type.

3. Request methods:
    - `getPaymentRecordsById(int user_id)`: Query the database to get a list of payment records for the user with the given `user_id`.

4. Annotation `@Query`: Defines a database query using SQL or JPQL.

5. `@Param` annotation: Used to bind method parameters to query parameters.

The `PaymentHistoryRepository` interface provides an abstraction for performing operations on the data of the `PaymentHistory` entity in the database, such as getting payment records for a specific user. This interface allows you to interact with the database using an annotated query method rather than manually writing SQL queries.

### 23. PaymentRepository.java:

The `PaymentRepository` file is a repository interface that defines methods for interacting with the database for the `Payment` entity. Here is an overview of the functions defined in the interface:

1. Annotation `@Repository`: Indicates that the interface is a repository component that provides access to data.

2. `CrudRepository<Payment, Integer>` interface: Extends the `CrudRepository` interface and defines the basic methods for creating, reading, updating and deleting records in the database for the `Payment` entity. The `Payment` and `Integer` parameter types indicate the entity type and the primary key type.

3. Request methods:
    - `makePayment(...)`: Inserts a new payment record into the database with the given parameters, such as `account_id`, `beneficiary`, `beneficiary_acc_no`, `amount`, `reference_no`, `status`, `reason_code `, `created_at`.

4. Annotation `@Query`: Defines a database query using SQL or JPQL.

5. Annotation `@Modifying`: Indicates that the method performs a modification request, such as inserting, updating, or deleting data.

6. Annotation `@Param`: Used to bind method parameters to query parameters.

7. Annotation `@Transactional`: Indicates that the method is executed within a transaction.

The `PaymentRepository` interface provides an abstraction for performing operations on the data of the `Payment` entity in the database, such as creating a new payment. This interface allows you to interact with the database using an annotated query method rather than manually writing SQL queries.

### 24. TransactHistoryRepository.java:

The `TransactHistoryRepository` file is a repository interface that defines methods for interacting with the database for the `TransactionHistory` entity. Here is an overview of the functions defined in the interface:

1. Annotation `@Repository`: Indicates that the interface is a repository component that provides access to data.

2. `CrudRepository<TransactionHistory, Integer>` interface: Extends the `CrudRepository` interface and defines the basic methods for creating, reading, updating, and deleting records in the database for the `TransactionHistory` entity. The `TransactionHistory` and `Integer` parameter types indicate the entity type and the primary key type.

3. Request methods:
    - `getTransactionRecordsById(...)`: Fetches records from the database that match the specified `user_id` and returns a list of `TransactionHistory` objects.

4. Annotation `@Query`: Defines a database query using SQL or JPQL.

5. `@Param` annotation: Used to bind method parameters to query parameters.

The `TransactHistoryRepository` interface provides an abstraction for performing operations on the data of the `TransactionHistory` entity in the database, such as getting the transaction history records for a particular `user_id`. This interface allows you to interact with the database using an annotated query method rather than manually writing SQL queries.

### 25. TransactRepository.java:

The `TransactRepository` file is a repository interface that defines methods for interacting with the database for the `Transact` entity. Here is an overview of the functions defined in the interface:

1. Annotation `@Repository`: Indicates that the interface is a repository component that provides access to data.

2. `CrudRepository<Transact, Integer>` interface: Extends the `CrudRepository` interface and defines the basic methods for creating, reading, updating, and deleting records in the database for the `Transact` entity. The `Transact` and `Integer` parameter types indicate the entity type and the primary key type.

3. Request methods:
    - `logTransaction(...)`: Inserts a new transaction record into the `transaction_history` table of the database. The method uses the `@Modifying`, `@Transactional` and `@Query` annotations to define the SQL query to be executed. Method parameters are associated with query parameters using the `@Param` annotation.

4. Annotation `@Modifying`: Indicates that the method performs a modifying operation (such as inserting, updating, or deleting data) on the database.

5. Annotation `@Transactional`: Indicates that the method should be executed within a database transaction.

6. Annotation `@Query`: Defines a database query using SQL or JPQL.

7. `@Param` annotation: Used to bind method parameters to query parameters.

The `TransactRepository` interface provides an abstraction for performing operations on the data of the `Transact` entity in the database, such as registering a new transaction in the transaction history. This interface allows you to interact with the database using an annotated query method rather than manually writing SQL queries.

### 26. UserRepository.java:

The `UserRepository` file is a repository interface that defines methods for interacting with the database for the `User` entity. Here is an overview of the functions defined in the interface:

1. Annotation `@Repository`: Indicates that the interface is a repository component that provides access to data.

2. `CrudRepository<User, Integer>` interface: Extends the `CrudRepository` interface and defines basic methods for creating, reading, updating, and deleting records in the database for the `User` entity. The `User` and `Integer` parameter types indicate the entity type and the primary key type.

3. Request methods:
    - `getUserEmail(...)`: Returns the user's email at the given email address.
    - `getUserPassword(...)`: Returns the password of the user at the given email address.
    - `isVerified(...)`: Returns a flag indicating whether the user has been verified for the given email address.
    - `getUserDetails(...)`: Returns the user information (all fields) for the given email address.
    - `registerUser(...)`: Registers a new user by inserting a new record into the `users` table of the database.
    - `verifyAccount(...)`: Verifies a user account by updating the appropriate fields in the `users` table.
    - `checkToken(...)`: Checks if the user's token exists in the database.

4. Annotation `@Modifying`: Indicates that the method performs a modifying operation (such as inserting, updating, or deleting data) on the database.

5. Annotation `@Transactional`: Indicates that the method should be executed within a database transaction.

6. Annotation `@Query`: Defines a database query using SQL or JPQL.

7. `@Param` annotation: Used to bind method parameters to query parameters.

The `UserRepository` interface provides an abstraction for performing operations on the data of the `User` entity in the database, such as getting user information, registering a new user, verifying an account, and other operations. This interface allows you to interact with the database using annotated query methods rather than manually writing SQL queries.

### 27. RestAuthApiController.java:

The `RestAuthApiController` file is a REST API controller for user authentication. Here is an overview of its features:

1. Annotation `@RestController`: Indicates that the class is a REST API controller that processes HTTP requests and returns data in JSON format.

2. Annotation `@RequestMapping("/api/auth")`: Sets the base path for all endpoints in this controller, which means that endpoints will be available at `/api/auth`.

3. `@Autowired` annotation: Used to automatically wire (inject) the `UserRepository` dependency into the controller.

4. Field `private UserRepository userRepository`: The `UserRepository` repository that will be used to access user data.

5. Method `validateUserEmail(...)`: Handles a GET request along the path `/api/auth/login`. Accepts an `email` variable from the path and returns a `ResponseEntity` which contains the response and HTTP status.

    - Gets the user's email address by calling the `getUserEmail(...)` method of the `UserRepository` repository.
    - Initializes the `userPassword` variable as `null`.
    - Checks if the received email address is valid.
    - If the email address is valid, calls the `getUserPassword(...)` method of the `UserRepository` repository to get the user's password.
    - Returns `ResponseEntity` with user password and HTTP status `HttpStatus.OK`.
    - If the email address is invalid, returns a `ResponseEntity` with a "User Not Found" message and an HTTP status of `HttpStatus.NOT_FOUND`.

This controller handles requests for user authentication at `/api/auth/login`. It validates the user's email address and returns the corresponding password if the email address exists in the database. If the email address is not found, a "User Not Found" message is returned.

### 28. RestTransactApiController.java:

The `RestTransactApiController` file is the REST API controller for transactions. At the moment it does not contain any methods or logic, only annotations and a class declaration. Here is a brief description of its functionality:

1. Annotation `@RestController`: Indicates that the class is a REST API controller that processes HTTP requests and returns data in JSON format.

2. Annotation `@RequestMapping("/api/transact")`: Sets the base path for all endpoints in this controller, which means that endpoints will be available at `/api/transact`.

This controller provides the basis for implementing transaction related functionality in the system. Later, you can add methods to this controller to handle transaction related requests, such as creating a transaction, getting transaction history, etc.

### 29. DemoBankApplication.java:

The `DemoBankApplication` file represents the main Spring Boot application class. It contains the entry point to the application and the configuration to run the web server application. Here is a brief description of its functionality:

1. Annotation `@SpringBootApplication`: Denotes the main class of a Spring Boot application. She performs several roles:
    - `@Configuration`: Declares a class as a configuration source that allows you to define beans and other application settings.
    - `@EnableAutoConfiguration`: Automatically configures the application based on dependencies and classes in the classpath.
    - `@ComponentScan`: Scans packages to find and register components, services, and other Spring classes.

2. The `DemoBankApplication` class inherits from `SpringBootServletInitializer`, which allows you to use dependency injection and configure Spring Boot for a web application.

3. `configure()` method: Overrides the `configure()` method from `SpringBootServletInitializer` to configure the application for deployment to the web server. It specifies that `DemoBankApplication` is the main class to deploy.

4. Method `main()`: Entry point to the application. Runs a Spring Boot application with `SpringApplication.run(DemoBankApplication.class, args)`.

The general function of `DemoBankApplication` is to initialize and run a Spring Boot application to execute business logic and provide web services.

### 30. application.properties

The `application.properties` file contains the configuration parameters for the Spring Boot application. Here is a brief description of each line in the file:

1. `spring.jpa.hibernate.ddl-auto=update`: This property determines how Hibernate will handle the database schema. The "update" value tells Hibernate to update the database schema as needed.

2. `spring.datasource.url=jdbc:mysql://localhost:3306/demo_bank`: Specifies the URL of the MySQL database to connect to. In this case, the local host (localhost) and port 3306 is used, with the demo_bank database.

3. `spring.datasource.username=root`: The username to connect to the MySQL database.

4. `spring.datasource.password=test`: Password to connect to the MySQL database.

5. `spring.datasource.driver-class-name=com.mysql.jdbc.Driver`: Specifies the JDBC driver that will be used to connect to the MySQL database.

6. `spring.jpa.show-sql=true`: Specifies that Hibernate should output SQL queries to the console for debugging and analysis.

7. `server.address=127.0.0.1`: The IP address where the web server will run.

8. `server.port=8070`: The port on which the web server will run.

9. `server.error.whitelabel.enabled=false`: Disables the standard error page provided by Spring Boot and allows you to handle errors yourself.

The `application.properties` file plays an important role in configuring the database connection, server configuration, and other parameters of a Spring Boot application.

### 31. pom.xml

The `pom.xml` file is the main Maven project file and contains information about the project and its dependencies. Here is a brief description of each section of the file:

1. `<modelVersion>4.0.0</modelVersion>`: Specifies the version of the POM.

2. `<parent>`: Specifies the parent project, in this case `spring-boot-starter-parent`, which provides configuration and dependencies for the project.

3. `<groupId>com.demo_bank</groupId>`: The unique ID of the project group.

4. `<artifactId>DemoBank</artifactId>`: Artifact (project) ID.

5. `<name>DemoBank</name>`: Project name.

6. `<description>Easy Way Bank Application</description>`: Description of the project.

7. `<packaging>jar</packaging>`: Specifies the packaging format for creating an executable JAR file.

8. `<properties>`: Specifies the properties of the project, in this case `java.version` specifies the version of Java.

9. `<dependencies>`: Specifies project dependencies. Various dependencies are listed here, such as `spring-boot-starter-data-jpa`, `spring-boot-starter-mail`, `spring-boot-starter-web`, `mysql-connector-j`, `spring- boot-starter-test`, and others. These dependencies allow you to use different functionality and libraries in your project.

10. `<build>`: Specifies the project's build configuration. In this case, the `spring-boot-maven-plugin` plugin is used, which allows you to create an executable JAR file.

The `pom.xml` file plays an important role in project dependency management, building, and configuration. Maven uses this file to define dependencies, build tasks, and other project settings.

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

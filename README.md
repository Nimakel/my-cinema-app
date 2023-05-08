# Cinema Shop 🎫
This project is imitation a cinema shop service. Project works on Spring, REST API and Hibernate. User can create a basket, add tickets, and view their own order history, while administrator can manage cinema halls, movie sessions, movies, and search user by email. 
# Features
* Register, authentication and authorization
* Make order and add it to shopping cart
* Manage your shopping cart
* Add and delete movie
* Add and delete movie session
* Add and delete cinema hall
* Add movie to movie session
* Add cinema hall to movie session
* Check available movie session for a certain period of time
* Find user by email
# How to run project
* Clone this repository
* Setup JDK
* Create new connect in DB such as MySQL and setup it
* Replace the values of the `"YOUR URL"`, `"YOUR USERNANE"`, `"YOUR PASSWORD"`, `"YOUR DRIVER"` properties with the appropriate values for your database setup
* Build project by using Maven: ▶ *mvn clean package*
* Configure a servlet container such as Tomcat
* Deploy WAR file to a servlet container such as Tomcat
* After deploying the project, navigate to http://localhost:8080 in your browser
* Use Postman to send GET, POST, PUT, DELETE HTTP methods
* Login as admin: email - `admin@admin.su`, password - `qwerty123`
* Login as user: email - `user@user.su`, password - `qwerty123`
# Structure
* `config`: Application configuration
* `controller`: Classes that handle HTTP requests and responses
* `dao`: Data Access Object interfaces and their implementations
* `dto`: Data Transfer Object models for requests and responses
* `exception`: Custom exception
* `lib`: Email and Password validators and their annotations
* `model`: Entities that represent data in Database
* `security`: Custom User Details Service
* `service`: Service interfaces and their implementation that perform business logic
* `service.mapper`: Mappers that convert request DRO to Entity and Entity to response DTO
* `util`: Date and Time patterns
* `resources`: Contains Database properties
# Database Structure  
![structure](https://user-images.githubusercontent.com/111348563/236689864-a4809864-0d39-489a-8743-75a110af334d.png)
# Endpoints and available HTTP methods
### For user:
* POST: http://localhost:8080/register - Registration
* GET: http://localhost:8080/cinema-halls/available - Available Movie Sessions today (from 00:00 am to 12:00 pm)
* GET: http://localhost:8080/cinema-halls - Get all Movie Sessions
* GET: http://localhost:8080/movies - All movies
* GET: http://localhost:8080/orders - Get all user orders
* GET: http://localhost:8080/shopping-carts/by-user - Get Shopping Cart
* POST: http://localhost:8080/orders/complete - Complete order
* PUT: http://localhost:8080/shopping-carts/movie-sessions - Add Movie Session to Shopping Cart  
### For admin:
* GET: http://localhost:8080/users/by-email?email=email - Find user by email
* POST: http://localhost:8080/movies - Create a Movie
* POST: http://localhost:8080/movie-sessions - Create a Movie Session
* POST: http://localhost:8080/cinema-halls - Create a Cinema Hall
* GET: http://localhost:8080/cinema-halls - Get all Movie Sessions
* GET: http://localhost:8080/movies - All movies
* DELETE: http://localhost:8080/movie-sessions/{id} - Delete Movie Session by ID
# Used Technologies
* Java `v.17`
* Maven `v.4.0.0`
* Hibernate `v.5.6.14`
* Spring Framework `v.5.3.20`
* Spring ORM `v.5.3.20`
* Spring WebMVC `v.5.3.20`
* Spring Security `v.5.3.20`
* MySQL `v.8.0.22`
* Tomcat `v.9.0.74`
# Authors
[Maksym Yashyn](https://www.linkedin.com/in/maksym-yashyn-dnipro/)

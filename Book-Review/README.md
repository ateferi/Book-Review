## Capstone Project - IT Book Review
**Review App** is a responsive Spring Boot application based on MVC architecture that supports CRUD operations and allows users to submit new reviews and manage existing ones via browser.

### Live Preview
https://it-book-review.herokuapp.com/

### Frontend Specifications
- Implemented using ReactJS (with React Router, Axios, SessionStorage, Controlled & Uncontrolled Forms)
- Uses Bootstrap for styling
- Made responsive by adding media queries
- Uses [IT Bookstore API](https://api.itbook.store/) to collect books
- Uses secured Backend REST Service API to manage reviews
- Uses Basic Authentication at user login to access protected resources (Admin Panel)
- Includes Components for CRUD operations

### Backend Specifications
- Implemented using Spring Boot (with Spring Security, Spring Web, Spring Data JPA)
- Uses MySql as a SQL database
- Uses Maven as a build tool
- Uses MVC architecture
- Uses Apache Tomcat as a web server
- Implements all CRUD operations, utilizing Entities, Controller classes, and Interfaces

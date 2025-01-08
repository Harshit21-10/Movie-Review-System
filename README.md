# Movie Review System

## **Description**
The **Movie Review System** is a web application designed to enable users to review, rate, and comment on movies. It serves as a platform for movie enthusiasts to share their opinions while exploring reviews from other users. The system is built using modern web technologies to ensure scalability and robust performance.

---

## **Features**
- **User Authentication:** Secure login and registration functionality.
- **Movie Reviews:** Users can create, edit, and delete reviews.
- **Ratings System:** Provide ratings and view aggregated ratings for movies.
- **Comment Section:** Engage with others' reviews through comments.
- **Search Functionality:** Find movies and reviews easily.
- **Responsive Design:** Accessible on both desktop and mobile devices.

---

## **Technologies Used**

### **Backend**
- **Java**
- **Spring Boot Framework**
- **MongoDB** (Database)

### **Development Tools**
- IntelliJ IDEA
- Postman (for API testing)
- Git & GitHub (for version control)

---

## **My Role**
This was a **group project**, and I was responsible for developing the **backend** of the application using **Spring Boot**. My contributions included:

- Designing and implementing the backend architecture.
- Developing RESTful APIs for:
  - User Authentication and Authorization.
  - CRUD operations for movies and reviews.
  - Integration with MongoDB for data storage and retrieval.
- Ensuring secure, scalable, and maintainable backend services.
- Writing comprehensive API documentation for frontend integration.

---

## **API Endpoints**

### **Movies**
| Method | Endpoint              | Description                 |
|--------|-----------------------|-----------------------------|
| GET    | `/movies`             | Get all movies.             |
| POST   | `/movies`             | Add a new movie.            |
| GET    | `/movies/{id}`        | Get movie details by ID.     |
| PUT    | `/movies/{id}`        | Update movie details.        |
| DELETE | `/movies/{id}`        | Delete a movie.              |

### **Reviews**
| Method | Endpoint                      | Description                        |
|--------|-------------------------------|------------------------------------|
| GET    | `/movies/{id}/reviews`        | Get all reviews for a movie.       |
| POST   | `/movies/{id}/reviews`        | Add a review for a movie.          |
| PUT    | `/reviews/{reviewId}`         | Update a review.                   |
| DELETE | `/reviews/{reviewId}`         | Delete a review.                   |

---

## **Database Schema (MongoDB)**

### **Collections**
1. **Users**
   - Fields: `userId`, `username`, `password`, `email`
2. **Movies**
   - Fields: `movieId`, `title`, `description`, `genre`, `releaseDate`
3. **Reviews**
   - Fields: `reviewId`, `movieId`, `userId`, `rating`, `reviewText`, `timestamp`

---

## **How to Run the Project**

### **Prerequisites**
- Java (JDK 11 or higher)
- Maven
- MongoDB (running locally or on a server)

### **Steps**
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd movie-review-system
   ```
2. Install dependencies:
   ```bash
   mvn clean install
   ```
3. Set up the MongoDB database:
   - Create a database named `movie_reviews`.
   - Configure the `application.properties` file with MongoDB credentials.
4. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```
5. Test APIs using Postman or any REST client.

---

## **Future Enhancements**
- Implement user roles (Admin, Moderator, etc.).
- Add advanced search with filters (genre, release year, etc.).
- Integrate a movie recommendation system.
- Add real-time features like live comments or notifications.

---

## **Acknowledgments**
Special thanks to the team members and mentors for their guidance and support throughout the project.

---


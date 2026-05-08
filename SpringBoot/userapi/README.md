🚀 User API (Spring Boot + JWT Authentication)
📌 Introduction

This is a Spring Boot REST API for managing users with JWT-based authentication and authorization.

The project demonstrates:

User CRUD operations
JWT authentication & authorization
Spring Security integration
Pagination & sorting
DTO pattern
Global exception handling
Swagger (OpenAPI) documentation
🛠 Tech Stack
Java 17+
Spring Boot 3
Spring Security
Spring Data JPA
PostgreSQL
JWT (JSON Web Token)
Swagger / OpenAPI
▶️ How to Run the Application
1️⃣ Clone the project
git clone <your-repo-url>
cd userapi
2️⃣ Configure Database (PostgreSQL)

Update application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/your_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
3️⃣ Run the application
mvn spring-boot:run

App will start at:

http://localhost:8080
🔐 Authentication Flow (JWT)
Step 1 — Login
POST http://localhost:8080/auth/login

Body:

{
"username": "john@example.com",
"password": "1234"
}

Response:

{
"token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}
Step 2 — Use Token

Add header in Postman:

Authorization: Bearer YOUR_TOKEN
👤 Auth APIs
🔹 Login
POST /auth/login
🔹 Get Logged-in User (3 ways)
GET /auth/me
GET /auth/me2
GET /auth/me3
🔹 Profile
GET /auth/profile

Response:

Welcome john@example.com

👥 User APIs

🔹 Create User
POST http://localhost:8080/users

Body:

{
"name": "John Doe",
"email": "john@example.com",
"password": "1234"
}


🔹 Get All Users (Pagination + Sorting)
GET http://localhost:8080/users?page=0&size=3

With sorting:
GET http://localhost:8080/users?page=0&size=3&sort=name,asc

🔹 Get User by ID
GET http://localhost:8080/users/{id}
🔹 Update User
PUT http://localhost:8080/users/{id}

🔹 Delete User
DELETE http://localhost:8080/users/{id}

🔐 Security Behavior
Scenario	Result
No token	401 Unauthorized
Invalid token	401 Unauthorized
Valid token	200 OK
⚙️ Concepts Used
✅ JWT Authentication
Token generation on login
Token validation on each request
✅ Spring Security
Secured all endpoints except /auth/login
Custom JWT filter
SecurityContext for authentication
✅ DTO Pattern
UserDTO used instead of exposing entity
Cleaner API response
✅ Pagination & Sorting
Pageable support in APIs
Efficient data fetching
✅ Exception Handling
Global exception handler
Custom ResourceNotFoundException
✅ Logging
Request logging using filter
SLF4J Logger
✅ Swagger Documentation

Open Swagger UI:

http://localhost:8080/swagger-ui/index.html

API Docs:

http://localhost:8080/v3/api-docs
🧪 Testing with Postman
1. Login → get token
2. Copy token
3. Add header:
   Authorization: Bearer <token>
4. Test any /users API


   📂 Project Structure
   controller/
   service/
   repository/
   model/
   dto/
   config/
   security/
   exception/



   🚀 Future Improvements
   🔐 Password encryption (BCrypt)
   👥 Role-based authorization (ADMIN/USER)
   🔄 Refresh tokens
   📦 Docker support
   🌐 Deployment
   🎯 Summary


This project demonstrates a complete backend system with:

Secure authentication
Clean architecture
Production-ready patterns
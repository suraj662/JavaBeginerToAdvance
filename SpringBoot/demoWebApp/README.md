# 🚀 Demo Web App (Spring Boot + PostgreSQL + Docker)

A simple **CRUD-based web application** built using **Spring Boot**, integrated with **PostgreSQL**, and containerized using **Docker**.

This project demonstrates how to build and run a backend service with database integration in a real-world environment.

---

## 🧰 Tech Stack

- ☕ Java
- 🌱 Spring Boot
- 🐘 PostgreSQL
- 🐳 Docker & Docker Compose
- 📦 Maven

---

## ✨ Features

- ✅ Create, Read, Update, Delete (CRUD) operations
- ✅ RESTful API design
- ✅ PostgreSQL database integration
- ✅ Dockerized application (easy setup)
- ✅ Clean project structure for learning

---

## 📂 Project Structure


demoWebApp/
│── src/
│ ├── main/
│ │ ├── java/ # Application source code
│ │ ├── resources/ # Config files (application.properties)
│
│── Dockerfile
│── docker-compose.yml
│── pom.xml


---

## ⚙️ How to Run the Project

### 🔹 Option 1: Run with Docker (Recommended)

```bash
docker-compose up --build
Spring Boot app will start
PostgreSQL container will run automatically
🔹 Option 2: Run Locally (Without Docker)
Start PostgreSQL locally
Update DB config in:
src/main/resources/application.properties
Run the app:
mvn spring-boot:run
📡 API Endpoints
Method	Endpoint	Description
GET	/users	Get all users
GET	/users/{id}	Get user by ID
POST	/users	Create new user
PUT	/users/{id}	Update user
DELETE	/users/{id}	Delete user
🧪 Testing the API

You can test using:

Postman
cURL
Browser (for GET APIs)
🐳 Docker Setup

Make sure Docker is installed:

Build & Run:
docker-compose up --build
Stop containers:
docker-compose down
📌 Learning Outcome

This project helped me understand:

Building REST APIs with Spring Boot
Connecting backend with PostgreSQL
Containerizing applications using Docker
Managing multi-service setup with Docker Compose
🙌 Author

Suraj

GitHub: https://github.com/suraj662
⭐ Support

If you like this project, consider giving it a ⭐ on GitHub!

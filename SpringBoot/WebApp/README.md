# WebApp - Spring Boot Authentication & RBAC API

## Introduction

WebApp is a production-style backend REST API built using Spring Boot.

This project demonstrates:

* JWT Authentication
* Role-Based Access Control (RBAC)
* BCrypt Password Encryption
* Spring Security
* Custom Validation
* DTO Mapping
* Global Exception Handling
* Protected APIs
* Stateless Authentication

The project is designed to simulate real-world backend architecture used in enterprise Java applications.

---

# Tech Stack

* Java 17
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate
* JWT (JSON Web Token)
* BCrypt Password Encoder
* PostgreSQL / H2 Database
* Maven
* Lombok
* Jakarta Validation
* MapStruct

---

# Features

## Authentication

* User Registration
* User Login
* JWT Token Generation
* JWT Validation
* Protected APIs

---

## Authorization

### RBAC (Role-Based Access Control)

Roles:

* USER
* ADMIN

Permissions:

### USER

* Access own profile
* Access user APIs

### ADMIN

* Access admin APIs
* Access all protected resources

---

## Security

* BCrypt encrypted passwords
* Stateless authentication
* JWT filter using OncePerRequestFilter
* Spring SecurityFilterChain

---

## Validation

Custom password validation using:

`@ValidPassword`

Rules:

* Minimum 8 characters
* At least 1 uppercase letter
* At least 1 number

---

# Project Structure

```text
src/main/java/com/example/webapp

├── config
├── controller
├── dto
├── exception
├── mapper
├── model
├── repository
├── security
├── service
├── validation
```

---

# API Endpoints

# Authentication APIs

## Register User

```http
POST /auth/register
```

Request:

```json
{
  "name": "Pawan",
  "email": "pawan@gmail.com",
  "password": "Abcd1234"
}
```

Response:

```text
User registered successfully
```

---

## Login User

```http
POST /auth/login
```

Request:

```json
{
  "email": "pawan@gmail.com",
  "password": "Abcd1234"
}
```

Response:

```json
{
  "token": "JWT_TOKEN"
}
```

---

# Protected APIs

## Current Logged-In User

```http
GET /auth/me
```

Headers:

```text
Authorization: Bearer YOUR_TOKEN
```

---

# User APIs

## User Profile

```http
GET /user/profile
```

Access:

* USER
* ADMIN

---

# Admin APIs

## Admin Dashboard

```http
GET /admin/dashboard
```

Access:

* ADMIN only

---

# JWT Authentication Flow

## Step 1 — Login

User sends:

```json
{
  "email": "pawan@gmail.com",
  "password": "Abcd1234"
}
```

---

## Step 2 — Verify Credentials

Spring Security verifies password using BCrypt.

---

## Step 3 — Generate JWT

JWT contains:

```json
{
  "sub": "pawan@gmail.com",
  "role": "USER"
}
```

---

## Step 4 — Send JWT

Server returns token to client.

---

## Step 5 — Access Protected APIs

Client sends token:

```text
Authorization: Bearer JWT_TOKEN
```

---

## Step 6 — JwtFilter Validates Token

Filter:

* validates token
* extracts email
* extracts role
* creates authentication object

---

## Step 7 — Spring Security Authorizes Request

Based on:

* ROLE_USER
* ROLE_ADMIN

---

# How To Run The Project

## 1. Clone Repository

```bash
git clone <your-repository-url>
```

---

## 2. Open Project

Open in:

* IntelliJ IDEA
* VS Code

---

## 3. Configure Database

Update:

```properties
src/main/resources/application.properties
```

Example PostgreSQL configuration:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/webapp
spring.datasource.username=postgres
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 4. Install Dependencies

```bash
mvn clean install
```

---

## 5. Run Application

```bash
mvn spring-boot:run
```

Application starts on:

```text
http://localhost:8080
```

---

# Testing APIs Using Postman

## Register

```http
POST http://localhost:8080/auth/register
```

---

## Login

```http
POST http://localhost:8080/auth/login
```

Copy JWT token.

---

## Access Protected API

```http
GET http://localhost:8080/user/profile
```

Add Header:

```text
Authorization: Bearer YOUR_TOKEN
```

---

# Concepts Used In This Project

## Spring Boot

Backend framework for REST APIs.

## Spring Security

Authentication and authorization framework.

## JWT

Token-based stateless authentication.

## BCrypt

Secure password hashing algorithm.

## RBAC

Role-Based Access Control.

## DTO

Data Transfer Objects for clean API communication.

## MapStruct

Entity ↔ DTO mapping.

## Validation

Request validation using annotations.

## OncePerRequestFilter

JWT validation filter.

## SecurityFilterChain

Spring Security configuration.

---

# Future Improvements

* Refresh Tokens
* API Rate Limiting
* Redis Caching
* Docker
* Nginx Reverse Proxy
* CI/CD Pipelines
* AWS Deployment
* Ownership Authorization
* Logging & Monitoring

---

# Author

Suraj Dev Yadav

Backend Developer | Java & Spring Boot

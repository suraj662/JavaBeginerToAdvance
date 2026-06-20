# Inventory Management System

A simple full-stack Inventory Management System built using **Spring Boot**, **Spring Data JPA**, **PostgreSQL**, **HTML**, **CSS**, and **JavaScript**.

This project demonstrates product management, inventory tracking, and order placement with automatic stock updates.

---

## Features

### Product Management

* Add new products
* View all products
* View product details by ID
* Track available stock quantity

### Order Management

* Place orders for products
* Automatic stock deduction after order placement
* Prevent ordering when stock is insufficient
* View all placed orders

### Dashboard

* Total Products Count
* Total Orders Count
* Low Stock Products Count
* Real-time product inventory table
* Recent Orders table

### Frontend

* Responsive dashboard UI
* Fetch API integration
* Real-time data loading from Spring Boot REST APIs
* Product selection dropdown with stock display

---

## Tech Stack

### Backend

* Java 24
* Spring Boot 4
* Spring Data JPA
* Hibernate
* PostgreSQL
* Lombok
* Maven

### Frontend

* HTML5
* CSS3
* JavaScript (ES6)
* Fetch API

---

## Project Structure

```text
inventory-management
│
├── src/main/java/com/example/inventorymanagement
│   ├── controller
│   │   ├── ProductController
│   │   └── OrderController
│   │
│   ├── service
│   │   ├── ProductService
│   │   └── OrderService
│   │
│   ├── repository
│   │   ├── ProductRepository
│   │   └── OrderRepository
│   │
│   ├── entity
│   │   ├── Product
│   │   └── Order
│   │
│   └── dto
│       ├── PlaceOrderRequest
│       └── OrderResponse
│
├── src/main/resources
│   └── application.properties
│
└── frontend
    ├── index.html
    ├── style.css
    └── inventory.js
```

---

## Database Configuration

### PostgreSQL

Database:

```sql
school
```

### application.properties

```properties
spring.datasource.url=jdbc:postgresql://localhost:5434/school
spring.datasource.username=postgres
spring.datasource.password=inventorymanagement

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8080
```

---

## Database Schema

### Product

| Column   | Type    |
| -------- | ------- |
| id       | BIGINT  |
| name     | VARCHAR |
| price    | DECIMAL |
| quantity | INTEGER |

### Order

| Column           | Type      |
| ---------------- | --------- |
| id               | BIGINT    |
| ordered_quantity | INTEGER   |
| order_date       | TIMESTAMP |
| product_id       | BIGINT    |

---

## Entity Relationship

```text
Product
   |
   | 1
   |
   |------< Orders
              *
```

* One Product can have many Orders
* Many Orders belong to one Product

---

## REST APIs

### Create Product

```http
POST /products
```

Request

```json
{
  "name": "Laptop",
  "price": 65000,
  "quantity": 10
}
```

---

### Get All Products

```http
GET /products
```

---

### Get Product By ID

```http
GET /products/{id}
```

---

### Place Order

```http
POST /orders
```

Request

```json
{
  "productId": 1,
  "quantity": 2
}
```

Response

```json
{
  "id": 1,
  "orderedQuantity": 2,
  "orderDate": "2026-06-19T22:00:00"
}
```

---

### Get All Orders

```http
GET /orders
```

Response

```json
[
  {
    "id": 1,
    "productName": "Laptop",
    "orderedQuantity": 2,
    "orderDate": "2026-06-19T22:00:00"
  }
]
```

---

## Business Logic

### Order Placement

1. Fetch Product by Product ID
2. Check available stock
3. If stock is insufficient:

```text
Insufficient stock
```

4. Reduce product quantity
5. Save updated product
6. Create order record
7. Return order response

---

## Run Backend

```bash
mvn clean install

mvn spring-boot:run
```

Application starts on:

```text
http://localhost:8080
```

---

## Run Frontend

If using VS Code:

Install:

```text
Live Server Extension
```

Then:

```text
Right Click index.html
→ Open With Live Server
```

Frontend URL:

```text
http://127.0.0.1:5500
```

---

## Screenshots

### Dashboard

* Product Statistics
* Order Statistics
* Low Stock Monitoring
* Product Inventory Table
* Recent Orders Table

---

## Future Enhancements

* Product Search
* Update Product
* Delete Product
* Category Management
* Pagination
* Validation
* Global Exception Handling
* Supplier Management
* JWT Authentication
* Role-Based Authorization
* Reports & Analytics
* Export to CSV/Excel
* Charts Dashboard

---

## Author

Developed as a Spring Boot Full Stack Learning Project.

Built with Java, Spring Boot, PostgreSQL, HTML, CSS, and JavaScript.

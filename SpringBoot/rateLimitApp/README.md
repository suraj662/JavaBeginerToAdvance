# 🚀 Rate Limit App

A Spring Boot project demonstrating **API Rate Limiting** using **Bucket4j**.

This project limits how many requests a client can send within a time period.

Example:
- Max 5 requests per minute per IP address

---

# 📌 Features

✅ Spring Boot 4  
✅ API Rate Limiting  
✅ Bucket4j Token Bucket Algorithm  
✅ OncePerRequestFilter  
✅ IP-based request tracking  
✅ HTTP 429 response handling  

---

# 🧠 What is Rate Limiting?

Rate limiting controls how many requests a client can make.

Used for:

- Preventing spam
- Preventing brute-force attacks
- Protecting APIs
- Avoiding server overload
- API Gateway security

---

# 🛠 Tech Stack

- Java 17
- Spring Boot
- Bucket4j
- Maven

---

# 📂 Project Structure

```text
src/main/java/com/example/ratelimitapp
│
├── controller
│   └── HelloController.java
│
├── filter
│   └── RateLimitFilter.java
│
└── RateLimitAppApplication.java
▶️ Run Project
1. Clone Project
git clone <your-repo-url>
2. Go to Project
cd rateLimitApp
3. Build Project
./mvnw clean install
4. Run Application
./mvnw spring-boot:run
🌐 API Endpoint
Test API
GET http://localhost:8080/hello
✅ Expected Behavior

First 5 requests:

Hello from Rate Limit App

After limit exceeds:

429 Too Many Requests

Response:

Too many requests. Try again later.
⚙️ Rate Limit Configuration

Inside RateLimitFilter.java

Bandwidth limit = Bandwidth.builder()
        .capacity(5)
        .refillGreedy(5, Duration.ofMinutes(1))
        .build();

Meaning:

Maximum 5 requests
Refills every 1 minute

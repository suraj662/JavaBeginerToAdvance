# 🚀 CI/CD Demo App

A simple Spring Boot application created to learn:

- CI/CD pipelines
- GitHub Actions
- Automated Maven builds
- Deployment concepts
- Production workflow basics

This project is part of backend engineering learning for Java + Spring Boot.

---

# 📌 Tech Stack

- Java 17
- Spring Boot
- Maven
- GitHub Actions
- REST API

---


# 📂 Project Structure

```bash
cicd-demo-app/
 ├── src/
 ├── pom.xml
 ├── .github/
 │    └── workflows/
 │         └── ci.yml
⚙️ Features


✅ Spring Boot REST API
✅ Maven Build Automation
✅ GitHub Actions CI Pipeline
✅ Automated Build on Push
✅ Automated Test Execution


🚀 Run Locally
1️⃣ Clone Repository
git clone https://github.com/suraj662/JavaBeginerToAdvance.git

2️⃣ Go to Project
cd JavaBeginerToAdvance/SpringBoot/cicd-demo-app

3️⃣ Run Application

Mac/Linux
./mvnw spring-boot:run

Windows
mvnw.cmd spring-boot:run

🌐 API Endpoint

Test API

GET Request
GET http://localhost:8080/

Response

Hello CI/CD
🔄 CI/CD Pipeline



This project uses GitHub Actions for Continuous Integration.

Pipeline automatically runs when:

code is pushed
pull request is created
📄 GitHub Actions Workflow

Location:

.github/workflows/ci.yml
⚡ CI Pipeline Steps

The pipeline performs:


Checkout source code
Setup Java 17
Build Maven project
Run tests
Verify build success


🛠 Example Workflow
name: CI-CD Pipeline

on:
  push:
    branches:
      - main

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - name: Checkout code
        uses: actions/checkout@v4

      - name: Setup Java
        uses: actions/setup-java@v4
        with:
          distribution: temurin
          java-version: 17

      - name: Build project
        run: mvn clean install


▶️ How to Trigger CI

Simply push code:

git add .
git commit -m "Update project"
git push origin main


GitHub Actions will automatically start.

📸 View Pipeline

GitHub Repository →

Actions Tab

There you can see:

Build logs
Success/failure status
Workflow history


📚 Concepts Learned
Spring Boot
REST APIs
Controllers
Maven project structure
CI/CD
Continuous Integration
Automated builds
GitHub Actions


Workflow automation
DevOps Basics
Build pipelines
Deployment preparation
Cloud deployment concepts

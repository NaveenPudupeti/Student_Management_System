Student Management System

Introduction

The Student Management System is a web-based application built using Spring Boot and Thymeleaf. It allows administrators to manage student records, including adding, updating, deleting, and viewing student details.

Tech Stack

Backend: Spring Boot, Spring MVC, Spring Data JPA, Lombok, MySQL

Frontend: Thymeleaf, Bootstrap, HTML, CSS, JavaScript

Database: MySQL

Build Tool: Maven

Features

Add new students

Update student details

Delete student records

View list of students

Search functionality

Prerequisites

Java 17 or later

Maven

MySQL Server

Any IDE (IntelliJ IDEA, Eclipse, VS Code)

Installation & Setup

1. Clone the repository

git clone https://github.com/NaveenPudupeti/student-management-system.git
cd student-management-system

2. Configure the database

Create a MySQL database:

CREATE DATABASE student_management;

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/student_management
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

3. Build and run the application

mvn clean install
mvn spring-boot:run

4. Access the application

Open your browser and go to:

http://localhost:8080/students

API Endpoints (if applicable)

Method

Endpoint

Description

GET

/students

View all students

GET

/students/new

Add a new student

POST

/students

Save new student

GET

/students/edit/{id}

Edit student details

POST

/students/update/{id}

Update student details

GET

/students/delete/{id}

Delete student

License

This project is licensed under the MIT License.

Author
Pudupeti Naveen


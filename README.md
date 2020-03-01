# pay-day-bank
Pay day bank demo application

## Introduction
Pay day bank application purpose is to demonstrate interaction of modules based on top of microservice enviroment. This application 
is implemented according to given Agile user stories as requirements and consists following modules :
- Customer module
- Account module
- Transaction module
- Notification module

## Technology Stack
- Java 8
- Spring boot
- Spring Security
- Spring Netflix OSS
- In memory database, H2
- Swagger 2 specification 
- Lombook
- JWT Token
- RESTfull endpoints
- Docker
- Docker compose


## Microservice Design Architecture Diagram



## Environment
Application has 2 environments : Dev and Prod.
 - Dev environment uses localhost for connecting to Service Discovery
 - Prod environments configuration is different for Eureka Server. This enviorment is enabled only for docker containers. 
   Network bridge exists between microservices


## Build
1. Check out application from Github
2. Type mvnw clean package

## Run
 - In Dev environment  : you can run Main Class of each services 
 - In prod environment : run docker-compose.yml

## Test 
- Go to http://localhost:8080/swagger-ui.html 


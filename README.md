# 🔐 Spring Boot OAuth2 Login with Google and GitHub

This is a simple Spring Boot application that enables users to log in using **Google** or **GitHub** via OAuth2.

---

## 🚀 Features

- Login with **Google** and **GitHub**
- Uses **Spring Security** OAuth2 client support
- Secures client ID and secret using **environment variables**
- Easy-to-extend with additional providers
- Custom login buttons (optional)

---

## ⚙️ Technologies Used

- Java 17+
- Spring Boot (3.x)
- Spring Security
- OAuth2 Client
- Maven

---

 
---

## 🔐 Setting up Environment Variables

Before running the app, set the following environment variables:


# Google
export GOOGLE_CLIENT_ID=your-google-client-id
export GOOGLE_CLIENT_SECRET=your-google-client-secret

# GitHub
export GITHUB_CLIENT_ID=your-github-client-id
export GITHUB_CLIENT_SECRET=your-github-client-secret



##Configuration (application.properties)
spring.security.oauth2.client.registration.google.client-id=${GOOGLE_CLIENT_ID}
spring.security.oauth2.client.registration.google.client-secret=${GOOGLE_CLIENT_SECRET}

spring.security.oauth2.client.registration.github.client-id=${GITHUB_CLIENT_ID}
spring.security.oauth2.client.registration.github.client-secret=${GITHUB_CLIENT_SECRET}


##Run The App:
./mvnw spring-boot:run

##visit
http://localhost:8080









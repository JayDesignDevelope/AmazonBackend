# AmazonClone Backend - User Metadata Microservice

This repository contains the User Metadata microservice for the AmazonClone backend project. The microservice is built using Spring Boot and utilizes MySQL as the database.

## Table of Contents

- [Introduction](#introduction)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Configuration](#configuration)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Database Schema](#database-schema)
- [Contributing](#contributing)
- [License](#license)

## Introduction

AmazonClone is a full-stack e-commerce application designed to mimic some of the functionalities of Amazon. This repository represents the User Metadata microservice, which handles user-related data, such as user profiles, preferences, and other metadata.

The microservice is implemented using Spring Boot, which provides a robust and scalable framework for building microservices. MySQL is used as the database to store user metadata securely and efficiently.

## Getting Started

### Prerequisites

Before running the User Metadata microservice, ensure you have the following prerequisites installed on your system:

- Java Development Kit (JDK) 11 or higher
- MySQL database
- Apache Maven (for building and managing dependencies)

### Installation

1. Clone this repository to your local machine:


2. Build the microservice using Maven:


### Configuration

The User Metadata microservice requires some configuration settings to run correctly. You can find the configuration file at `src/main/resources/application.properties`. Modify the file according to your environment and database settings:

```properties
# Database configuration
spring.datasource.url=jdbc:mysql://localhost:3306/amazonclone
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password

# Server port
server.port=8080
```


### Configuration

The User Metadata microservice requires some configuration settings to run correctly. You can find the configuration file at `src/main/resources/application.properties`. Modify the file according to your environment and database settings:

```properties
# Database configuration
spring.datasource.url=jdbc:mysql://localhost:3306/amazonclone
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password

# Server port
server.port=8080
```

Make sure to replace `your_database_username` and `your_database_password` with your actual MySQL credentials.
Usage
To start the User Metadata microservice, run the following command:
```
mvn spring-boot:run
```

The microservice will start on the configured port (default is 8080). You can then access the microservice using the defined API endpoints.
API Endpoints
The User Metadata microservice provides various API endpoints to manage user metadata. Here are some of the essential endpoints:

- `GET /api/users/{userId}`: Get user metadata by user ID.
- `POST /api/users`: Create a new user profile.
- `PUT /api/users/{userId}`: Update user metadata for the specified user ID.
- `DELETE /api/users/{userId}`: Delete user metadata by user ID.

Note: This is a simplified list of endpoints. In an actual production application, you would have more endpoints and might need to implement security measures like authentication and authorization.
Database Schema
The User Metadata microservice uses the following database schema:
```
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    full_name VARCHAR(255),
    address VARCHAR(255),
    phone VARCHAR(20),
    ...
);
```

Note: The actual schema might be more extensive, including other tables or relationships, depending on the requirements of your application.
Contributing
Contributions to this project are welcome. If you have any bug fixes, improvements, or new features to add, please create a pull request.

Before contributing, please ensure that your code adheres to the project's coding standards and that you have tested it thoroughly.
License
This project is licensed under the MIT License - see the LICENSE file for details.
```

Now, the README content includes the API endpoints as requested. Feel free to save this content in a .md file in your project repository and customize it according to your project's specific details and requirements.
```



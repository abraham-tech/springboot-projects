# Todo Management API

## Overview
This is a **Spring Boot** project for managing a simple TODO application with CRUD operations.

## Features
- Create a new TODO item
- Retrieve a single TODO item by ID
- Retrieve all TODO items
- Update an existing TODO item
- Delete a TODO item
- Mark a TODO item as complete
- Mark a TODO item as incomplete

## Technologies Used
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Web** (RESTful API)
- **Lombok** (Boilerplate code reduction)
- **Maven** (Build tool)
- **H2 Database** (In-memory database for testing)
- **Postman** (For API testing)

## Project Structure
```
src/main/java/net/javaguides/todomanagement/
│── controller/       # REST Controllers
│── dto/              # Data Transfer Objects (DTOs)
│── service/          # Service layer
│── service/impl/     # Service implementation
│── repository/       # JPA Repositories
│── model/            # Entity models
│── config/           # Application configurations
```

## Endpoints

### 1. Create a TODO
```
POST /api/todos
```
**Request Body (JSON):**
```json
{
  "title": "Buy groceries",
  "description": "Milk, Bread, Eggs"
}
```
**Response:** `201 Created`

### 2. Get a TODO by ID
```
GET /api/todos/{id}
```
**Response:** `200 OK`

### 3. Get All TODOs
```
GET /api/todos
```
**Response:** `200 OK`

### 4. Update a TODO
```
PUT /api/todos/{id}
```
**Request Body (JSON):**
```json
{
  "title": "Go to the gym",
  "description": "Workout at 6 AM"
}
```
**Response:** `200 OK`

### 5. Delete a TODO
```
DELETE /api/todos/{id}
```
**Response:** `200 OK`

### 6. Mark as Complete
```
PATCH /api/todos/{id}/complete
```
**Response:** `200 OK`

### 7. Mark as Incomplete
```
PATCH /api/todos/{id}/in-complete
```
**Response:** `200 OK`

## Setup and Run
### Prerequisites
- **Java 17+** installed
- **Maven** installed

### Steps to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/todo-management.git
   cd todo-management
   ```
2. Build the project:
   ```sh
   mvn clean install
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## API Testing
Use **Postman** or **cURL** to test the endpoints. Example:
```sh
curl -X GET http://localhost:8080/api/todos
```

## License
This project is open-source and available under the MIT License.


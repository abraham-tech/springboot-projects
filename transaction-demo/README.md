# Transaction Demo

## Overview
This is a **Spring Boot** project that demonstrates a simple transaction management system. It allows users to place orders and process payments with transaction management.

## Features
- Place a new order
- Process payment for an order
- Transaction management to ensure data consistency

## Technologies Used
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA** (for data persistence)
- **Spring Web** (for RESTful API)
- **Lombok** (to reduce boilerplate code)
- **MySQL** (as the database)
- **Maven** (for project build and dependency management)


## Endpoints
### 1. Place an Order
- **URL:** `/api/v1/orders`
- **Method:** `POST`
- **Request Body:**
  ```json
  {
    "order": {
      "totalQuantity": 2,
      "totalPrice": 100.00,
      "shoppingCartId": 1
    },
    "payment": {
      "type": "DEBIT",
      "cardName": "John Doe",
      "cardNumber": "1234-5678-9012-3456",
      "expiryYear": 2025,
      "expiryMonth": 12,
      "cvc": 123
    }
  }

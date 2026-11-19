# Inventory Management System

A full-stack Inventory Management System built with Spring Boot, MySQL, and modern web technologies. This application enables businesses to efficiently manage inventory, track stock levels, and perform CRUD operations on products.

## Features

✅ Product Management

- Add new products
- Update existing products
- Delete products
- View all inventory items

✅ Inventory Tracking

- Monitor stock levels
- Track inventory changes
- Manage product information

✅ Database Integration

- MySQL 8.0 support
- JPA/Hibernate ORM
- Secure database connectivity

✅ REST API

- Spring Boot RESTful services
- CRUD endpoints
- JSON data exchange

✅ Frontend Interface

- Responsive user interface
- Easy inventory management
- User-friendly design

---

## Technologies Used

### Backend

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven

### Database

- MySQL 8.0

### Frontend

- HTML5
- CSS3
- JavaScript

### Tools

- IntelliJ IDEA
- Git
- GitHub
- Postman

---

## Project Structure

```text
InventoryManagementSystem
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   ├── resources/
│   │   └── static/
│   │
│   └── test/
│
├── pom.xml
├── README.md
└── .gitignore
```

## Installation

### Clone the Repository

```bash
git clone https://github.com/LesegoLKW/InventoryManagementSystem.git
```

### Navigate to the Project

```bash
cd InventoryManagementSystem
```

### Configure MySQL

Create a database:

```sql
CREATE DATABASE inventory_db;
```

Update your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=root
spring.datasource.password=your_password
```

### Run the Application

```bash
mvn spring-boot:run
```

Application URL:

```text
http://localhost:8080
```

---

## API Endpoints

| Method | Endpoint | Description |
|----------|----------|------------|
| GET | /api/products | Get all products |
| GET | /api/products/{id} | Get product by ID |
| POST | /api/products | Create product |
| PUT | /api/products/{id} | Update product |
| DELETE | /api/products/{id} | Delete product |

---

## Future Enhancements

- User Authentication and Authorization
- Dashboard Analytics
- Inventory Reports
- Barcode Scanning
- Supplier Management
- Purchase Orders
- Docker Deployment
- Cloud Hosting

---

## Author

**Lesego LKW**

GitHub: https://github.com/LesegoLKW

---

## License

This project is open-source and available under the MIT License.

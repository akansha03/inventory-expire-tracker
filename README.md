# Inventory Expire Tracker

A Java-based inventory management system that tracks product expiration dates and provides various inventory operations.

## Project Overview

This project is a simple inventory management system built in Java using Maven. It provides functionality to:
- Track products with their expiration dates
- Filter products that are expiring within a specified number of days
- Group products by warehouse zones and calculate total quantities
- Sort products by expiration date

## Project Structure

```
inventory-expire-tracker/
├── pom.xml                          # Maven configuration file
├── README.md                        # This file
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── firstProject/
│   │               ├── Product.java              # Product entity class
│   │               └── InventoryOperations.java  # Core business logic
│   └── test/
│       └── java/
│           └── com/
│               └── firstProject/
│                   └── InventoryOperationsTest.java  # Test class with sample data
```

## Core Components

### Product.java
The `Product` class represents an inventory item with the following attributes:
- `id`: Unique product identifier
- `name`: Product name
- `expiryDate`: Expiration date (LocalDateTime)
- `quantity`: Available quantity
- `wareHouseZone`: Warehouse zone where the product is stored

### InventoryOperations.java
Contains three main operations:

1. **filterExpiredProducts()**: Filters products that will expire within a specified number of days
2. **groupZoneProducts()**: Groups products by warehouse zone and calculates total quantities
3. **sortExpiryDate()**: Sorts products by expiration date in ascending order

## Features

### 1. Expiration Tracking
- Identifies products expiring within a specified timeframe
- Uses `ChronoUnit.DAYS` to calculate days until expiration
- Handles current date comparison with product expiry dates

### 2. Zone-based Grouping
- Groups products by warehouse zone
- Calculates total quantities per zone
- Handles empty/null zone values by assigning them to "Default" zone

### 3. Date Sorting
- Sorts products by expiration date in ascending order
- Uses Java 8 Stream API for efficient sorting
- Displays product name and expiry date

## Sample Data

The test class includes sample products with various characteristics:
- **Chocolates**: Expires in 5 days, Zone A, Quantity 10
- **Ice Creams**: Expires in 4 days, Zone B, Quantity 20
- **Flowers**: Expires in 3 days, Zone C, Quantity 30
- **Eggs**: Expires in 2 days, No zone, Quantity 40
- **Meat**: Expires in 5 days, No zone, Quantity 50
- **Snickers**: Expires in 6 days, Zone E, Quantity 60
- **Fruits**: Expires in 7 days, Zone F, Quantity 70
- **Vegetables**: Expires in 8 days, Zone G, Quantity 80
- **Salads**: Expires in 9 days, Zone H, Quantity 90
- **Smoothies**: Expires in 10 days, Zone A, Quantity 100

## Running the Project

### Prerequisites
- Java 21 or higher
- Maven 3.6 or higher

### Build the Project
```bash
mvn clean compile
```

### Run Tests
```bash
mvn test
```

### Run the Demo
```bash
mvn test-compile
java -cp "target/classes:target/test-classes" com.firstProject.InventoryOperationsTest
```

## Sample Output

When you run the test, you'll see output like:

```
Products Expired in 5 days are
Chocolates
Ice Creams
Meat

Group the products based on Zone and print the sum of quantities
A 110
B 20
C 30
E 60
F 70
G 80
H 90
Default 90

Products sorted in the ascending order of the Expired Date
Eggs - 2025-08-04T23:09:50.002310
Flowers - 2025-08-05T23:09:50.002307
Ice Creams - 2025-08-06T23:09:50.002299
Chocolates - 2025-08-07T23:09:50.002046
Meat - 2025-08-07T23:09:50.002313
...
```

## Technical Details

- **Java Version**: 21
- **Build Tool**: Maven
- **Key Libraries**: Java 8 Stream API, LocalDateTime, ChronoUnit
- **Package Structure**: `com.firstProject`

## Future Enhancements

Potential improvements for this project:
- Database integration for persistent storage
- REST API endpoints
- Web-based user interface
- Email notifications for expiring products
- Barcode scanning integration
- Advanced reporting features

## License

This is a simple educational project. Feel free to use and modify as needed.

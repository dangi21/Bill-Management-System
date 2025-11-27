#  Bill Management System

The **Bill Management System** is a Java desktop application built in NetBeans for a small grocery shop.  
It allows the shopkeeper to generate bills for customers, calculate totals automatically, and maintain item records in a MySQL database.  
This project replaces manual billing and ensures fast checkout and reliable record keeping.

---

##  Technologies Used
- **Java**
- **NetBeans IDE**
- **MySQL Database**
- **JDBC Connectivity**
- **Java Swing GUI**

---

##  Features
- Add, update, and manage grocery items  
- Automatic bill creation  
- Total calculation for each customer order  
- Store billing information in MySQL database  
- Maintain product records  
- Simple and user-friendly interface  

---

##  Project Structure (High-Level)


---

## How to Run the Project

### Import the Project in NetBeans
1. Open **NetBeans**
2. Click **File → Open Project**
3. Select the extracted project folder  
4. Wait for NetBeans to load all files

---

### Configure the MySQL Database
Since no `.sql` file is included, you must manually create the database.

1. Open **MySQL Workbench / phpMyAdmin**
2. Create a new database:
3. Create required tables, for example:
> These are recommended structures.  
> To match exactly with your code, check SQL queries inside the Java DB connection class.

---

### Configure Database Connectivity in Code
Inside your database connection class, ensure the credentials match your local MySQL server:

```java
String url = "jdbc:mysql://localhost:3306/bill_management";
String username = "root";
String password = "";
Table: items
  id INT PRIMARY KEY AUTO_INCREMENT
  name VARCHAR(100)
  price DOUBLE
  quantity INT

Table: bills
  id INT PRIMARY KEY AUTO_INCREMENT
  customer VARCHAR(100)
  date DATE
  total DOUBLE

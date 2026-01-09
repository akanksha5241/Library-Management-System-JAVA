# 📚 Library Management System

A **Java-based Library Management System** built using **Java Swing** and **MySQL**. This project helps manage books, authors, categories, publishers, and book issuing/returning in a simple desktop application.

---

## ✨ Features

* Add, update, delete **Books**
* Manage **Authors, Categories, Publishers**
* **Issue & Return Books**
* View available and issued books
* Database connectivity using JDBC
* Simple and user-friendly GUI (Java Swing)

---

## 🛠️ Tech Stack

* **Language:** Java
* **GUI:** Java Swing (NetBeans Forms)
* **Database:** MySQL
* **IDE:** NetBeans
* **JDBC:** MySQL Connector

---

## 📂 Project Structure

```
Library_Management_System/
│── src/Library/
│   ├── Book.java
│   ├── Author.java
│   ├── Category.java
│   ├── Publisher.java
│   ├── Issuebook.java
│   ├── DBConnection.java
│── build/
│── nbproject/
```

---

## ⚙️ Setup & Run Instructions

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/Library_Management_System.git
```

### 2️⃣ Open in NetBeans

* Open **NetBeans IDE**
* Click **File → Open Project**
* Select `Library_Management_System`

📌 Required Libraries (Important)

After opening the project in NetBeans, you must add the following 2 JAR files to the project libraries:

mysql-connector-java-8.0.11.jar
→ For MySQL database connectivity

jcalendar-1.4.jar
→ For Issue Date & Return Date picker

➕ Steps to Add JAR Files in NetBeans

open project Library_Management_System in apache netbeans

Go to Libraries -> click on right click -> Add JAR/Folder -> and then this above 2 files add in this libraries folder

Select:

mysql-connector-java-8.0.11.jar

jcalendar-1.4.jar

Click OK

✅ After this, both JAR files should appear under the Libraries folder of the project.


And also (jcalendar-1.4.jar) this jar files are add in the palette:

1. click on Swing Controls -> right click -> create new category -> and write your category name as your requirement -> ok
2. And your new category add in your in palette -> click on your category -> right click -> choose palette manager -> choose one more time your created category ->
3. click Add from JAR -> Choose this (jcalendar-1.4.jar) jar file -> next -> Ctrl+A -> next -> select your category -> Finish -> Close
4. Your can see your created category add the some field you can like i can upload the image as same you can display in your palette
5. <img width="202" height="74" alt="image" src="https://github.com/user-attachments/assets/ff27449e-7ceb-4aca-9d09-1b3758e8bff0" />



### 3️⃣ Database Setup

* Create a MySQL database (example: `library_db`)
* Import the required tables (books, authors, categories, issue_books, etc.)
* Update database details in `DBConnection.java`

```java
String url = "jdbc:mysql://localhost:3306/library_db";
String user = "root";
String password = "your_password";
```

### 4️⃣ Run the Project

* Right-click the project
* Click **Run** ▶️

---

## 🚀 Future Improvements

* Login & Role-based access (Admin/User)
* Search & filter options
* Fine calculation for late returns
* Export reports (PDF/Excel)

---

# 🌐 Dark Web Simulation Monitor

## 📌 Project Overview

The **Dark Web Simulation Monitor** is a web-based application designed to simulate anonymous user activity and allow an administrator to monitor actions in real time.

This project demonstrates concepts of:

* Java Servlets
* JSP
* MySQL Database
* Session Management
* Role-Based Access Control (RBAC)

---

## 🧩 Project Structure

```
DarkWebSimulation/
 ├── src/main/java/
 │    ├── model/        # Data classes
 │    ├── dao/          # Database connection
 │    └── servlet/      # Controllers (LoginServlet)
 │
 ├── src/main/webapp/
 │    ├── index.jsp
 │    ├── hiddenPage.jsp
 │    ├── adminDashboard.jsp
 │    └── WEB-INF/
 │         └── lib/ (MySQL connector)
 │
 ├── darkweb_sim.sql    # Database setup file
 └── README.md
```

---

## ⚙️ Technologies Used

* Java (Servlets & JSP)
* Apache Tomcat
* MySQL
* HTML/CSS
* Git & GitHub

---

## 🧪 Setup Instructions

### 1️⃣ Clone the Repository

```
git clone https://github.com/kotankartaran/DarkWebSimulation.git
```

---

### 2️⃣ Import into Eclipse

* Open Eclipse
* Go to:
  `File → Import → Existing Projects into Workspace`
* Select the project folder

---

### 3️⃣ Setup Database

1. Open MySQL Workbench
2. Open the file:

   ```
   darkweb_sim.sql
   ```
3. Run the script

---

### 4️⃣ Configure Database Connection

Open:

```
DBConnection.java
```

Update your MySQL password:

```java
private static final String PASSWORD = "your_password";
```

---

### 5️⃣ Add Server (Tomcat)

* Right-click project → Run As → Run on Server
* Choose Apache Tomcat

---

### 6️⃣ Run the Project

Open browser:

```
http://localhost:8080/DarkWebSimulation/index.jsp
```

---

## 👤 Features

### 👥 User

* Anonymous login
* Access hidden page
* (Future) Post messages

### 🛠 Admin

* Login as admin
* (Future) View real-time activity dashboard

---

## 🔐 Role-Based Access

* **User** → Limited access
* **Admin** → Full monitoring access

---

## 📊 Database Tables

* `users` → Stores anonymous users
* `messages` → Stores user messages
* `activities` → Logs user actions

---

## 🚀 Current Status

✅ Category 1 Completed:

* Database setup
* Backend logic
* Login system
* Session handling

🔄 Category 2 (Frontend) – In Progress

---

## 👨‍💻 Contributors

* Taran Kotankar (Backend - Category 1)

---

## 📌 Notes

* Make sure MySQL server is running
* Ensure correct DB credentials
* MySQL Connector is included in project

---

## ⭐ Future Enhancements

* Real-time admin dashboard (AJAX)
* Message posting system
* Activity tracking system
* UI improvements

---

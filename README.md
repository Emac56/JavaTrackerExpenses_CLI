🏠 Household Expense Tracker

A Java Console Application for managing and tracking household expenses.

This project follows a layered architecture inspired by backend development concepts commonly used in frameworks such as Spring Boot. Expense data is stored locally using a TXT file database.

---

✨ Features

- Add New Expenses
- View All Expenses
- Dynamic Category Totals
- Grand Total Calculation
- Auto Generated Expense ID
- Auto Generated Date & Time
- Exit Confirmation Validation
- File-Based Storage (TXT Database)
- Layered Architecture

---

🏗 Architecture

UI
 ↓
Actions
 ↓
Controller
 ↓
Repository
 ↓
TXT Database

---

📁 Project Structure

com.demo
│
├── Controller
│   └── ExpensesController
│
├── Model
│   └── ExpensesModel
│
├── Repository
│   └── ExpensesRepository
│
├── UI
│   ├── MainUI
│   ├── AddExpensesUI
│   ├── ViewExpensesUI
│   └── TotalExpensesUI
│
├── UI.Actions
│   ├── MainUIAction
│   ├── ViewExpensesAction
│   └── TotalExpensesAction
│
├── Validations
│   └── ExitValidation
│
└── Utils
    └── ConsoleUtil

---

💾 Data Storage

Expenses are stored inside:

src/main/resources/Data/expenses.txt

Example:

1,Rice,Food,250.0,2026-06-24T04:30:00
2,Internet,Bills,999.0,2026-06-24T04:35:00

---

🛠 Technologies Used

- Java
- J Studio - Android Application
- Object-Oriented Programming (OOP)
- File Handling
- LocalDateTime
- ArrayList
- HashMap
- Console-Based UI

---

📋 Current Status

Feature| Status
Add Expense| ✅
View Expenses| ✅
Dynamic Category Totals| ✅
Grand Total Calculation| ✅
Auto ID Generation| ✅
Auto Date Generation| ✅
Exit Validation| ✅
TXT Database Storage| ✅
Search Expense| ⏳
Update Expense| ⏳
Delete Expense| ⏳

---

🎯 Learning Objectives

This project was created to practice:

- Java Fundamentals
- OOP Principles
- File Handling
- Collections Framework
- Layered Architecture
- MVC Concepts
- Backend Development Foundations

---

🚀 Planned Features (V2)

- Search Expense
- Update Expense
- Delete Expense
- Better Input Validation
- Category Reports
- Monthly Reports
- MySQL Integration
- Spring Boot Migration

---

👨‍💻 Author

Emac Vicente

BSIT Student

Java Console Application Projectt

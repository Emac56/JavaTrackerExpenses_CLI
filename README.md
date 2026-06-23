# 🏠 Household Expense Tracker

A Java Console Application for managing and tracking household expenses.

This project was built to practice Java fundamentals, Object-Oriented Programming (OOP), file handling, and layered architecture concepts commonly used in backend development frameworks such as Spring Boot.

---

## ✨ Features

- ✅ Add New Expenses
- ✅ View All Expenses
- ✅ Dynamic Category Totals
- ✅ Grand Total Calculation
- ✅ Auto Generated Expense ID
- ✅ Auto Generated Date & Time
- ✅ Exit Confirmation Validation
- ✅ File-Based Storage (TXT Database)
- ✅ Layered Architecture

---

## 🏗 Architecture

```text
UI
 ↓
Actions
 ↓
Controller
 ↓
Repository
 ↓
TXT Database
```

---

## 📁 Project Structure

```text
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
```

---

## 💾 Data Storage

Expenses are stored locally inside:

```text
src/main/resources/Data/expenses.txt
```

Example:

```text
1,Rice,Food,250.0,2026-06-24T04:30:00
2,Internet,Bills,999.0,2026-06-24T04:35:00
3,Transportation,Transport,120.0,2026-06-24T04:40:00
```

---

## 🛠 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- File Handling
- LocalDateTime API
- ArrayList
- HashMap
- Gradle (Groovy DSL)
- Console-Based User Interface

---

## 📋 Current Status

| Feature | Status |
|----------|----------|
| Add Expense | ✅ |
| View Expenses | ✅ |
| Dynamic Category Totals | ✅ |
| Grand Total Calculation | ✅ |
| Auto ID Generation | ✅ |
| Auto Date Generation | ✅ |
| Exit Validation | ✅ |
| TXT Database Storage | ✅ |
| Search Expense | ⏳ Planned |
| Update Expense | ⏳ Planned |
| Delete Expense | ⏳ Planned |

---

## 📱 Running on Android

### Requirements

- J Studio
- Java 17+
- Gradle

### Setup

1. Download and install J Studio from the Play Store.
2. Clone or download this repository.
3. Open the project in J Studio.
4. Wait for Gradle sync to finish.
5. Run the application.

---

## 🎯 Learning Objectives

This project was created to practice:

- Java Fundamentals
- Object-Oriented Programming
- File Handling
- Collections Framework
- Layered Architecture
- MVC Concepts
- Backend Development Foundations

---

## 🚀 Planned Features (V2)

- 🔍 Search Expenses
- ✏️ Update Expenses
- 🗑 Delete Expenses
- ✅ Better Input Validation
- 📊 Category Reports
- 📅 Monthly Reports
- 🗄 MySQL Integration
- 🌱 Spring Boot Migration

---

## 👨‍💻 Author

**Emac Vicente**

BSIT Student

Java Console Application Project
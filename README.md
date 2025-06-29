# 🌱 DeepSkilling JavaFSE
# 🥇 Week 1: Engineering Concepts

## 📚 Table of Contents

1. Design Patterns – Principles in Practice
2. Data Structures & Algorithms – Thinking in Code
3. PL/SQL: Control Structures, Error Handling, Procedures, Functions, Triggers, Cursors, Packages
4. JUnit, Mockito, and SLF4J - Java Testing & Logging Demo


---
## 💡 Engineering Concepts

## 🎨 Design Patterns – Principles in Practice

Design patterns are the secret sauce of clean, modular, and scalable code. Think of them as *battle-tested strategies* to solve recurring problems in software architecture.

### 🔒 Singleton Pattern
Only one instance — that’s the rule! Singleton ensures a class has only one global point of access. It’s great when you need a single resource manager, configuration manager, or logger. You avoid unnecessary memory usage and maintain consistent data across your app.

### 🏭 Factory Pattern
This pattern hides object creation logic behind a method. Why? Because not every client needs to know *how* to build — it just needs the product. Factories centralize the construction process, making your code easier to maintain and extend.

### 🧱 Builder Pattern
When an object is too complex to be created in one step, the Builder breaks it into bite-sized steps. It separates the construction from the representation, making code cleaner when building objects with many parameters — like constructing a customizable meal!

### 🔌 Adapter Pattern
Ever tried plugging a three-pin cable into a two-hole socket? Adapter is your universal converter. It helps incompatible interfaces work together without changing their source code, bridging old systems with new implementations seamlessly.

### ✨ Decorator Pattern
Need new features *without* modifying existing code? Decorator is your go-to. It wraps objects with new capabilities dynamically — perfect for when extension is better than alteration, like adding layers to a cake without changing the base.

### 🕵️ Proxy Pattern
Think of it as a gatekeeper. The Proxy acts on behalf of another object, controlling access, adding security, or even lazy-loading data. Useful in real-world cases like virtual proxies (for image loading) or protection proxies (for access control).

### 📢 Observer Pattern
When one change needs to ripple across multiple components — Observer does the magic. It maintains a “subscription” list. When the state changes, all subscribers are updated automatically. A real-world analogy: a news channel sending alerts to subscribed users.

### 🎯 Strategy Pattern
Strategy Pattern is a behavioral design pattern that allows to define a family of algorithms, put each of them in a separate class, and make their objects interchangeable.

### 🕹️ Command Pattern
The Command Pattern encapsulates a request as an object, allowing you to parameterize clients with different requests, queue or log requests, and support undoable operations.
It separates the sender (Invoker) from the receiver (Device).

### 🧠 MVC Pattern 

The **MVC (Model-View-Controller)** pattern separates application logic into 3 components:
- **Model**: Manages data (e.g., Student info)
- **View**: Displays data (e.g., student details)
- **Controller**: Handles input and updates model/view

### 🔧 Dependency Injection

Dependency Injection (DI) is a design principle where a class receives its required objects, or dependencies, from an external source rather than creating them internally. This approach helps achieve loose coupling between classes and makes the application easier to test and maintain.

---

## 🧮 Data Structures & Algorithms – Thinking in Code

### 🔍 Linear Search
The simplest way to search — go one by one! It’s ideal for small or unsorted collections, though not the most efficient for larger datasets.

- **Time Complexity:** O(n)  
> 🗣️ “You check every item one by one — like flipping through every page to find a name in an unsorted notebook.”

### ✂️ Binary Search
Fast and focused. It divides sorted data in half repeatedly to find the target. Like finding a word in a dictionary — way quicker than scanning page by page.

- **Time Complexity:** O(log n)  
> 🗣️ “You skip half the data every time — like using a dictionary: you don’t start from page one, you jump to the middle and narrow it down smartly.”  
⚠️ Only works if the data is sorted!

### 🫧 Bubble Sort
This basic sorting algorithm compares and swaps adjacent elements until the list is sorted. Not the fastest, but helps visualize how sorting algorithms work.

- **Time Complexity:** O(n²)  
> 🗣️ “You keep comparing and swapping neighbors until everything is in order — like sorting books on a shelf by constantly shuffling them left and right.”  
🐌 Slow for large data sets

### ⚡ Quick Sort
Divide and conquer! Quick Sort selects a pivot and partitions the array into smaller subproblems. It’s fast and widely used in real-world sorting problems.

- **Time Complexity:**  
  - Best & Average Case: O(n log n)  
  - Worst Case: O(n²) (when the pivot is poorly chosen)  
> 🗣️ “You divide, conquer, and sort chunks recursively — like organizing messy drawers by first picking a ‘middle’ item and sorting around it.”

### 🔁 Recursion
When a method solves a problem by calling itself with smaller inputs — that’s recursion. It’s elegant, expressive, and powers algorithms like tree traversals and backtracking.

---

## 🗂️ Data Structures Practiced

- **Arrays** – *Basic but powerful for index-based data storage.*
- **Singly Linked List** – *Linear, dynamic memory structure ideal for frequent insertions and deletions.*
- **Java Object Arrays** – *Used in practical cases like searching books by title or author.*

---

## 💾 PL/SQL Concepts Covered

**Overview:** PL/SQL is Oracle's procedural extension to SQL. It supports logical programming with structures like conditions, loops, procedures, and more.

### ✅ Control Structures:
- Enable conditional execution and looping.
- They include IF-THEN, CASE, WHILE, FOR, and LOOP statements to guide flow.

### ⚠️ Error Handling:
-  Allows graceful recovery from errors.
-  Use EXCEPTION blocks to catch and handle issues like invalid data or division by zero.

### 🧩 Stored Procedures:
- Blocks of SQL code that perform specific tasks.
- They can accept inputs and perform actions such as updates or calculations without returning values.

### 🧮 Functions: 
- Similar to procedures but must return a single value.
- Often used for computations like totals, age, or balance checks, and can be embedded in SQL queries.

### 🚨 Triggers:
- Automatically execute in response to database changes.
- Example: updating a timestamp after a record is modified or logging inserts.

### 🔁 Cursors: 
- Used to handle query result sets row-by-row.
- Helpful when you need to iterate through multiple rows and apply logic to each.

### 📦 Packages: 
- Containers for logically related procedures, functions, and variables.
- Improves code organization and reuse; has a declaration (spec) and implementation (body). Group related procedures/functions into a reusable module.

---

## JUnit, Mockito, and SLF4J - Java Testing & Logging Demo

This project demonstrates the use of **JUnit**, **Mockito**, and **SLF4J** in a Java application. These tools are essential for testing and logging in modern Java development.

---

### What is JUnit?

**JUnit** is a widely-used testing framework in Java. It allows developers to:

- Write and run **unit tests** to validate individual methods or components.
- Automatically test functionality during development.
- Use assertions to check expected vs actual results.
- Identify bugs early by running test cases frequently.

We are using **JUnit 5 (a.k.a. Jupiter)** which offers more powerful features compared to older versions.

---

### 🧪 What is Mockito?

**Mockito** is a mocking framework used in unit testing to:

- **Create mock objects** for dependencies (like databases, APIs, etc.)
- Simulate the behavior of real objects without executing actual logic.
- Focus on testing only the component under test (not its dependencies).
- Verify method calls and inputs during testing.

Mockito helps in **isolated and fast testing** of service logic.

---

### 📝 What is SLF4J?

**SLF4J** (Simple Logging Facade for Java) is a logging abstraction that:

- Provides a **common interface** for various logging frameworks like Logback, Log4j, etc.
- Allows switching between logging implementations without changing the actual code.
- Encourages structured and consistent logging across the application.

In this project, SLF4J is used with the **Logback** backend for actual log output.

---

### 🔄 How They Work Together

- **JUnit** is used to test your Java classes and methods.
- **Mockito** is used to mock external dependencies within your JUnit test cases.
- **SLF4J** is used to add logs to both production and test code for easier debugging and traceability.

---

### 📦 Tools & Technologies

- **Java** (JDK 17+ recommended)
- **Maven** (for dependency management)
- **JUnit 5** (testing framework)
- **Mockito** (mocking library)
- **SLF4J + Logback** (logging)

---

### 📁 How to Use

1. Clone or download the project.
2. Open it in IntelliJ IDEA, Eclipse, or any Java IDE.
3. Build the project using Maven.
4. Run test cases using Maven or your IDE’s test runner.
5. Check the console for logs generated by SLF4J.

---



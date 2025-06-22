# 🌱 DeepSkilling JavaFSE – Week 1: Engineering Concepts

## 📚 Table of Contents

- [Design Patterns – Principles in Practice](#-design-patterns--principles-in-practice)
- [Data Structures & Algorithms – Thinking in Code](#-data-structures--algorithms--thinking-in-code)
- [Data Structures Practiced](#-data-structures-practiced)


---
## 💡 Engineering Concepts

## 🎯 Design Patterns – Principles in Practice

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

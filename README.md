# Programming-in-Java---Evaluated-Project
# 📚 Library Management System

A simple **Java-based Library Management System** developed using basic Java programming concepts. The program allows users to select a book domain, view available books, request a book, and receive information about its issue status and return period.

This project is designed as a **beginner-friendly Java project** to demonstrate the use of arrays, conditional statements, loops, user input, and string comparison.

---

## 🎯 Project Objective

The main objective of this project is to create a simple library system where a user can:

* View available book domains
* Select a specific domain
* View books belonging to that domain
* Enter the name of a book they want to issue
* Check whether the requested book is available
* Receive information about the book issue
* Understand the 15-day return period
* Exit the program when required

---

## 🛠️ Technologies Used

* **Programming Language:** Java
* **Input Handling:** `Scanner`
* **Data Storage:** Java Arrays
* **IDE:** Any Java-supported IDE
* **Execution:** Java JDK

---

## 📂 Project Structure

```text
Library-Management-System/
│
├── Library.java
└── README.md
```

---

## 📖 Books Available

The system contains the following books:

| Book                       | Domain      |
| -------------------------- | ----------- |
| Basics of Java Programming | Programming |
| Python fun                 | Programming |
| Data Structures            | Programming |
| Machine Learning           | AI          |
| Artificial Intelligence    | AI          |
| Database Management        | Database    |

---

## 🗂️ Book Domains

The program provides three book domains:

### 1. Programming

Includes:

* Basics of Java Programming
* Python fun
* Data Structures

### 2. AI

Includes:

* Machine Learning
* Artificial Intelligence

### 3. Database

Includes:

* Database Management

---

## ⚙️ How the Program Works

The program follows a simple menu-driven approach.

```text
Start
  │
  ▼
Welcome Message
  │
  ▼
Choose an Option
  │
  ├── 1. Books Domain
  │       │
  │       ▼
  │   Select Book Domain
  │       │
  │       ├── Programming
  │       ├── AI
  │       └── Database
  │       │
  │       ▼
  │   Enter Book Name
  │       │
  │       ▼
  │   Check Book
  │       │
  │       ├── Available
  │       └── Not Available
  │
  ├── 2. Other Files
  │       │
  │       ▼
  │   Not Available Message
  │
  └── 3. Exit
          │
          ▼
         End
```

---

## 💻 Main Features

### 1. Welcome Message

When the program starts, it displays:

```text
Hello! Welcome to the Library
```

---

### 2. Main Menu

The user is given three options:

```text
1. Books Domain
2. Other Files
3. Exit
```

The user can select an option by entering its corresponding number.

---

### 3. Book Domain Selection

If the user selects **Books Domain**, the program displays:

```text
BOOK DOMAINS

1. Programming
2. AI
3. Database
```

The user can select one of the available domains.

---

### 4. Book Selection

After selecting a domain, the user can enter the name of the book they want to issue.

For example:

```text
Enter the book you want to issue:
Python fun
```

The program checks the entered book name and displays its status.

---

### 5. Issue Period

The program informs the user that the book should be returned within **15 days**.

Example:

```text
Book is issued, return time is 15 Days, return it on time!!
```

---

### 6. Other Files

If the user selects:

```text
2. Other Files
```

the program currently displays:

```text
Not Available this time !!
```

This option can be expanded in the future to support PDFs, notes, documents, or other educational files.

---

## 🧠 Java Concepts Used

This project demonstrates several fundamental Java concepts.

### Arrays

Two arrays are used to store book names and their domains:

```java
String[] books = {
    "Basics of Java Programming",
    "Python fun",
    "Data Structures",
    "Machine Learning",
    "Artificial Intelligence",
    "Database Management"
};
```

and:

```java
String[] domain = {
    "Programming",
    "Programming",
    "Programming",
    "AI",
    "AI",
    "Database"
};
```

### Scanner

The `Scanner` class is used to take input from the user:

```java
Scanner sc = new Scanner(System.in);
```

### Infinite Loop

The main menu runs continuously using:

```java
for (;;) {
    ...
}
```

### Conditional Statements

`if`, `else if`, and `else` statements are used to process user choices and book requests.

Example:

```java
if (choice == 1) {
    ...
}
else {
    ...
}
```

### String Comparison

The program uses `.equals()` to compare the book entered by the user:

```java
if (book.equals("Python fun")) {
    System.out.println("Python fun is available, (issued)");
}
```

---

## ▶️ How to Run the Project

### Step 1: Install Java

Make sure the **Java Development Kit (JDK)** is installed on your computer.

Check your Java installation using:

```bash
java -version
```

---

### Step 2: Save the Code

Save the Java source code as:

```text
Library.java
```

The filename should match the public class name:

```java
public class Library
```

---

### Step 3: Compile the Program

Open the terminal in the project directory and run:

```bash
javac Library.java
```

---

### Step 4: Run the Program

After successful compilation, run:

```bash
java Library
```

---

## 🖥️ Sample Output

```text
Hello! Welcome to the Library

Do you want Books or Other Files?
1. Books Domain
2. Other Files
3. Exit

Enter your choice:
1

BOOK DOMAINS
1. Programming
2. AI
3. Database

Enter domainchoice:
2

We Have - Machine Learning (Not issued),
Artificial Intelligence (Not issued)

Enter the book you want to issue:
Machine Learning

Machine Learning is available, (issued)

Book is issued, return time is 15 Days, return it on time!!
```

---



## 🚀 Future Enhancements

The project can be improved by adding:

* 👤 User registration and login
* 📚 Dynamic book availability
* 🔄 Book return functionality
* ⏰ Overdue book detection
* 📄 Support for PDFs and other files
* 🌐 Web-based library interface
* 👨‍💼 Admin panel for managing books
* 💾 Permanent storage of user and book information

---

## 🎓 Learning Outcomes

By completing this project, students can gain practical understanding of:

* Java syntax and program structure
* Arrays
* Loops
* Conditional statements
* User input using `Scanner`
* String comparison
* Menu-driven programs
* Basic problem-solving
* Designing simple real-world applications

---

## 📌 Project Type

**Academic / Student Project**

**Category:** Java Programming / Library Management

**Level:** Beginner

---

## 👨‍💻 Author

**Aryan Srivastava**

B.Tech – Artificial Intelligence & Machine Learning

---

## 📜 License

This project is created for **educational and academic purposes**. You are free to modify and improve the project for learning.

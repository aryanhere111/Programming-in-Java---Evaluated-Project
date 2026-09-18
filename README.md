#  Library Management System

A simple **console-based Library Management System** developed in **Java** using basic programming concepts such as arrays, loops, conditional statements, and user input with `Scanner`.

The project allows a user to register with a username and password, log in, select a book domain, and issue available books.

---

##  Features

*  User registration
*  Username and password login
*  Book domain selection
*  Programming books
*  AI books
*  Database books
*  Book availability display
*  Book issuing system
*  15-day return period message
*  Continuous library menu
*  Exit option can be added/extended

---

##  Technologies Used

* **Java**
* **Java Scanner Class**
* **Arrays**
* **If-Else Statements**
* **For Loop**
* **String Handling**
* **Console / Command-Line Interface**

---

##  Project Structure

```text
Library-Management-System/
│
├── Library.java
└── README.md
```

---

##  Available Books

The system currently contains the following books:

| Book                       | Domain      | Status     |
| -------------------------- | ----------- | ---------- |
| Basics of Java Programming | Programming | Not Issued |
| Python fun                 | Programming | Not Issued |
| Data Structures            | Programming | Issued     |
| Machine Learning           | AI          | Not Issued |
| Artificial Intelligence    | AI          | Not Issued |
| Database Management        | Database    | Issued     |

---

##  How the Login System Works

When the program starts, the user creates a username and password.

```text
WELCOME TO LIBRARY SYSTEM

Create Username: Aryan
Create Password: 12345

Registration Successful!

LOGIN

Enter Username: Aryan
Enter Password: 12345

Login Successful!
Hello Aryan! Welcome to the Library.
```

The program then compares the entered login details with the username and password created during the current execution.

> **Note:** The current version does not permanently save the username and password. They are stored only while the program is running.

---

##  How to Use the Library
After successful login, the user can select:

```text
Do you want Books or Other Files?

1. Books Domain
2. Other Files
3. Exit
```

Selecting **Books Domain** opens the available categories:

```text
BOOK DOMAINS

1. Programming
2. AI
3. Database
```

The user can then enter the name of the book they want to issue.

For example:

```text
Enter the book you want to issue: Machine Learning

Machine Learning is available, (issued)

Book is issued, return time is 15 Days, return it on time!!
```

---

##  How to Run

### 1. Install Java

Make sure Java is installed on your computer.

Check the Java version using:

```bash
java --version
```

You should also have the Java compiler:

```bash
javac --version
```

### 2. Save the Code

Save the program as:

```text
Library.java
```

The filename must match the public class name:

```java
public class Library
```

### 3. Compile the Program

Open a terminal in the project folder and run:

```bash
javac Library.java
```

### 4. Run the Program

```bash
java Library
```

---

##  Concepts Demonstrated

This project demonstrates several fundamental Java concepts.

### 1. Arrays

Two arrays are used to store book information:

```java
String[] books
```

and:

```java
String[] domain
```

The `books` array stores book names, while the `domain` array stores their corresponding categories.

### 2. Scanner

The `Scanner` class is used to take input from the user:

```java
Scanner sc = new Scanner(System.in);
```

### 3. Conditional Statements

`if`, `else if`, and `else` are used to process user choices and check book names.

### 4. Infinite Loop

The library menu uses:

```java
for (;;) {
```

This keeps the library system running until an appropriate exit condition is added.

### 5. String Comparison

The program checks user input using:

```java
book.equals("Machine Learning")
```

---

##  Basic Program Flow

```text
        START
          │
          ▼
   Welcome Message
          │
          ▼
 Create Username &
     Password
          │
          ▼
        LOGIN
          │
     ┌────┴────┐
     │         │
  Correct    Incorrect
     │         │
     ▼         ▼
Library      Exit
 Menu
     │
     ▼
Select Book Domain
     │
     ▼
Display Available Books
     │
     ▼
Enter Book Name
     │
     ▼
Check Availability
     │
 ┌───┴────┐
 │        │
Available Not Available
 │        │
 ▼        ▼
Issue     Return to
Book      Main Menu
 │
 ▼
15-Day Return Period
```

---


---

##  Learning Objective

The main objective of this project is to understand and implement fundamental **Java programming concepts** by developing a practical console-based application.

Through this project, we learn how to work with:

* User input
* Variables
* Strings
* Arrays
* Conditional statements
* Loops
* Basic authentication
* Console-based application design

---

##  Project Type

**Console-Based Java Project**

**Difficulty:** Beginner

**Language:** Java

**Application Area:** Library Management

---

##  Conclusion

The Library Management System is a beginner-friendly Java project that demonstrates how basic programming concepts can be combined to create a practical application.

The current version provides user registration, login, book-domain selection, book availability checking, and a basic book-issuing process. The project can be further improved by adding permanent user storage, real-time book availability, return-date management, and database support.

---


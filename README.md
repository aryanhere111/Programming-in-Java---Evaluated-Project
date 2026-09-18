#  Library Management System

A simple **console-based Library Management System** developed in **Java** using basic programming concepts such as arrays, loops, conditional statements, and user input with `Scanner`.

The project allows a user to register with a username and password, log in, select a book domain, and issue available books.

flowchart TD

subgraph group_authentication["Authentication"]
  node_registration["User Registration<br/>[code.java]"]
  node_session_credentials["Session Credentials<br/>[code.java]"]
  node_login["Login Check<br/>[code.java]"]
end

subgraph group_library_flow["Library Flow"]
  node_library_main["Library Main<br/>[code.java]"]
  node_menu_loop["Library Menu Loop<br/>[code.java]"]
  node_domain_selection["Domain Selection<br/>[code.java]"]
  node_other_files["Other Files Branch<br/>[code.java]"]
  node_exit_choice["Exit Choice<br/>[code.java]"]
end

subgraph group_book_data["Book Data"]
  node_catalog_arrays["Catalog Arrays<br/>[code.java]"]
  node_programming_books["Programming Books<br/>[code.java]"]
  node_ai_books["AI Books<br/>[code.java]"]
  node_database_books["Database Books<br/>[code.java]"]
  node_issue_check["Issue Check<br/>[code.java]"]
  node_return_notice["Return Notice<br/>[code.java]"]
end

node_user(("Library User"))

node_user -->|"provides input"| node_library_main
node_library_main -->|"starts registration"| node_registration
node_registration -->|"stores credentials"| node_session_credentials
node_library_main -->|"starts login"| node_login
node_login -->|"reads credentials"| node_session_credentials
node_library_main -->|"enters menu"| node_menu_loop
node_library_main -->|"initializes catalog"| node_catalog_arrays
node_menu_loop -->|"dispatches books"| node_domain_selection
node_menu_loop -->|"selects branch"| node_other_files
node_menu_loop -->|"offers choice"| node_exit_choice
node_domain_selection -->|"selects category"| node_programming_books
node_domain_selection -->|"selects category"| node_ai_books
node_domain_selection -->|"selects category"| node_database_books
node_domain_selection -->|"continues issuing"| node_issue_check
node_issue_check -->|"prints deadline"| node_return_notice

click node_library_main "https://github.com/aryanhere111/programming-in-java---evaluated-project/blob/main/code.java"
click node_registration "https://github.com/aryanhere111/programming-in-java---evaluated-project/blob/main/code.java"
click node_session_credentials "https://github.com/aryanhere111/programming-in-java---evaluated-project/blob/main/code.java"
click node_login "https://github.com/aryanhere111/programming-in-java---evaluated-project/blob/main/code.java"
click node_menu_loop "https://github.com/aryanhere111/programming-in-java---evaluated-project/blob/main/code.java"
click node_domain_selection "https://github.com/aryanhere111/programming-in-java---evaluated-project/blob/main/code.java"
click node_other_files "https://github.com/aryanhere111/programming-in-java---evaluated-project/blob/main/code.java"
click node_exit_choice "https://github.com/aryanhere111/programming-in-java---evaluated-project/blob/main/code.java"
click node_catalog_arrays "https://github.com/aryanhere111/programming-in-java---evaluated-project/blob/main/code.java"
click node_programming_books "https://github.com/aryanhere111/programming-in-java---evaluated-project/blob/main/code.java"
click node_ai_books "https://github.com/aryanhere111/programming-in-java---evaluated-project/blob/main/code.java"
click node_database_books "https://github.com/aryanhere111/programming-in-java---evaluated-project/blob/main/code.java"
click node_issue_check "https://github.com/aryanhere111/programming-in-java---evaluated-project/blob/main/code.java"
click node_return_notice "https://github.com/aryanhere111/programming-in-java---evaluated-project/blob/main/code.java"

classDef toneNeutral fill:#f8fafc,stroke:#334155,stroke-width:1.5px,color:#0f172a
classDef toneBlue fill:#dbeafe,stroke:#2563eb,stroke-width:1.5px,color:#172554
classDef toneAmber fill:#fef3c7,stroke:#d97706,stroke-width:1.5px,color:#78350f
classDef toneMint fill:#dcfce7,stroke:#16a34a,stroke-width:1.5px,color:#14532d
classDef toneRose fill:#ffe4e6,stroke:#e11d48,stroke-width:1.5px,color:#881337
classDef toneIndigo fill:#e0e7ff,stroke:#4f46e5,stroke-width:1.5px,color:#312e81
classDef toneTeal fill:#ccfbf1,stroke:#0f766e,stroke-width:1.5px,color:#134e4a
class node_registration,node_session_credentials,node_login,node_user toneBlue
class node_library_main,node_menu_loop,node_domain_selection,node_other_files,node_exit_choice toneAmber
class node_catalog_arrays,node_programming_books,node_ai_books,node_database_books,node_issue_check,node_return_notice toneMint




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


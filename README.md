# EI Exercises — Design Patterns & Virtual Classroom Manager

This repository contains two exercises demonstrating **design patterns** and a **real-world command-line application**.

---

# 📘 Exercise 1 — Design Patterns (6 Patterns)

This exercise showcases six canonical design patterns, grouped by category.

## 1. Creational Patterns
### 1.1 Singleton
- Ensures a single instance of a class.  
- **Use Case:** `Clipboard` — manages copy/paste operations.

### 1.2 Factory Method
- Creates objects without exposing the instantiation logic.  
- **Use Case:** `FileFactory` — produces `PdfFile`, `DocxFile`, or `TxtFile` exporters.

---

## 2. Behavioral Patterns
### 2.1 Observer
- One-to-many dependency between objects.  
- **Use Case:** `RideRequestSubject` notifies multiple `Driver` observers.

### 2.2 Strategy
- Encapsulates interchangeable algorithms.  
- **Use Case:** `VideoPlayer` switches playback quality at runtime.

---

## 3. Structural Patterns
### 3.1 Adapter
- Converts one interface into another for compatibility.  
- **Use Case:** `AttendanceAdapter` bridges old Present/Absent system with new biometric 1/0 system.

### 3.2 Decorator
- Dynamically adds responsibilities to objects.  
- **Use Case:** `BaseExam` extended with decorators for `TimeLimit`, `Proctoring`, and `NegativeMarking`.

---

## ▶️ Running Exercise 1
Each pattern folder contains its own `Main.java`. Example:

```bash
javac Main.java
java Main
```

---

# 🏫 Exercise 2 — Virtual Classroom Manager (VCM)

A **command-line tool** to manage virtual classrooms with **students, assignments, attendance, analytics, and persistence**.

## 🎯 Why This Project?

- This project focuses on enhancing digital learning by simplifying classroom management.  
- It tackles real-world educational challenges like organizing students, assignments, and attendance, while providing a reliable, scalable, and practical system.  
- By applying design patterns in a functional application, it bridges theory with real-world impact, showcasing how thoughtful software can improve learning experiences.


## Available Commands
- `add_classroom <name>` — create a classroom  
- `add_student <studentId> <className>` — add a student  
- `mark_attendance <studentId> <className>` — mark attendance  
- `assign <className> <assignment details>` — assign work  
- `submit <studentId> <className> <assignment details>` — submit assignment  
- `list_classrooms` — list classrooms  
- `list_students <className>` — list students  
- `view_analytics` — view statistics  
- `help` — show command list  
- `exit` — save & quit

## Error Handling
- Wrong usage → prints usage message (e.g., `Usage: add_student <studentId> <className>`).  
- Unknown command → prints: `Unknown command. Type 'help'.`

## Persistence & Backup
- Data stored in `data.vcm`, with auto-backup to `data.vcm.bak`.  
- On restart, program auto-loads saved state.  
- Auto-saves on exit and after each command.

## ▶️ Running Exercise 2
```bash
javac -d . VirtualClassroom/*.java
java VirtualClassroom.Main
```

### Example Session
```bash
> add_classroom Math101
> add_student S01 Math101
> list_students Math101
S01
> view_analytics
> exit
```
Next run will show: `Loaded state from data.vcm`

---

## 🛠️ Tech Stack
- **Language:** Java  
- **Build & Compilation:** `javac` / Command-line
- **Version:** Java 25 LTS  
- **Platform:** Cross-platform (any system with Java installed)
- 
## ⚙️ Prerequisites
- **Java Development Kit (JDK) 8 or later** installed  
  - Any LTS version recommended (e.g., 8, 11, 17, 25)  
- **Command-line / Terminal** access   
- Optional: IDE like IntelliJ IDEA, Eclipse, or VS Code

## 📫 Contact
- **Name:** Ponnarasi Selvaraj  
- **Email:** ponnarasiselvaraj20@gmail.com  
- **GitHub:** [https://github.com/Ponnarasiselvaraj](https://github.com/Ponnarasiselvaraj)





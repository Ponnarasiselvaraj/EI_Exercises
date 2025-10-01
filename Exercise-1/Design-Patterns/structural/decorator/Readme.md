# Decorator Pattern

📌 Category

Structural Pattern

## 📖 Overview
The **Decorator Pattern** allows behavior to be added to an individual object dynamically, without affecting other objects of the same class.

## 💡 Use Case in This Project
The **Decorator Pattern** is used for an **Online Exam System**:
- Base exam functionality can be extended with extra features like:
  - **Time Limit**
  - **Proctoring**
  - **Negative Marking**  
- Each decorator adds its own behavior without modifying the core `BaseExam`.

This allows flexible combinations of features in an exam system.

## 📂 Files
- `Main.java` – Demonstrates decorated exam objects.
- `BaseExam.java` – Core exam class.
- `ExamDecorator.java` – Abstract decorator.
- `TimeLimitDecorator.java` – Adds time limit functionality.
- `ProctoringDecorator.java` – Adds proctoring functionality.
- `NegativeMarkingDecorator.java` – Adds negative marking functionality.
- `OnlineExam.java` – Concrete base exam implementation.

## 🖼️ Sample Output
Running `Main.java` produces outputs like:

<img width="585" height="67" alt="image" src="https://github.com/user-attachments/assets/ae621bde-7138-48b3-bf89-fe919701a585" />





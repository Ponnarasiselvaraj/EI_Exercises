# Exercise 2 – Virtual Classroom Manager

A **command-line Virtual Classroom Manager (VCM)** that simulates classroom operations, with **robust persistence and backups**.

---

## 📌 Commands

- `add_classroom <name>` – Create a new classroom.  
- `add_student <studentId> <className>` – Add a student to a class.  
- `mark_attendance <studentId> <className>` – Mark attendance for a student.  
- `assign <className> <assignment details>` – Assign work to a class.  
- `submit <studentId> <className> <assignment details>` – Submit assignment.  
- `list_classrooms` – List all classrooms.  
- `list_students <className>` – List students in a class.  
- `view_analytics` – View overall analytics.  
- `help` – Show available commands and syntax.  
- `exit` – Save and quit.

---

## 🖼️ Sample Output
Running `Main.java` produces outputs like:

- **Add Classroom**

  <img width="500" height="317" alt="image" src="https://github.com/user-attachments/assets/2c1096f4-8117-4aa2-a440-557f7edcbfad" />


- **Add Student**

  <img width="265" height="56" alt="image" src="https://github.com/user-attachments/assets/1f49a44c-f67d-480c-aab7-43a73313ebae" />


 

- **Mark Attendance**  
  

- **Assign Work**  
 

- **Submit Assignment**  
  

- **List Classrooms**  
  

- **List Students**  
  

- **View Analytics**  
  

- **Help Command**  
  

- **Exit**  
  

## ⚠️ Error Handling
- Wrong usage example:  
  `add_student 1` → prints: `Usage: add_student <studentId> <className>`  
- Unknown command example:  
  `add_std` → prints: `Unknown command. Type 'help'.`

## 🖼️ Sample Output



---

## 💾 Persistence & Backup
- All data is stored in `data.vcm` and backed up in `data.vcm.bak`.  
- On restart:  
  - If `data.vcm` exists → prints: `Loaded state from data.vcm`  
  
- Data auto-saves on every exit or update.

## 🖼️ Sample Output



---

## 🚀 Running Exercise 2

Compile and run:

```bash
javac -d . VirtualClassroom/*.java
java VirtualClassroom.Main
```

Example session:

```bash
> add_classroom Math101
> add_student S01 Math101
> list_students Math101
S01
> view_analytics
class MATH101
  student S01   attendance : 0  assigned_assignments : 0  submitted : 0 
> exit
```
Next run will show: `Loaded state from data.vcm`

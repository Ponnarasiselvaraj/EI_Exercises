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

  <img width="285" height="48" alt="image" src="https://github.com/user-attachments/assets/a8c3a7b3-8216-419d-80f4-e34fd873fc31" />

  
- **Assign Work**

  <img width="467" height="47" alt="image" src="https://github.com/user-attachments/assets/6be61c82-db45-4c5a-9b60-ee4a176266fc" />

 
- **Submit Assignment**

  <img width="468" height="68" alt="image" src="https://github.com/user-attachments/assets/aa2fcb18-7cd1-4f32-be24-1aba89f02565" />


- **List Classrooms**

  <img width="217" height="398" alt="image" src="https://github.com/user-attachments/assets/cef8030b-822c-4562-b6a2-89dd3332da64" />

  
- **List Students**

  <img width="241" height="377" alt="image" src="https://github.com/user-attachments/assets/5b38e48e-b712-4b5e-8de2-49b9137f8b57" />

  
- **View Analytics**

  <img width="663" height="493" alt="image" src="https://github.com/user-attachments/assets/d65ab47c-855b-4b9e-a116-668edf36d48d" />

  
- **Help Command**

  <img width="497" height="320" alt="image" src="https://github.com/user-attachments/assets/084e0545-8e4e-425f-a689-61ea7b3223d2" />

  
## ⚠️ Error Handling
- Wrong usage example:  
  `add_student 1` → prints: `Usage: add_student <studentId> <className>`  
- Unknown command example:  
  `add_std` → prints: `Unknown command. Type 'help'.`

## 🖼️ Sample Output

   <img width="415" height="92" alt="image" src="https://github.com/user-attachments/assets/6c489470-a538-4ed0-9ba1-2bcb2ade8952" />


---

## 💾 Persistence & Backup
- All data is stored in `data.vcm` and backed up in `data.vcm.bak`.  
- On restart:  
  - If `data.vcm` exists → prints: `Loaded state from data.vcm`  
  
- Data auto-saves on every exit or update.

## 🖼️ Sample Output
  - Being able to recall all the data even after you kill the terminal or restart the program

  <img width="667" height="836" alt="image" src="https://github.com/user-attachments/assets/7fb3806f-c233-453c-b5a0-59265b165b0a" />



---

## 🚀 Running Exercise 2

Compile and run:

```bash
javac -d . VirtualClassroom/*.java
java VirtualClassroom.Main
```

Example session:

```bash
> add_classroom 12-A
> add_student 101 12-A
> list_students 12-A
101
> view_analytics
class 12-A
  student 101   attendance : 0  assigned_assignments : 0  submitted : 0 
> exit
```
Next run will show: `Loaded state from data.vcm`

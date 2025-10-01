# Adapter Pattern

📌 Category

Structural Pattern

## 📖 Overview
The **Adapter Pattern** allows incompatible interfaces to work together by converting one interface into another that a client expects.

## 💡 Use Case in This Project
The **Adapter Pattern** is applied in an **Attendance System**:
- The old system records attendance as **"Present/Absent"**.
- The new system uses **1/0 format from a biometric device**.
- `AttendanceAdapter` bridges the two, allowing old records to work with the new system seamlessly.

This allows system upgrades without rewriting old code.

## 📂 Files
- `Main.java` – Demonstrates adapting old attendance to the new format.
- `OldAttendanceRecord.java` – Legacy attendance format.
- `NewBiometricRecord.java` – New biometric attendance format.
- `AttendanceAdapter.java` – Adapter that integrates the old system with the new.

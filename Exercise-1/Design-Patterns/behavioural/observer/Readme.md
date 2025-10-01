# Observer Pattern

📌 Category

Behavioral Pattern

## 📖 Overview
The **Observer Pattern** defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified automatically.

## 💡 Use Case in This Project
The **Observer Pattern** is applied in a **Ride Request System**:
- A `RideRequestSubject` manages ride requests.
- Multiple `Driver` objects observe the subject.
- When a new ride request arrives, all registered drivers are notified.

This ensures real-time updates to drivers without tightly coupling them to the request system.

## 📂 Files
- `Main.java` – Demonstrates ride request notifications.
- `RideRequestSubject.java` – Subject that manages and notifies observers.
- `Observer.java` – Observer interface.
- `Driver.java` – Concrete observer representing a driver.
- 
## 🖼️ Sample Output
When you run `Main.java`, you will see notifications like this:


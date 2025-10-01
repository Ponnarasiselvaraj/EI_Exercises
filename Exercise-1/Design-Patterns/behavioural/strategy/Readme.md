# Strategy Pattern

📌 Category

Behavioral Pattern

## 📖 Overview
The **Strategy Pattern** defines a family of algorithms, encapsulates each one, and makes them interchangeable.  
It allows the behavior of a class to change dynamically without modifying the client.

## 💡 Use Case in This Project
Here, the **Strategy Pattern** is used for a **Video Player** to support multiple playback quality modes:
- High Quality
- Standard Quality
- Low Quality  



This makes it easy to switch between video quality strategies at runtime without changing the player logic.

## 📂 Files
- `Main.java` – Demonstrates usage of the strategies.
- `VideoPlayer.java` – Context class that uses a strategy.
- `VideoQualityStrategy.java` – Strategy interface.
- `HighQualityStrategy.java` – Concrete strategy for high quality.
- `StandardQualityStrategy.java` – Concrete strategy for standard quality.
- `LowQualityStrategy.java` – Concrete strategy for low quality.

## 🖼️ Sample Output
Running `Main.java` produces output showing which video quality is selected:
<img width="425" height="88" alt="image" src="https://github.com/user-attachments/assets/455a312d-36da-40a2-9a09-cf73aa539497" />



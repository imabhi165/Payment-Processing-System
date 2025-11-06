
# Payment Processing System (Java + OOP + Dependency Injection)

A real-world Java console application demonstrating **Object-Oriented Programming**, **interfaces**, and **dependency injection** without using frameworks.  
This beginner-friendly project simulates selecting and processing payments like Credit Card, UPI, and PayPal.

---

## 🚀 Features

- Multiple payment methods (Credit Card, UPI, PayPal)
- Loose coupling using **interfaces**
- **Manual Dependency Injection** (no framework)
- Clean folder structure for real-world thinking
- Fully Maven-powered project

---

## 🧠 Concepts Covered

| Concept | Why it matters |
|--------|----------------|
Interfaces | Enables polymorphism & loose-coupling  
Dependency Injection | Makes code scalable & testable  
OOP | Real-world modeling in Java  
Maven | Build & dependency management  
Separation of Concerns | Professional project structure  

---

## 📂 Project Structure

```

payment-processing-system/
└── src
└── main
└── java/org/example/
├── PaymentProcessor.java   # Interface
├── CreditCardPayment.java  # Implementation
├── UpiPayment.java         # Implementation
├── PayPalPayment.java      # Implementation
├── PaymentService.java     # DI Logic
└── Main.java               # Entry point

````

---

## 🛠️ Technologies Used

- Java 17+ (tested on Java 21 / Java 25)
- Maven

---

## 📥 Installation & Setup

### ✅ 1. Clone the repository

```sh
git clone https://github.com/imabhi165/Payment-Processing-System.git
cd Payment-Processing-System
````

---

### ✅ 2. Check Java version

```sh
java -version
```

> Must be **Java 17 or higher**.

---

### ✅ 3. Build project

```sh
mvn clean package
```

---

### ✅ 4. Run project

#### Option 1 — Run packaged JAR

```sh
java -jar target/payment-processing-system-1.0-SNAPSHOT.jar
```

#### Option 2 — Run directly with Maven

```sh
mvn exec:java -Dexec.mainClass="org.example.Main"
```

---

## 🎯 Screenshots (Console Output)

```
Choose payment method:
1. Credit Card
2. UPI
3. PayPal
Enter choice: 1
Processing Credit Card payment...
✅ Payment Successful!
```

---

## 💡 Learning Goals

After finishing this project, you will understand:

* How real-world applications use Interfaces
* Why Dependency Injection makes code clean
* How to structure a Java project like a professional
* How to use Maven properly
* Running & packaging Java apps

---

## ➕ Future Improvements

* Add database to store transactions
* Add logging instead of print statements
* Build REST API version (Spring Boot)
* Build UI version (React / JavaFX)

---

## 🧑‍💻 Author

**ABHISHEK KUMAR**

If you like this project, ⭐ star the repo and follow for more Java & backend learning projects!

---


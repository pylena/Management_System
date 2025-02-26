# Introduction
This project is a Java-based inventory management and order processing system that allows businesses to track stock levels, predict restocking needs, and automate order processing using multithreading. The system also integrates GitHub collaboration workflows to simulate real-world version control.

## Features
* Inventory Management – Track stock levels and reorder thresholds.
* Stock Prediction – Estimate when products will run out based on daily sales.
* Order Processing – Manage customer orders with automated status updates.
* Multithreading – Ensure smooth, real-time order processing.
* GitHub Collaboration – Implement version control best practices, including branching and pull requests.

### Architecture
* Inventory Management
Product.java – Defines product details (ID, name, price, stock level, reorder threshold).
StockPredictor.java – Predicts when stock will run out and suggests restocking strategies.
* Order Processing
Order.java – Represents customer orders with ID, product details, and status tracking (PENDING → SHIPPED → DELIVERED).
OrderManager.java – Manages orders, updates order status using multithreading, and logs updates.

* GitHub Collaboration & Merge Conflict Resolution
  Merge Conflict Scenario:
  We intentionally created a merge conflict.by modifying the same section of code in different branches (Master and newFeature).
  ##### Conflict Details:
  ![image](https://github.com/user-attachments/assets/6c9af641-64c2-4895-ae3f-bc87dc1a5f61)
  ##### Resolution:
  ![image](https://github.com/user-attachments/assets/395cfe09-614d-41d7-96f6-b52c8f4ba281)

#### Technologies Used
Java – Core language
Multithreading – Efficient order processing
Git & GitHub – Version control & collaboration

How to Run the Project
Prerequisites
 Ensure you have:
* Java 17+ installed
* Git installed

* Clone the Repository
git clone https://github.com/pylena/Mangement_System.git



# Online Order Management System

## About
This is a simple Java program that manages online orders.  
It can create orders, process them, pay for them, and show the order list.  
This project uses basic **object-oriented programming** concepts like **classes, inheritance, and interfaces**.

---

## How it Works
- We have an abstract class called `Order` that stores order ID, amount, and status.
- `OnlineOrder` is a type of `Order` and implements the `Payable` interface.
- Orders can be in different statuses: `PENDING`, `PAID`, `SHIPPED`, or `CANCELLED`.
- In `OrderApp`, we create some orders, process them, pay for some, and show the list.

---


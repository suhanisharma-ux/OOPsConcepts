# Encapsulation: Password & Name Format Validation

This project demonstrates the core Object-Oriented Programming (OOP) principle of **Encapsulation** using an `Employee` model and an `EmployeeDriver` execution class. It highlights how data hiding, restricted direct access, and validation rules protect object integrity.

---

## Key Concepts Covered

* **Data Hiding:** Declaring sensitive attributes (such as `name` and `password`) as `private`.
* **Controlled Access:** Providing public Getter and Setter methods (`getName`, `setName`, `setPassword`) to safely retrieve and update internal states.
* **Input Validation:** Enforcing strict validation rules inside setters before assigning values to private fields.

---

## Validation Logic

### 1. Name Validation
* **Rule:** Must contain only alphabetic characters and spaces.
* **Rule:** Cannot be empty or null.

### 2. Password Validation
* **Minimum Length:** At least 8 characters long.
* **Complexity Requirements:**
  * At least one uppercase letter (`A-Z`).
  * At least one lowercase letter (`a-z`).
  * At least one numeric digit (`0-9`).
  * At least one special character (e.g., `@`, `#`, `$`, `%`, `!`).

---

## Source Code & Execution

* **Folder Path:** `encapsulation/`
* **`Employee` Class:** Contains private variables, getters, and setters with validation logic for password and name.
* **`EmployeeDriver` Class:** Contains the `main` method to run and test valid/invalid inputs against the `Employee` model.

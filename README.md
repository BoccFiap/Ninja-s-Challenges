

---

## 📝 Project Overview

This Java project is a progressive learning series focused on **object-oriented programming (OOP)**, **interfaces**, **inheritance**, and **polymorphism**, structured around managing ninjas and bank accounts in the Naruto universe. Each stage introduces a new set of challenges designed to reinforce Java fundamentals.

---

## 🔧 Technologies & Concepts Used

| Concept             | Description                                                        |
| ------------------- | ------------------------------------------------------------------ |
| `Classes & Objects` | Core of Java OOP; used to model ninjas and bank accounts           |
| `Inheritance`       | Demonstrated with class extension (`Uchiha` extends `Ninja`, etc.) |
| `Interfaces`        | Used to define method contracts (`Ninja`, `Conta`)                 |
| `Abstract Classes`  | Shared logic in bank account system (`ContaBancaria`)              |
| `Encapsulation`     | Attributes grouped and initialized via constructors                |
| `Polymorphism`      | Method overriding and dynamic behavior based on object type        |
| `Method Overriding` | Custom logic for specific subclasses (e.g., Uchiha, ContaPoupança) |
| `Arrays`            | Stores multiple ninja instances                                    |
| `Loops`             | Iterates through menu and ninja data                               |
| `Conditionals`      | Controls access and behavior (e.g., age-based mission validation)  |
| `Enums`             | Represents skill types (e.g., TAJUTSU, NINJUTSU, RINNENGAN)        |
| `Switch Case`       | Implements interactive user menu                                   |
| `Scanner`           | Captures console input from users                                  |

---

## 🧩 Breakdown of Challenges

### 1. **Ninja Mission Manager**

* Create 3 ninja instances with attributes:

  * `name`, `age`, `mission name`, `difficulty level`, `mission status`
* Conditionals:

  * Under 15 → can only complete C or D level missions
  * 15+ → can complete any mission
* Print ninja data using `System.out.println`

---

### 2. **Interactive Ninja Registration System**

* User can:

  * Register new ninjas (names stored in arrays)
  * View all registered ninjas
  * Exit the program
* Topics:

  * `Arrays`, `Scanner`, `Loops`, `Switch`, and `Conditionals`

---

### 3. **Inheritance with Ninja and Uchiha**

* Create base class `Ninja` with:

  * `name`, `age`, `mission`, `difficulty level`, `mission status`
  * Method: `mostrarInformacoes()`
* Subclass `Uchiha`:

  * Adds `habilidadeEspecial` + method `mostrarHabilidadeEspecial()`
  * Overrides `mostrarInformacoes()` to include special ability

---

### 4. **Interfaces and Polymorphism with Ninjas**

* Interface `Ninja` with methods:

  * `mostrarInformacoes()` and `executarHabilidade()`
* Two classes:

  * `NinjaBasico` and `NinjaAvancado` both implement `Ninja`
  * `NinjaAvancado` adds `especialidade`
* Extra: Use enum `TipoHabilidade` (e.g., TAJUTSU, GENJUTSU, KATON)

---

### 5. **Bank System with Interface + Abstract Class**

* Interface `Conta`: `consultarSaldo()`, `depositar(double valor)`
* Abstract class `ContaBancaria` implements `Conta`
* Subclasses:

  * `ContaCorrente`: normal deposit logic
  * `ContaPoupanca`: deposit logic includes 1% fee
* Demonstrates abstract methods and polymorphic behavior

---



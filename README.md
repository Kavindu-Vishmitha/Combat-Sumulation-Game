# Combat-Simulation-Game

# Overview
This project is a text-based combat simulation that demonstrates core Object-Oriented Programming (OOP) principles through a dynamic weapon management system. A Soldier can carry up to three different types of guns—each with unique shooting behaviors—and perform various combat-related actions such as switching, reloading, and dropping weapons.

# Features
✅ Multiple gun types with distinct behaviors (AK47, Pistol, Sniper)

✅ Soldier class that manages an array of weapons (up to 3)

✅ Weapon switching, dropping, and picking mechanics

✅ Bullet-based shooting and reload system

✅ Text-based simulation output via the console

# OOP Concepts Demonstrated

🔹 Abstraction
  - Abstract Gun class defines the interface for all weapons.

  - shoot() method is abstract and overridden by subclasses.

  - Common behaviors like reload() are implemented in the base class.

🔹 Inheritance
  - AK47, Pistol, and Sniper classes extend the Gun class.

  - These classes reuse code from the parent and customize behavior.

🔹 Encapsulation
  - Attributes such as bullets and name are protected/private.

  - Accessed and modified through getters/setters.

  - Prevents direct manipulation from outside the class.

🔹 Polymorphism
  - Soldier uses the Gun reference type to handle all gun objects.

  - Runtime behavior of shoot() depends on the actual object type.

  - Simplifies weapon management and increases flexibility.

# How to Run
  1. Clone the repository or download the source code.

  2. Open the project in NetBeans IDE or any preferred Java IDE.

  3. Compile and run the CombatSimulation.java file.

  4. Observe the output on the console.

# Project Structure
  - Gun.java – Abstract base class for all gun types

  - AK47.java / Pistol.java / Sniper.java – Gun implementations with custom shooting logic

  - Soldier.java – Manages gun inventory, switching, shooting, and reloading

  - CombatSimulation.java – Main class to run and demonstrate the simulation



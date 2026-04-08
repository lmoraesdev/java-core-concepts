# Java Core Concepts

## 📌 Context

This repository represents a structured learning path in Java, built using a professional development workflow.

The focus is not only on learning syntax, but on understanding how Java behaves internally and how to apply its core concepts in real-world backend scenarios.

---

## 🎯 Objective

- Strengthen core Java fundamentals
- Develop problem-solving skills using Java
- Build a solid foundation for backend development (Spring Boot)
- Simulate a real-world engineering workflow (tasks, versioning, CI)

---

## ⚙️ Workflow

This project follows a task-based development approach inspired by real engineering teams:

- Tasks are defined and tracked (Jira-style workflow)
- Each task is developed in an isolated branch (`feat/*`)
- Code is implemented alongside unit tests
- Commits follow a standardized pattern (Conventional Commits)
- Changes are validated through CI (GitHub Actions)

---

## 🧠 Topics Covered

- Basics (primitives, operators, control flow)
- Object-Oriented Programming (OOP)
- Collections Framework
- Exception Handling
- Streams and Lambdas
- JVM fundamentals

---

## 🧪 Testing

All implementations are expected to include unit tests.

The goal is to validate:
- Expected behavior
- Edge cases
- Code reliability

---

## 🗂️ Project Structure

The codebase is organized by core Java concepts, with isolated modules for each topic:
```
src/
├── basics/ → control flow, primitives, operators
├── oop/ → encapsulation, inheritance, polymorphism
├── collections/ → List, Set, Map and implementations
├── exceptions/ → custom exceptions and error handling
├── streams/ → functional programming with streams

tests/
```

Each module contains small, focused implementations designed to reinforce specific concepts.

---

## 🔁 Development Process

Each task follows a consistent flow:

1. Task definition
2. Branch creation (`feat/key-jira`)
3. Implementation
4. Unit tests
5. Commit using Conventional Commits
6. CI validation

---

## 🚀 Next Steps

This foundation will evolve into a backend application using:

- Spring Boot
- REST APIs
- Database integration
- Clean Architecture / DDD principles

---

## 📋 Commit Pattern

This project follows the Conventional Commits specification:

```
  <type>(scope): <description>
```
### Examples
```
  feat: implement arithmetic operations
  test: add unit tests for calculator
  refactor: improve method naming
```
---

## 🧩 Notes

This repository is part of a continuous learning process focused on backend engineering, system design, and professional development practices.

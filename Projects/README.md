# Java Projects

Welcome to the projects section! This is where you apply what you've learned by building complete, working applications. Projects increase in complexity and are designed to reinforce specific modules.

## 🎯 Project Philosophy

**Learn by building!** Reading tutorials is good, but building projects is where real learning happens. Each project:
- Applies concepts from multiple modules
- Solves a real problem
- Builds portfolio-worthy code
- Increases in complexity gradually
- Includes starter code and solutions

## 📊 Project Roadmap

```
Beginner → Intermediate → Advanced → Capstone
  ↓            ↓             ↓          ↓
1-2          3-5           6-7         8
```

## 🚀 Projects List

### Project 1: Number Guessing Game (Beginner)
**Concepts**: Variables, loops, if-else, Scanner
**Estimated Time**: 2-3 hours
**Difficulty**: ★☆☆☆☆

Build an interactive game where the computer picks a random number and the player guesses it. Provides feedback (higher/lower) and counts attempts.

**Skills Practiced**:
- User input with Scanner
- Random number generation
- While loops
- Conditional logic
- Input validation

**[View Project →](01-number-guessing-game.md)**

---

### Project 2: Text-Based Adventure (Intermediate)
**Concepts**: Control flow, methods, Strings
**Estimated Time**: 4-6 hours
**Difficulty**: ★★☆☆☆

Create an interactive story game where player choices determine the outcome. Multiple paths and endings based on decisions.

**Skills Practiced**:
- Complex control flow
- Method organization
- String manipulation
- State management
- User experience design

**[View Project →](02-text-based-adventure.md)**

---

### Project 3: Student Management System (Intermediate)
**Concepts**: OOP basics, arrays/ArrayLists, file I/O
**Estimated Time**: 6-8 hours
**Difficulty**: ★★★☆☆

Build a system to manage student records: add students, calculate GPAs, generate reports, and save/load data from files.

**Skills Practiced**:
- Class design
- ArrayList operations
- CRUD operations (Create, Read, Update, Delete)
- File persistence
- Menu-driven interfaces

**[View Project →](03-student-management-system.md)**

---

### Project 4: Bank Account Simulator (Intermediate-Advanced)
**Concepts**: OOP, inheritance, file I/O, exception handling
**Estimated Time**: 8-10 hours
**Difficulty**: ★★★☆☆

Simulate a banking system with different account types (Checking, Savings), transactions, and persistent data storage.

**Skills Practiced**:
- Inheritance hierarchy
- Polymorphism
- Exception handling
- File I/O for persistence
- Input validation
- Transaction history

**[View Project →](04-bank-account-simulator.md)**

---

### Project 5: Library Management System (Advanced)
**Concepts**: Comprehensive OOP, collections, interfaces
**Estimated Time**: 10-12 hours
**Difficulty**: ★★★★☆

Complete library system: manage books, members, checkouts, returns, fines, and search functionality.

**Skills Practiced**:
- Complex class hierarchies
- Interfaces and abstract classes
- HashMap for efficient lookups
- Date/time handling
- Search and filter algorithms
- Business logic implementation

**[View Project →](05-library-management-system.md)**

---

### Project 6: Word Game (Advanced)
**Concepts**: Strings, collections, file I/O, algorithms
**Estimated Time**: 8-10 hours
**Difficulty**: ★★★☆☆

Build word games like Hangman or Word Scramble with word dictionaries, scoring, and difficulty levels.

**Skills Practiced**:
- String manipulation
- File reading (word lists)
- Random selection
- Game loop design
- Score tracking

**[View Project →](06-word-game.md)**

---

### Project 7: Inventory Management (Advanced)
**Concepts**: Collections, file I/O, search/sort, data validation
**Estimated Time**: 10-12 hours
**Difficulty**: ★★★★☆

Manage product inventory for a store: track items, quantities, prices, reorder alerts, and generate reports.

**Skills Practiced**:
- ArrayList/HashMap usage
- Sorting and searching
- CSV file handling
- Data validation
- Report generation
- Low-stock alerts

**[View Project →](07-inventory-management.md)**

---

### Project 8: Capstone Project (Advanced)
**Concepts**: Everything!
**Estimated Time**: 15-20 hours
**Difficulty**: ★★★★★

Choose your own adventure! Build a project of your choice or select from our suggestions. Must incorporate OOP, collections, file I/O, and exception handling.

**Requirements**:
- Design document
- Class diagram
- Well-structured code
- Documentation
- README file

**[View Project →](08-capstone-project.md)**

## 📋 Project Guidelines

### Before Starting Any Project

1. **Read the requirements carefully** - Understand what you're building
2. **Plan first, code second** - Sketch out classes and methods
3. **Start simple** - Get basic version working first
4. **Test frequently** - Don't write 100 lines before testing
5. **Commit often** - Use Git to save progress

### Project Structure

```
ProjectName/
├── src/               # Source code
│   ├── Main.java
│   ├── ClassName1.java
│   └── ClassName2.java
├── data/              # Data files (if needed)
├── README.md          # Project documentation
└── design.md          # Design decisions (for larger projects)
```

### Coding Standards

All projects should follow these standards:

**1. Naming Conventions**
- Classes: PascalCase (`StudentManager`, `BankAccount`)
- Methods: camelCase (`calculateGPA`, `deposit`)
- Constants: UPPER_SNAKE_CASE (`MAX_STUDENTS`, `MIN_BALANCE`)
- Variables: camelCase (`firstName`, `accountNumber`)

**2. Code Organization**
- One class per file (except inner classes)
- Logical method ordering (constructors → getters/setters → business logic)
- Group related methods together

**3. Documentation**
- JavaDoc comments for classes and public methods
- Inline comments for complex logic
- README explaining how to run the project

**4. Error Handling**
- Validate all user input
- Handle edge cases
- Provide helpful error messages
- Never let program crash from bad input

**5. Testing**
- Test normal cases
- Test edge cases (empty input, zero, negative numbers)
- Test error conditions
- Test with real-world data

### Evaluation Criteria

Projects will be evaluated on:

| Criteria | Weight | Description |
|----------|--------|-------------|
| **Functionality** | 40% | Does it work as specified? |
| **Code Quality** | 25% | Clean, organized, follows conventions? |
| **OOP Design** | 20% | Good class design, encapsulation? |
| **User Experience** | 10% | Easy to use, clear messages? |
| **Documentation** | 5% | README, comments, JavaDoc? |

### Getting Help

**When stuck:**

1. **Read error messages** - They tell you what's wrong
2. **Use debugger** - Step through code line by line
3. **Simplify** - Reduce to smallest failing case
4. **Google it** - Someone has faced this before
5. **Ask for help** - But try first!

**How to ask for help:**
- Show your code
- Explain what you tried
- Include error messages
- Describe expected vs actual behavior

## 🎓 Portfolio Projects

These projects are portfolio-worthy! Clean them up and add to your GitHub:

**Make them shine:**
- Write a comprehensive README
- Add screenshots
- Include setup instructions
- Document features
- Link from your portfolio site

## 🌟 Extension Ideas

After completing a project, try these extensions:

**General Extensions:**
- Add GUI (Swing/JavaFX)
- Implement database (SQLite)
- Add unit tests (JUnit)
- Create REST API
- Add logging
- Implement undo/redo
- Add themes/customization

**Specific Extensions:**

**Student Management:**
- Grade curve calculation
- Email notifications
- Attendance tracking
- Course scheduling

**Bank Simulator:**
- Loan system
- Investment accounts
- Bill payment
- Multi-currency

**Library System:**
- Reservation system
- Digital books
- Member recommendations
- Late fee calculator

## 📚 Additional Resources

- [Java Naming Conventions](../Resources/java-conventions.md)
- [Debugging Guide](../Resources/debugging-guide.md)
- [Git Workflow](../Resources/git-workflow-for-java.md)
- [Project Templates](00-project-guidelines.md)

## 🎯 Project Milestones

Track your progress:

- [ ] Project 1: Number Guessing Game
- [ ] Project 2: Text-Based Adventure
- [ ] Project 3: Student Management System
- [ ] Project 4: Bank Account Simulator
- [ ] Project 5: Library Management System
- [ ] Project 6: Word Game
- [ ] Project 7: Inventory Management
- [ ] Project 8: Capstone Project

**Congratulations on each completed project! Each one is a significant achievement. 🎉**

---

[← Back to Course Home](../README.md) | [Next: Project 1 →](01-number-guessing-game.md)

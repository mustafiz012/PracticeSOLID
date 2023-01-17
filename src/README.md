SOLID stands for:

1. SRP (Single Responsibility Principle)
    1. A class should do only one thing
2. OCP (Open Closed Principle)
    1. Should be open for extension but close for modification
3. LSP (Liskov Substitute Principle)
    1. Subtypes/subclasses must be substitutable for their base type/class
4. ISP (Interface Segregation Principle)
    1. Clients should not be forced to depend/override upon methods of interfaces that they do not use
5. DIP (Dependency Inversion Principle)
    1. Depend upon abstractions (interfaces), not upon concrete classes
    2. High-level modules, which provide complex logic, should be easily reusable and unaffected by changes in low-level
       modules, which provide utility features. To achieve that, you need to introduce an abstraction that decouples the
       high-level and low-level modules from each other. Based on this idea, Robert C. Martin’s definition of the
       Dependency Inversion Principle consists of two parts:
        1. High-level modules should not depend on low-level modules. Both should depend on abstractions.
        2. Abstractions should not depend on details. Details should depend on abstractions.
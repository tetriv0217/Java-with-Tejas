# Abstract class in Java
## What is an abstract class?
An abstract class is a class that cannot be instantiated on its own. It is meant to be subclassed, and it can contain abstract methods (methods without a body) as well as concrete methods (methods with a body). Abstract classes are used to provide a common interface for a group of related classes.
## Why use an abstract class?
- To define a common interface for a group of related classes.
- To provide a base class for subclasses to inherit from.
- To allow for code reuse by providing concrete methods that can be used by subclasses.
- To enforce a contract for subclasses to implement certain methods.
## How to declare an abstract class
```java
abstract class AbstractClass {
    // Abstract method (without a body)
    abstract void abstractMethod();

    // Concrete method (with a body)
    void concreteMethod() {
        System.out.println("This is a concrete method.");
    }
}
```
## How to use an abstract class
```java
class SubClass extends AbstractClass {
    // Implementing the abstract method
    void abstractMethod() {
        System.out.println("This is an implementation of the abstract method.");
    }
}
public class Main {
    public static void main(String[] args) {
        // Cannot instantiate an abstract class
        // AbstractClass obj = new AbstractClass(); // This will cause a compile-time error

        // Create an instance of the subclass
        SubClass obj = new SubClass();
        obj.abstractMethod(); // Calls the implemented abstract method
        obj.concreteMethod(); // Calls the concrete method from the abstract class
    }
}
```
## Concerete class
A concrete class is a class that can be instantiated and does not contain any abstract methods. It can inherit from an abstract class and implement its abstract methods.
```java
class ConcreteClass extends AbstractClass {
    // Implementing the abstract method
    void abstractMethod() {
        System.out.println("This is an implementation of the abstract method in the concrete class.");
    }
}
public class Main {
    public static void main(String[] args) {
        // Create an instance of the concrete class
        ConcreteClass obj = new ConcreteClass();
        obj.abstractMethod(); // Calls the implemented abstract method
        obj.concreteMethod(); // Calls the concrete method from the abstract class
    }
}
```
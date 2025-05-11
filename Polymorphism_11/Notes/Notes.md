# Polymorphism in Java
## What is Polymorphism?
- Polymorphism is a core concept in object-oriented programming (OOP) that allows objects of different classes to be treated as objects of a common superclass.
- It enables a single interface to represent different underlying forms (data types).
- The term "polymorphism" means "many shapes" or "many forms."

## Types of Polymorphism
1. **Compile-time Polymorphism (Static Binding)**:
   - Achieved through method overloading and operator overloading.
   - The method to be executed is determined at compile time.
   - Example: Method overloading in Java.
2. **Runtime Polymorphism (Dynamic Binding)**:
   - Achieved through method overriding.
   - The method to be executed is determined at runtime based on the object being referred to.
   - Example: Method overriding in Java.
## Dynamic Method Dispatch
- Dynamic method dispatch is a mechanism by which a call to an overridden method is resolved at runtime rather than compile time.
- It is a key feature of runtime polymorphism in Java.
- The method to be executed is determined by the actual object type, not the reference type.
- Example:
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal myAnimal;
        myAnimal = new Dog(); // Animal reference but Dog object
        myAnimal.sound(); // Outputs: Dog barks

        myAnimal = new Cat(); // Animal reference but Cat object
        myAnimal.sound(); // Outputs: Cat meows
    }
}
```

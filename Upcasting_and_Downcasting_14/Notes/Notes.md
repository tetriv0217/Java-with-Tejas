# Upcasting and Downcasting in Java
## Upcasting
- Upcasting is the process of converting a subclass reference to a superclass reference.
- It is done automatically by the Java compiler.
- Upcasting allows you to treat an object of a subclass as if it were an object of its superclass.
- This is useful when you want to use polymorphism, where a single interface can represent different underlying forms (data types).
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
        Animal myDog = new Dog(); // Upcasting
        Animal myCat = new Cat(); // Upcasting

        myDog.sound(); // Output: Dog barks
        myCat.sound(); // Output: Cat meows
    }
}
```
## Downcasting
- Downcasting is the process of converting a superclass reference back to a subclass reference.
- It is not done automatically by the Java compiler and requires an explicit cast.
``` java
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
        Animal myDog = new Dog(); // Upcasting
        Dog dog = (Dog) myDog; // Downcasting
        dog.sound(); // Output: Dog barks

        Animal myCat = new Cat(); // Upcasting
        Cat cat = (Cat) myCat; // Downcasting
        cat.sound(); // Output: Cat meows
    }
}
```
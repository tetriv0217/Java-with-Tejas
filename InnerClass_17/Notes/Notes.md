# What is inner class in Java?
# Inner Class in Java
- Inner classes are classes defined within the body of another class. They can be used to logically group classes that are only used in one place, increase encapsulation, and make the code more readable.
- Inner classes can access the members (including private members) of the outer class, which makes them useful for implementing certain design patterns.
- There are four types of inner classes in Java:
  - Non-static inner class
  - Static nested class
  - Method-local inner class
  - Anonymous inner class
- Each type of inner class has its own use cases and benefits.

# 1. Non-static Inner Class
- A non-static inner class is associated with an instance of the outer class and can access its members (including private members).
- It is created using the following syntax:
```java
class OuterClass {
    class InnerClass {
        // Inner class code
    }
}
```
- Example:
```java
class OuterClass {
    private int outerField = 10;

    class InnerClass {
        void display() {
            System.out.println("Outer field: " + outerField);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display(); // Output: Outer field: 10
    }
}
```
- In this example, the `InnerClass` can access the `outerField` of the `OuterClass` because it is a non-static inner class.
# 2. Static Nested Class
- A static nested class is associated with the outer class itself rather than an instance of the outer class. It can only access static members of the outer class.
- It is created using the following syntax:
```java
class OuterClass {
    static class StaticNestedClass {
        // Static nested class code
    }
}
```
- Example:
```java
class OuterClass {
    private static int outerField = 20;

    static class StaticNestedClass {
        void display() {
            System.out.println("Outer field: " + outerField);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display(); // Output: Outer field: 20
    }
}
```
- In this example, the `StaticNestedClass` can access the `outerField` of the `OuterClass` because it is a static nested class and `outerField` is static.
# 3. Method-local Inner Class
- A method-local inner class is defined within a method and can access the local variables of the method (if they are final or effectively final) as well as the members of the outer class.
- It is created using the following syntax:
```java
class OuterClass {
    void outerMethod() {
        class MethodLocalInnerClass {
            // Method-local inner class code
        }
    }
}
```
- Example:
```java
class OuterClass {
    private int outerField = 30;

    void outerMethod() {
        final int localVariable = 40;

        class MethodLocalInnerClass {
            void display() {
                System.out.println("Outer field: " + outerField);
                System.out.println("Local variable: " + localVariable);
            }
        }

        MethodLocalInnerClass inner = new MethodLocalInnerClass();
        inner.display(); // Output: Outer field: 30, Local variable: 40
    }
}
public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();
    }
}
```
- In this example, the `MethodLocalInnerClass` can access both the `outerField` of the `OuterClass` and the `localVariable` of the `outerMethod`.
# 4. Anonymous Inner Class
- An anonymous inner class is a class without a name that is defined and instantiated in a single expression. It can be used to create subclasses or implement interfaces on the fly.
- It is created using the following syntax:
```java
class OuterClass {
    void outerMethod() {
        new InterfaceOrClass() {
            // Anonymous inner class code
        };
    }
}
```
- Example:
```java
interface Greeting {
    void greet();
}
class OuterClass {
    void outerMethod() {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous inner class!");
            }
        };
        greeting.greet(); // Output: Hello from anonymous inner class!
    }
}
public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();
    }
}
```
- In this example, the anonymous inner class implements the `Greeting` interface and provides its own implementation of the `greet` method.

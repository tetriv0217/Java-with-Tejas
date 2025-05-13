# Notes on Interfaces in Java

## Key Concepts

### 1. **Interfaces in Java**
- Interfaces in Java are used to achieve abstraction and multiple inheritance.
- They can contain:
    - Abstract methods (methods without a body).
    - Static and final variables (constants).

### 2. **Defining an Interface**
```java
interface X {
        int area = 44; // Variables in interfaces are final and static by default.
        void show();   // Abstract method.
        void config(); // Abstract method.
}
```

### 3. **Extending an Interface**
- An interface can extend another interface.
```java
interface Y extends X {
        void run(); // Additional method in the extended interface.
}
```

### 4. **Implementing Multiple Interfaces**
- A class can implement multiple interfaces.
```java
interface Z {
        void beHuman();
}

class A implements Y, Z {
        public void show() {
                System.out.println("In show");
        }
        public void config() {
                System.out.println("In config");
        }
        public void run() {
                System.out.println("In run");
        }
        public void beHuman() {
                System.out.println("In beHuman");
        }
}
```

### 5. **Using Interface References**
- You can create references of an interface type, but they must point to an object of a class that implements the interface.
```java
X obj; // Reference of interface X.
obj = new A(); // Assigning an object of class A.
obj.show();    // Calls the overridden method in class A.
obj.config();  // Calls the overridden method in class A.
```

### 6. **Static Variables in Interfaces**
- Variables in interfaces are `static` and `final` by default, so they can be accessed directly using the interface name.
```java
System.out.println(X.area); // Accessing static variable.
```

### 7. **Limitations**
- Interface references can only call methods defined in the interface. For example:
```java
// obj.run(); // Error: X doesn't know about the run() method.
```

### 8. **Multiple Interface Implementations**
- A single class can implement multiple interfaces, and you can use specific interface references to call methods defined in those interfaces.
```java
Y obj1 = new A(); // Reference of interface Y.
Z obj2 = new A(); // Reference of interface Z.
obj1.run();       // Calls run() method.
obj2.beHuman();   // Calls beHuman() method.
```

## Example Code
```java
package Interfaces_18.InterfaceAdvance_2;

interface X {
        int area = 44;
        void show();
        void config();
}

interface Y extends X {
        void run();
}

interface Z {
        void beHuman();
}

class A implements Y, Z {
        public void show() {
                System.out.println("In show");
        }
        public void config() {
                System.out.println("In config");
        }
        public void run() {
                System.out.println("In run");
        }
        public void beHuman() {
                System.out.println("In beHuman");
        }
}

public class Demo {
        public static void main(String[] args) {
                X obj;
                System.out.println(X.area); // Accessing static variable.

                obj = new A();
                obj.show();
                obj.config();

                Y obj1 = new A();
                Z obj2 = new A();
                obj1.run();
                obj2.beHuman();
        }
}
```

## Summary
- Interfaces provide a way to achieve abstraction and multiple inheritance in Java.
- They define a contract that implementing classes must follow.
- Interface variables are `static` and `final` by default.
- A class can implement multiple interfaces, and specific interface references can be used to access methods defined in those interfaces.  
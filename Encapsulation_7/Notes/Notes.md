# Encapsulation in java 
- Encapsulation is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.

- Encapsulation is one of the four fundamental Object-Oriented Programming (OOP) concepts.

- It is ensured by restricting access to certain details of an object and only exposing a controlled interface to the outside world.
- Encapsulation is achieved by using access modifiers (private, public, protected) to restrict access to the data and methods of a class.
- Encapsulation helps to protect the internal state of an object and prevent unauthorized access to its data and methods.
- It allows for better control over the data and methods of a class, making it easier to maintain and modify the code.

## Getters and Setters
- Getters and setters are methods that allow access to the private data of a class.
- Getters are used to retrieve the value of a private variable, while setters are used to set the value of a private variable.
- Getters and setters are used to provide controlled access to the private data of a class, allowing for validation and other logic to be applied when accessing or modifying the data.
- Getters and setters are also known as accessors and mutators, respectively.
Example:
```java
public class Person {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}
```

## this keyword
- The `this` keyword is a reference to the current object in a method or constructor.


## Constructors
- A constructor is a special method that is called when an object is created. It is used to initialize the object's properties and allocate memory for the object.
- A constructor has the same name as the class and does not have a return type.
- A constructor can have parameters, which allows for different ways to create an object with different initial values.
- A constructor can also call other constructors in the same class using the `this` keyword. This is known as constructor chaining.
### Types of Constructors
- There are two types of constructors in Java:
    1. **Default constructor**: A constructor that does not take any parameters. It initializes the object's properties to default values.
    2. **Parameterized constructor**: A constructor that takes parameters and initializes the object's properties with the provided values.
- If no constructor is defined in a class, the Java compiler automatically provides a default constructor.
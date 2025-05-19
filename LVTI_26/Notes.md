# LVTI in java

## What is LVTI?
- LVTI stands for **Local Variable Type Inference**.
- It allows the compiler to infer the type of a local variable based on the initializer expression.
- Introduced in Java 10, it uses the `var` keyword to declare local variables without explicitly specifying their type.
- This feature simplifies code and improves readability, especially in cases where the type is obvious from the context.
- It is important to note that `var` can only be used for local variables and cannot be used for method parameters, return types, or class fields.

## Precautions with LVTI
- **Type Inference**: The type of the variable is inferred at compile time, and it cannot be changed later. For example:
  ```java
  var x = 10; // x is inferred as int
  x = "Hello"; // Error: incompatible types
  ```
- **Initialization Required**: The variable must be initialized at the time of declaration. For example:
  ```java
    var y; // Error: cannot use 'var' without initialization
    ```
- **No Null Values**: The variable cannot be assigned a null value without an initializer. For example:
  ```java
    var z = null; // Error: cannot use 'var' with null
    ```
- **No Primitive Types**: The variable cannot be declared as a primitive type. For example:
  ```java
    var a = 10; // a is inferred as int
    var b = 10.5; // b is inferred as double
    ```


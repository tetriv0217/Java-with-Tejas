# Wrapper Class in Java
## What is a Wrapper Class?
- A wrapper class in Java is a class that encapsulates a primitive data type into an object.
- It allows primitive types to be treated as objects, enabling the use of Java's object-oriented features.
``` java
// Example of Wrapper Classes
public class WrapperClassExample {
    public static void main(String[] args) {
        // Primitive data types
        int primitiveInt = 10;
        char primitiveChar = 'A';
        
        // Wrapping primitive types into objects
        Integer wrappedInt = Integer.valueOf(primitiveInt);
        Character wrappedChar = Character.valueOf(primitiveChar);
        
        // Unwrapping objects back to primitive types
        int unwrappedInt = wrappedInt.intValue();
        char unwrappedChar = wrappedChar.charValue();
        
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unwrapped Integer: " + unwrappedInt);
        System.out.println("Wrapped Character: " + wrappedChar);
        System.out.println("Unwrapped Character: " + unwrappedChar);
    }
}
```
## Why Use Wrapper Classes?
- Wrapper classes are used when we need to use primitive types in a context that requires objects, such as collections (e.g., ArrayList, HashMap).
- They provide methods to convert between primitive types and their corresponding object types.
- They also provide utility methods for parsing strings, comparing values, and converting between different number systems.
## Common Wrapper Classes
- `Integer`: wraps the primitive `int` type.
- `Double`: wraps the primitive `double` type.
- `Character`: wraps the primitive `char` type.
- `Boolean`: wraps the primitive `boolean` type.
- `Float`: wraps the primitive `float` type.
- `Long`: wraps the primitive `long` type.
- `Short`: wraps the primitive `short` type.
- `Byte`: wraps the primitive `byte` type.
## Autoboxing and Unboxing
- Autoboxing: The automatic conversion of a primitive type to its corresponding wrapper class object.
- Unboxing: The automatic conversion of a wrapper class object to its corresponding primitive type.
``` java
// Example of Autoboxing and Unboxing
public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        // Autoboxing
        Integer wrappedInt = 20; // int to Integer
        Double wrappedDouble = 15.5; // double to Double
        
        // Unboxing
        int unwrappedInt = wrappedInt; // Integer to int
        double unwrappedDouble = wrappedDouble; // Double to double
        
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unwrapped Integer: " + unwrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Unwrapped Double: " + unwrappedDouble);
    }
}
```
## Conclusion
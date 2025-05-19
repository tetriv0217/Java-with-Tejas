# Sealed Classes in Java

## What is a Sealed Class?
- A sealed class is a special type of class in Java that restricts which other classes can extend it. This allows developers to control the inheritance hierarchy and ensure that only a specific set of subclasses can be created.
- Sealed classes were introduced in Java 15 as a preview feature and became a standard feature in Java 17.
- The main purpose of sealed classes is to provide a more controlled and predictable inheritance model, which can help improve code maintainability and readability.
- Sealed classes can be used to create a closed set of subclasses, which can be useful in scenarios where you want to limit the number of implementations or variations of a class.

## Key Features of Sealed Classes
- **Sealed Modifier**: The class is declared with the `sealed` modifier, indicating that it is a sealed class.
- **Permits Clause**: The class must specify which classes are allowed to extend it using the `permits` clause. This clause lists the permitted subclasses.
- **Subclasses**: The subclasses of a sealed class can be declared as `final`, `sealed`, or `non-sealed`.
  - `final`: The subclass cannot be extended further.
  - `sealed`: The subclass is also a sealed class and can specify its own permitted subclasses.
  - `non-sealed`: The subclass can be extended by any class, effectively removing the sealing restriction.
- **Access Control**: Sealed classes can be used to enforce access control and encapsulation, as only the specified subclasses can extend the sealed class.
- **Pattern Matching**: Sealed classes can be used in conjunction with pattern matching to simplify type checking and casting.

## Sealed Interfaces
- Sealed interfaces are similar to sealed classes but apply to interfaces. They allow you to control which classes can implement the interface.
- Sealed interfaces can also use the `permits` clause to specify the permitted implementing classes.
- The same rules apply to sealed interfaces as to sealed classes regarding the use of  `sealed`, or `non-sealed` modifiers for implementing classes.
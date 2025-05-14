# Enums in Java

## What is an Enum?
- An enum (short for "enumeration") is a special Java type used to define collections of constants. It is a special Java type used to define collections of constants. An enum can be declared using the `enum` keyword, and it can contain fields, methods, and constructors just like a regular class.
- Enums are a powerful feature in Java that allows you to define a fixed set of constants. They are more type-safe than traditional constants defined using `static final` variables, and they can also have methods and fields, making them more flexible and powerful.

## Example of Enum
```java
public enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
```
- In this example, we define an enum called `Day` that represents the days of the week. Each day is a constant value of the `Day` type.
- Enums can be used in switch statements, making them a great choice for representing a fixed set of values.



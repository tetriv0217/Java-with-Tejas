# Java Variables

Java is a strongly typed language, meaning every variable must have a specific type. The type determines the values it can hold and the operations that can be performed on it. Java has two categories of data types:

## Primitive Data Types
These are the basic data types provided by Java for storing simple values:

- `byte`: 8-bit signed integer
- `short`: 16-bit signed integer
- `int`: 32-bit signed integer
- `long`: 64-bit signed integer
- `float`: 32-bit floating-point number
- `double`: 64-bit floating-point number
- `char`: 16-bit Unicode character
- `boolean`: true or false

## Reference Data Types
These data types store references to objects rather than the actual data. Examples include:

- Classes
- Interfaces
- Arrays
- Strings

## Assigning Primitive Data Types

Here is how you can assign values to primitive data types in Java:

```java
byte b = 10;
short s = 20;
int i = 30;
long l = 40L;
float f = 50.0f;
double d = 60.0;
char c = 'A';
boolean bool = true;
```


Demonstrates the use of different types of numeric literals in Java.

* - Binary literal: `0b101` (binary representation of 5)
* - Hexadecimal literal: `0x7E` (hexadecimal representation of 126)
* - Underscore in numeric literals: `100_0_0_0` (for readability, represents 100000)
* - Scientific notation: `2e4` (represents 2 * 10^4, which is 20000)

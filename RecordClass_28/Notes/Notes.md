# Record class in Java

## What is a record class?
A record class is a special kind of class in Java that is used to create immutable data objects. It is a feature introduced in Java 14 as a preview feature and became a standard feature in Java 16. Record classes are designed to be a quick and easy way to create data classes that hold a fixed set of values.
## Key Features of Record Classes
1. **Immutable**: Once a record object is created, its state cannot be changed. This means that the fields of a record class are final and cannot be modified after the object is constructed.
2. **Compact Syntax**: Record classes provide a compact syntax for declaring classes that are primarily used to hold data. You can declare a record class in a single line, which makes the code more concise and readable.
3. **Automatic Generation of Methods**: When you declare a record class, the Java compiler automatically generates several methods for you, including:
   - `equals()`: Compares two record objects for equality.
   - `hashCode()`: Generates a hash code for the record object.
   - `toString()`: Returns a string representation of the record object.
   - Accessor methods for each field (getters).
4. **Pattern Matching**: Record classes can be used with pattern matching, which allows you to destructure the record object and access its fields in a more convenient way.

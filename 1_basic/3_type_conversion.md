# Type Conversion and Typecasting in Java

## Type Conversion

Type conversion in Java is the process of converting one data type into another. There are two types of type conversion:

### 1. Implicit Type Conversion (Widening)

- **Automatic conversion** performed by the Java compiler.
- Happens when converting a smaller data type to a larger data type.
- No data loss occurs.

**Example:**
```java
int num = 10;
double d = num; // int to double
```

### 2. Explicit Type Conversion (Narrowing)

- **Manual conversion** performed by the programmer.
- Happens when converting a larger data type to a smaller data type.
- May result in data loss.

**Example:**
```java
double d = 10.5;
int num = (int) d; // double to int
```

## Typecasting

Typecasting is the process of converting one data type into another by explicitly specifying the target data type. It is used when you need to convert a data type that cannot be automatically converted by the compiler.

### Rules of Typecasting

1. **Compatible Types**: The source and target types must be compatible.
2. **Explicit Casting**: Use parentheses to specify the target type.
3. **Data Loss**: Be cautious of potential data loss when casting from a larger to a smaller type.

**Example:**
```java
float f = 10.5f;
int num = (int) f; // float to int
```

### Summary

- **Implicit Conversion**: Automatic, safe, no data loss.
- **Explicit Conversion**: Manual, potential data loss, requires casting.

By understanding these rules, you can effectively manage type conversions and typecasting in your Java programs.

## Practical Example

Let's look at a practical example to understand type conversion and typecasting better:

```java
class TypeConversion {
    public static void main(String[] args) {
        int a = 12;
        // byte b = a; // This will not convert
        byte b = (byte) a; // This will convert, example of type casting

        int bigger = 257;
        int bigger2 = -257;
        byte k = (byte) bigger;
        byte k2 = (byte) bigger2;

        // Since byte is of 8 bits and has a range of 256 integers,
        // if it is bigger than the range of byte, it does modulo 256;
        // 257 % 256 = 1
        System.out.println(k); // Answer is 1
        System.out.println(k2); // Answer is -1

        // Promotion

        byte num1 = 10;
        byte num2 = 30;
        int res = num1 * num2;
        System.out.println(res); // Answer is 300
    }
}
```

### Explanation

1. **Type Casting Example**:
   - `int a = 12;`
   - `byte b = (byte) a;` - Here, we explicitly cast the `int` value to a `byte`.

2. **Handling Larger Values**:
   - `int bigger = 257;`
   - `byte k = (byte) bigger;` - Since `byte` has a range of 256, the value 257 is converted using modulo 256, resulting in `1`.

3. **Promotion Example**:
   - `byte num1 = 10;`
   - `byte num2 = 30;`
   - `int res = num1 * num2;` - The result of multiplying two `byte` values is promoted to `int`.

By understanding these examples, you can see how type conversion and typecasting work in Java, and how to handle potential issues such as data loss and type promotion.
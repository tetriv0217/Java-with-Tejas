# Anonymus Object
- An anonymous object is an object that is created without a reference variable. It is used when you want to create an object for a one-time use and do not need to keep a reference to it. Anonymous objects are often used in method calls or when passing objects as arguments to methods.

Example:
```java
class Demo{
    public static void main(String[] args) {
        // Creating an anonymous object and calling a method on it
        new Demo().display();
    }
    void display() {
        System.out.println("Hello, this is an anonymous object!");
    }
    // Output: Hello, this is an anonymous object!
}
```
- In the above example, `new Demo()` creates an anonymous object of the `Demo` class, and the `display()` method is called on it. Since there is no reference variable to hold the object, it is considered an anonymous object.
- Anonymous objects are useful when you want to perform a single operation with an object without the need to store it in a variable. They can also be used in method chaining, where multiple method calls are made on the same object in a single statement.
- However, since anonymous objects do not have a reference variable, you cannot access them later in the code. This means that you cannot call any methods or access any properties of the object after it has been created.
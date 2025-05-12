package WrapperClass_15;

public class Demo {

    public static void main(String[] args) {
        // Auto-boxing
        Integer wrappedInt = 20; // int to Integer
        Double wrappedDouble = 15.5; // double to Double
        
        // Auto-Unboxing
        int unwrappedInt = wrappedInt; // Integer to int
        double unwrappedDouble = wrappedDouble; // Double to double
        
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unwrapped Integer: " + unwrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Unwrapped Double: " + unwrappedDouble);
    }
}
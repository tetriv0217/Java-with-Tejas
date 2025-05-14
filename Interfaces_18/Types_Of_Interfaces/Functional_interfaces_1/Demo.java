package Interfaces_18.Types_Of_Interfaces.Functional_interfaces_1;

// In this code we are going Single Abstract Method (SAM)


@FunctionalInterface
interface A{
    void show(int i);
    // void show1(int i);Can't have two methods in a FunctionalInterface
}
@FunctionalInterface
interface B{
    int show(int i,int j);
    // void show1(int i);Can't have two methods in a FunctionalInterface
}


public class Demo {

    public static void main(String[] args) {
        // Lamda expressions only work with FunctionalInterface

        //This is the normal way of using interfaces
        // A obj = new A(){
        //     public void show(int i){
        //         System.out.println("in show " + i);
        //     }
        // };
        // obj.show(10);

        //  | |
        //   V
        
        // using Lamda expressions


        A obj = i -> System.out.println("in show " + i);
        obj.show(10);

        // What you would have done before java 8
        // B obj1 = new B(){
        //     public int show(int i,int j){
        //         return i+j;
        //     }
        // };
        // int n = obj1.show(2, 3);


        // After Learning lamda fucntion

        B obj1 = (i,j) -> (i+j);
        int n = obj1.show(2, 3);

        System.out.println(n);


        // Lamda Functions reduce code and also dont create a class file
        // Your statement is mostly correct. Lambda expressions in Java do not generate a separate .class file for an anonymous inner class like traditional anonymous classes do.
        // Instead, the Java compiler uses the invokedynamic instruction and generates the lambda implementation at runtime, typically as a synthetic method in the enclosing class.
        // So, you won't see a separate class file for each lambda, unlike anonymous classes.



    }
    
}
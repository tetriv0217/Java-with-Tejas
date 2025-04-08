package This_Super_8;

// Super is always there even if you dont mention it.
// It is the first statment when the constructor is called.


// Every class Extends the Object class
// class A extends Object *Hidden*
class A{

    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A int");
    }

}
class B extends A{
    public B(){
        
        System.out.println("in B");
    }
    public B(int n){
        this();
        // super(n);//for first two output
        //This was done to call the parameterized constructor
        // If there is no constructor then it will show error
        System.out.println("in B int");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        // Code 1
        // B obj = new B());
        
        //This calls the A constructor as well even though it was't called, because of super(),it only calls the default constructor
        
        /*
        This will give output
        in A
        in B
        */

        // System.out.println("--------------");
        
        // Code 2

        // B obj1 = new B(3);
        // /*
        // This will give output
        // in A int
        // in B int
        // */
        // System.out.println("--------------");
        
        // Code 3

        // B obj1 = new B(5);//This calls the A constructor as well even though it was't called, because of super(),it only calls the default constructor
         
    }
}

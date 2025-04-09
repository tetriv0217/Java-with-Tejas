package Mehod_Overiding;

class A {
    public void show(){
        System.out.println("Show A");
    }
}
class B extends A{
    
    public void show(){
        System.out.println("Show B");
    }
}
public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        /*
            Here the output will be:
                Show B
            Reason: 
                - Because the function show() of B overrides the function of A.

         */
    }
}

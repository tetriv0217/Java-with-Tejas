package Upcasting_and_Downcasting_14;

// The Superclass doesn't have idea about their subclasses
class A{
    public void show1(){
        System.out.println("From Show A");
    }
}
class B extends A {
    public void show2(){
        System.out.println("From Show B");
    }
}

public class Demo {

    public static void main(String[] args) {
        A obj = (A) new B();// even though you are using new B() it Upcast it to A
        obj.show1();

        // A obj1 = new B();
        // obj1.show2();// You can't use B show2 even though you created an object B since the reference is given A

        // Here you can do a downcasting
        B obj2 = (B)obj;
        obj2.show2();//Here you can use both show1 and show2 as it is sub class object and inherit properties from parent

        

    }
}
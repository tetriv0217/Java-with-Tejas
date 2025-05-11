package Polymorphism_11;

class A{
    public void show(){
        System.out.println("Show in A");
    }
}



class B extends A {
    public void show(){
        System.out.println("Show in B");
    }
}

class C extends A{
    public void show(){
        System.out.println("Show in C");
    }
}

public class Demo {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();
        obj = new C();
        obj.show();
        // This is Done at run time
        // also You can refer an example as Laptop and Computer
        // here you can see that that the parent object was created and then the child overide the object above
    }
}
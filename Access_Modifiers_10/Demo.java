package Access_Modifiers_10;
import Access_Modifiers_10.Other.*;

class D extends C{
    public void show(){
        System.out.println(c);// You can use c (protected in C.java)
        // Protected Helps you to use members in Different package subclass
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.a);

        // B obj1 = new B();
        // System.out.println(obj1.b);//You cant run this as obj1.b is 

        // C obj2= new C();
        // System.out.println(obj2.c);//This is also not visible

        D obj3 = new D();
        obj3.show();


    }
    
}
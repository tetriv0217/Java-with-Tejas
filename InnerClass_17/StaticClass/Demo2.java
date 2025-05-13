package InnerClass_17.StaticClass;


// Static Inner Class

class A{
    public void show(){
        System.out.println("In Show");
    }
    // A class can be static 
    static class B{
        public void config(){
            System.out.println("In Config");
        }
    }
}

public class Demo2 {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = new A.B();// Here you can use A.B notation cause static makes sure that you dont have to have an object
        obj1.config();
    }
}
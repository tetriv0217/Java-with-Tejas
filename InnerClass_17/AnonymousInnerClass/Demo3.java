package InnerClass_17.AnonymousInnerClass;
// Anonymous Inner Class
class A {

    public void show(){
        System.out.println("Initial Show");
    }
    
}

public class Demo3 {

    public static void main(String[] args) {
        A obj = new A()//Now the behaviour of show has changed
        {
            public void show(){
                System.out.println("Change in show");
            }
        };
        obj.show();
    }
}
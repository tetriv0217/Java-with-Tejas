package InnerClass_17.AbstractAnnonymousInnerClass;

abstract class A {
    abstract public void show();
    abstract public void config();
}


public class Demo4 {

    public static void main(String[] args) {
        A obj = new A(){ // even though we can't initaite an abstract class but we can do that by Anonymous Inner class
            public void show(){
                System.out.println("In show1");
            }
            public void config(){
                System.out.println("In config1");
            }
        };
        obj.show();
        obj.config();
        A obj1 = new A(){ // even though we can't initaite an abstract class but we can do that by Anonymous Inner class
            public void show(){
                System.out.println("In show2");
            }
            public void config(){
                System.out.println("In config2");
            }
        };
        obj1.show();
        obj1.config();
    }
}
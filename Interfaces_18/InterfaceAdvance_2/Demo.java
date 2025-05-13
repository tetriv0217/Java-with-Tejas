package Interfaces_18.InterfaceAdvance_2;


interface X{

    // variables in interfaces are final and static
    int area = 44;
    void show();
    void config();
}

interface Y extends X{
    void run();
}

interface Z{
    void beHuman();
}

class A implements Y,Z{
    public void show(){
        System.out.println("In show");
    }
    public void config(){
        System.out.println("In config");
    }
    public void run(){
        System.out.println("In run");
    }
    public void beHuman(){
        System.out.println("In beHuman");
    }
}

public class Demo {

    public static void main(String[] args) {
        X obj; // you can create a reference
        System.out.println(X.area);// you can use it statically

        // obj.config();//This will show errow as you can't intialize;

        obj = new A();
        obj.show();
        obj.config();
        // obj.run();// this will show error as X doesnt know what is run (since Y is extending run)

        Y obj1 = new A();
        Z obj2 = new A();// to run Z implementaation
        obj1.run();
        obj2.beHuman();


    }
}

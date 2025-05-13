package AbstractClass_16;

abstract class Car{
    public abstract void drive(); 
    public abstract void fly();
    public void playMusic(){
        System.out.println("Playing Music");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving");
    }

}

class AdvWagonR extends WagonR{ // This is a concrete class
    public void fly(){
        System.out.println("Flying..");
    }
}


public class Demo {

    public static void main(String[] args) {
        Car obj = new AdvWagonR(); // You can give a reference of an abstract class but can't instantiate the object of a abstract class
        obj.playMusic();
        obj.drive();
        obj.fly();

    }
}
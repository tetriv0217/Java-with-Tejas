// This code was used to show static methods
package Static_6;
class Mobile {

    String brand;
    int price;
    static String  name;
    
    // This is an instance method or non-static method
    public void show(){
        System.out.println(brand + " : " + name + " : " + price);
    }
    // You can't use non-static variables in a static method
    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : " + name + " : " + obj.price);
        System.out.println("In the static block");
    }
}

public class Demo3{
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price=1500;
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1200;
        
        Mobile.name = "Smart phone";
        // obj1.show();
        // obj2.show();
        Mobile.show1(obj1);
        Mobile.show1(obj2);
        
    }
}
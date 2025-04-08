package Static_6;

class Mobile {

    String brand;
    int price;
    static String  name;
    public void show(){
        System.out.println(brand + " : " + name + " : " + price);
    }
}

public class Demo{
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price=1500;
        // obj1.name = "SmartPhone";
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1200;
        // obj2.name = "Galaxy";
        
        Mobile obj3 = new Mobile();
        obj3.brand = "OnePlus";
        obj3.price = 800;
        // obj3.name = "Nord";// Now beacuse of this all obj name will be nord since static object is shared by the whole class
        
        Mobile.name = "Smart phone";//This will give every object name as SmartPhone
        obj1.show();
        obj2.show();
        obj3.show();
    }
}
// This code was used to show static block in a class
package Static_6;
class Mobile {

    String brand;
    int price;
    static String  name;
    // This block is called once irrespective of how many objects.
    // It is called before constructor
    static{
        name = "Phone";
        System.out.println("In the static block");
    }
    public Mobile(){
        brand = "";
        price = 200;
        // name  = ""; we dont do this since it instantiate which takes memory
        System.out.println("In constructor block");
    }
    public void show(){
        System.out.println(brand + " : " + name + " : " + price);
    }
}

public class Demo2{
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price=1500;
        obj1.show();
        // Mobile obj2 = new Mobile();
        
    }
}
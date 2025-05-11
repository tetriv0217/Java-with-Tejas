package Final_Keyword_12;


// Now no one can extend this class
final class A{
    // Now no one can use this function further
    public final void show(){ 
        System.out.println("Done By Tejas");
    }
}



public class Demo {
    public static void show(){
        System.out.println("Tejas in Demo");
    }

    public static void main(String[] args) {
        // final int a = 10; // Now a has become a constant
        // a= 12; You cant use it as it is final above
        A obj = new A();
        obj.show();
        
        show();
    }
}

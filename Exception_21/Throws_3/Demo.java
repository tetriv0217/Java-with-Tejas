package Exception_21.Throws_3;

class A{ 
    public void show() throws ClassNotFoundException{ // Now the object that is using this method has to handle the error
        Class.forName("Calc");
    }
}

public class Demo {

    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
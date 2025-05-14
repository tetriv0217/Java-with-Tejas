package Annotaions_20;

class A {

    public void show(){
        System.out.println("In A show");
    }
    
}

class B extends A{
    // public void showIstheBiggestOne(){ 
        //     System.out.println("In B show");
        // }
    @Override // This helps to make sure that we dont make mistakes
    public void show(){
        System.out.println("In B show");
    }
}

public class Demo {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
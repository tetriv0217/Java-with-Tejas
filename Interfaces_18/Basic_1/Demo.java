package Interfaces_18.Basic_1;

interface Computer {
    public void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("User is coding on Laptop");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("User is coding on Desktop");
    }
}

class Developer{

    
    public void devApp(Computer comp){
        comp.code();
    }
}

public class Demo {

    public static void main(String[] args) {
        Developer tejas = new Developer();

        
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        tejas.devApp(desk);
        tejas.devApp(lap);
    }
}
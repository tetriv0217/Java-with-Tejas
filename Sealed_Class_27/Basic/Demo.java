package Sealed_Class_27.Basic;

sealed class A extends Thread implements Cloneable permits B, C {
}

non-sealed class B extends A {
}

final class C extends A {
}

class D extends B{
    
}

sealed interface X{

}

non-sealed interface Y extends X{

}

public class Demo {

    public static void main(String[] args) {

    }
}
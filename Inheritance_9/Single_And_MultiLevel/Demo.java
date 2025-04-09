package Inheritance_9.Single_And_MultiLevel;


public class Demo {
    public static void main(String[] args) {
        VeryAdvClass  obj = new VeryAdvClass();
        int n1 = obj.sum(1, 2); 
        int n2 = obj.sub(4, 3); 
        int n3 = obj.multi(4, 3); 
        int n4 = obj.div(12, 3); 
        double n5 = obj.power(3, 4);
        System.out.println(n1 + " " + n2 + " "+ n3 + " " + n4+" "+n5);
    }
}

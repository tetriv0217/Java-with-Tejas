package RecordClass_28.Implementation_1;



// If it would have beem a normal class you would have to define every method but now you dont have to do that

record Alien(int id,String name){
    Alien{
        if(id == 0){
            throw new IllegalArgumentException("Id can't  be 0");
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        Alien a1 = new Alien(1,"Tejas");
        Alien a2 = new Alien(1,"Tejas");
        // Alien a3 = new Alien(0,"Tejas");
        System.out.println(a1.equals(a2));
        System.out.println(a1);
        // System.out.println(a3);will give error

        System.out.println(a1.id());// there is no getter or setter, you can variable name
    }
}

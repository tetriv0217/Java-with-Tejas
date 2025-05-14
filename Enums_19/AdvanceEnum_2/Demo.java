package Enums_19.AdvanceEnum_2;

enum Laptop{
    Macbook(2000),XPS(3000),Surface,Thinkpad(1800);
    private int price;
    Laptop(){
        price = 500;
    }
    Laptop(int price){
        this.price = price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}


public class Demo {

    public static void main(String[] args) {
        Laptop[] allLaptop = Laptop.values();
        
        for(Laptop s : allLaptop){
            System.out.println(s + " : "+s.getPrice());
        }
    }
}
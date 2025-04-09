package Oops_main;
class Calculator{
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    //Method overloading
}
class Computer{
    public void playMusic(){
        System.out.println("Music Playing");
    }
    public String getMePen(int cost){
        return "pen";
    }
}
public class Demo1 {
    public static void main(String[] args) {
        //Calculator calc;//This is just a reference not an object
        // Calculator calc = new Calculator();
        // int res = calc.add(1,2);
        // System.out.println(res);

        Computer obj = new Computer();
        obj.playMusic();
        String s = obj.getMePen(12);
        System.out.println(s);


    }
}
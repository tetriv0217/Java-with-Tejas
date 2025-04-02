class Calculator{
    public int add(int num1,int num2){
        return num1+num2;
    }
}
public class Demo1 {
    public static void main(String[] args) {
        //Calculator calc;//This is just a reference not an object
        Calculator calc = new Calculator();
        int res = calc.add(1,2);
        System.out.println(res);

    }
}
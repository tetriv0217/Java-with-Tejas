package Exception_21.Throws_2;

class TejasException extends Exception{
    public TejasException(String  string){
        super(string);
    }
}
public class Demo {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        
        
        try {
            j = 18/i;
            if(j == 0){
                // throw new ArithmeticException("By tejas");
                throw new TejasException("By tejas");
            }
        }
        // catch (ArithmeticException e){
        //     j = 18;
        //     System.out.println("Don't want the output to be 0 :- " + e);
        // }
        catch (TejasException e){
            j = 18;
            System.out.println("Don't want the output to be 0 :- " + e);
        }
        
        catch(Exception e){
            System.out.println("Other exception :- " + e);
    
        }
        System.out.println(j);
        
    }
}
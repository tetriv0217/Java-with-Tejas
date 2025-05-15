package Exception_20.Basic_1;

public class Demo {

    public static void main(String[] args) {
        
        int i = 1;
        int j = 0;
        int array[] = new int[5];
        String str = null ;
        
        try {
            j = 18/i;
            array[4] = 10;
            System.out.println(str.length());
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero error");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array limit should be less than " + array.length);
        }
        catch(Exception e){
            System.out.println("Other exception :- " + e);
    
        }
        System.out.println(j);
        System.out.println(array[4]);
        System.err.println(str);
    }
    // Maintain the Hierarchy, Exception class is the superclass of other Exception Classes so make sure other exceptions are above them.

    //  Whenever there is an error in the try section, it just go to the required catch block and the lines remaining after that error are not executed
    
    
    
}
package Threads_23.ThreadsUsingRunnable_2;


// Why using Runnable 
// What if you class A wants to extend a parent class.
// You have to use interfaces in order to use class A as a subclass

// Threads(subclass) extends Runnable(superclass which has a function)




// class A implements Runnable{
//     public void run(){
//         for(int i = 0;i<6;i++){
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 System.out.println("Sleep Error:- "+e);
//             }
//         }
//     }
    
// }
// class B implements Runnable{
//     public void run(){
//         for(int i = 0;i<6;i++){
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 System.out.println("Sleep Error:- "+e);
//             }
//         }
//     }
    
// }
public class Demo {
    
    public static void main(String[] args) {
        // Runnable obj1 = new A();
        Runnable obj1 = () -> 
        { 
            for(int i = 0;i<6;i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println("Sleep Error:- "+e);
                }
            }
        };
        // Runnable obj2 = new B();
        Runnable obj2 = () -> 
        { 
            for(int i = 0;i<6;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println("Sleep Error:- "+e);
                }
            }
        };
        
        // However Runnable doesn't have a start function
        // So you would have to create a Thread object

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try {
                Thread.sleep(5);
            } catch (Exception e) {
                System.out.println("Sleep Error:- "+e);
            }
        t2.start();
    }
}
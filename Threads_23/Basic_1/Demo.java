package Threads_23.Basic_1;
// Now A is a thread, however it should have a run fucntion
class A extends Thread{
    public void run(){
        for(int i = 0;i<6;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("Sleep Error:- "+e);
            }
        }
    }
    
}
class B extends Thread{
    public void run(){
        for(int i = 0;i<6;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("Sleep Error:- "+e);
            }
        }
    }
    
}
public class Demo {

    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        
        
        // obj2.setPriority(Thread.MAX_PRIORITY); // This helps you to set the priority
        // System.out.println(obj2.getPriority());// Get getPriority gives a value between 1 - 10 where 10 is the highest
        
        obj1.start();
        try {
                Thread.sleep(5);
            } catch (Exception e) {
                System.out.println("Sleep Error:- "+e);
            }
        obj2.start();


        // the start function will look for run option in the thread

    }
}
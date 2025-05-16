package Threads_23.RaceCondition_3;

class Counter{
    public int count;
    public synchronized void increment(){//Explanation for synchronized given below
        count++;
    }
}
public class Demo {
    
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () -> 
        { 
            for(int i = 0;i<1000;i++){
                c.increment();
            }
        };
        
        Runnable obj2 = () -> 
        { 
            for(int i = 0;i<1000;i++){
                c.increment();
            }
        };
    
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        t1.join();// This will wait for the other thread to die
        t2.join();
        System.out.println(c.count);// But the correct value will be printed when you add sychronized in the function as it will make sure  that the function is ran by only one thread at a time
    }
}
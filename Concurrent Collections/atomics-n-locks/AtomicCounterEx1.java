import java.util.concurrent.atomic.*;
class Counter implements Runnable{   
    private final AtomicInteger counter = new AtomicInteger(0);
    
    public int getValue() {
        return counter.get();
    }
 
	public void run(){   
		counter.incrementAndGet();
	}   
}   
public class AtomicCounterEx1{   
	public static void main(String args[]) throws InterruptedException{   
		//creating an instance of the Counter class   
		Counter c = new Counter();   

		//creating four threads  
		Thread t1 = new Thread(c, "First");   
		Thread t2 = new Thread(c, "Second");   
		Thread t3 = new Thread(c, "Third");   
		Thread t4 = new Thread(c, "Fourth");   
	
		//by calling the start() method, we have started the thread  
		t1.start();   
		t2.start();   
		t3.start();   
		t4.start();   

		//main thread will wait for all the four threads until the 			//execution of all threads do not complete  
		t1.join();   
		t2.join();  
		t3.join();   
		t4.join();   
		
		//prints the final value of count variable  
		System.out.println(c.getValue());  
	}   
}
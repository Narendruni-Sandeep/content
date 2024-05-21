import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


// A task for printing a character a specified number of times.
class ThreadA implements Runnable{
  private char charToPrint; // Declaration of instance variable to print character.
  public ThreadA(char c){
  		charToPrint = c;	 
  }
  @Override
  public void run(){
 		for(int i = 1; i <= 3; i++){
 			System.out.println(charToPrint); 
 		}
  }
}

// A task for printing number from 1 to n for a given value of n.
class ThreadB implements Runnable{
	private int n;
 	public ThreadB(int n){
  		this.n = n;	 
 	}

	@Override 
	public void run(){ 
		for(int i = 1; i <= n; i++){
 			System.out.println(i);	
   		}
 	}
}


public class ExecutorDemo1{
	public static void main(String[] args){

		// Creating a fixed thread pool with maximum of three threads.	
 		ExecutorService executor = Executors.newFixedThreadPool(1);
 
		ThreadA t1 = new ThreadA('a'); 
		ThreadA t2 = new ThreadA('b');
		ThreadB t3 = new ThreadB(5);
 
		// Submit tasks to thread pool.
   		executor.execute(t1);
   		executor.execute(t2);
   		executor.execute(t3);
 
		// Shut down the executor. 
   		executor.shutdown();
   }
}
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// A task for performing the addition of two numbers.
class Addition implements Runnable{
 	int a;
 	int b;
 	public Addition(int a, int b){
  		this.a = a;
  		this.b = b;
	}
	@Override
	public void run(){
  		int sum = a + b;
  		System.out.println("Sum: " +sum);
 	}
}

// A task for performing subtraction of two numbers.
class Subtraction implements Runnable{
 	int x;
 	int y;
	public Subtraction(int x, int y){
  		this.x = x;
  		this.y = y;
 	}

	@Override
	public void run(){
 		int sub = x - y;
		System.out.println("Sub: " +sub);
 	}
}

// A task for performing multiplication of two numbers.
class Square implements Runnable{
	int p;

	public Square(int p){
	  this.p = p;
 	}

	@Override
	public void run(){
 		int multiply = p * p;
 		System.out.println("Multiply: " +multiply);
  	}
}

public class ThreadPoolDemo1{
	public static void main(String[] args){

	// Creating a fixed thread pool with maximum one thread.	
	ExecutorService executor = Executors.newFixedThreadPool(1);

	// Submit tasks to the thread pool.
  	executor.execute(new Addition(25, 100)); 
  	executor.execute(new Subtraction(10, 5));
  	executor.execute(new Square(5));
  
	// Shut down the executor.    
	executor.shutdown();
 }
}
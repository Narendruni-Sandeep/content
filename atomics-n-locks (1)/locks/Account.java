import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Account{

	//data members
	private int ano;
	private String title;
	private double balance;
	private Lock lock;

	//constructor
	public Account(int a,String t,double b){
		ano=a;
		title=t;
		balance=b;
	   this.lock = new ReentrantLock();
	}

	public int getAno(){
		return ano;
	}

	
	public double getBalance(){
		return balance;
	}


	public String  getTitle(){
		return title;
	}


	public void setTitle(String t){
		title=t;
	}

	//Simulating thread switching
	public void deposit(double amt){
		double b;
        try{

			if(lock.tryLock(1, TimeUnit.SECONDS)){
				b=balance+amt;
				Thread.sleep(100);
				balance=b; 
			}

    		} catch (InterruptedException e) {
				e.printStackTrace();
			}finally{
				//release lock
				lock.unlock();
			}
		System.out.println("Balance after deposit is "+ balance);
	}

	//Simulating thread switching
	public void withdraw(double amt){
		if ((balance-amt)>0){
			double b;
           try{
				b=balance-amt;
				Thread.sleep(100);
				balance=b;
				System.out.println("Balance after withdrawl is "+balance);
			}catch(InterruptedException iex){
				iex.printStackTrace();
			}
		}else{
			System.out.println("Insufficient funds");
		}
	}
}
	

	
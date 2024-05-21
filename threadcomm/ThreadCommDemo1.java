class Account{  
    double balance=10000;     
    public synchronized void withdraw(int amount){  
   		System.out.println("Going to withdraw...");    
		if(balance<amount){  
			System.out.println("No Funds; waiting for the deposit...");  
	       try{
				wait();
	       }catch(Exception e){
	       }  
       }  
       balance-=amount;  
       System.out.println("withdraw completed...");  
     }  
    public synchronized void deposit(int amount){  
		System.out.println("Going to deposit...");  
		balance+=amount;  
		System.out.println("deposit completed... "); 
		
		notify();  
    }  
}  
class ThreadCommDemo1{  
    public static void main(String args[]){  
		final Account act=new Account();
		Thread t1=new Thread(){  
	      public void run(){
		 		act.withdraw(150000);
	      }  
		};
		Thread t2=new Thread(){  
	      public void run(){
				act.deposit(10000);
	      }  
		};
		t1.start();  
		t2.start();  
		
    }
}

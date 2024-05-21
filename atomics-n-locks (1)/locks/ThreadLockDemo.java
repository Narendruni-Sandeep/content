public class ThreadLockDemo{
    public static void main(String[] args){
		Account a=new Account(101,"NK",10000);

	try{

		CustomerThread[] c=new CustomerThread[5];

		//create customer objects as threads
		//by passing same account object to all for thread sync
		for(int i=0;i<5;i++){
			c[i]=new CustomerThread(a);
			c[i].start();
		}

		//Call join methods on child threads to make sure they all complete
		//before control passes to main
		for(int k=0;k<5;k++){
			c[k].join();
 		}

		System.out.println("Final Balance is "+a.getBalance());

	  }catch(Exception ex){
			System.out.println(ex.getMessage());
	  }	
     }
}
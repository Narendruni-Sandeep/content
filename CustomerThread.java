public class CustomerThread extends Thread{
     private Account accountInfo;
     public CustomerThread(Account a){
			accountInfo=a;
     }
     public void run(){
			accountInfo.deposit(10000);
     }
}
//Example with bounded Parameter
//This takes any class that extends Account class
class TransactionProcessing<T extends Account>{
   T act=null;
   public TransactionProcessing(T a){
	act=a;
   }
   //method to invoke transaction related methods
   public void process(){
	act.deposit(10000);
	act.withdraw(59500);
   }
   public static void main(String[] args){
	//
	SavingsAccount sa=new SavingsAccount(101,"NK",50000,true);
	CurrentAccount ca=new CurrentAccount(102,"NS",20000,500000);
	TransactionProcessing<SavingsAccount> tp1=new TransactionProcessing<>(sa);
	TransactionProcessing<CurrentAccount> tp2=new TransactionProcessing<>(ca);
	tp1.process();
	tp2.process();
   }
}
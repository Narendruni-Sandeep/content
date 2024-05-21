//Example with bounded wild cards
import java.util.*;
class TransactionWithWildCards{

   public static void processAccounts(List<? extends Account> aList){
		//run through collection
		for(Account a:aList){
	   	 	a.withdraw(20000);
	   	 	System.out.println(a.getBalance());
		}
   }

   public static void main(String[] args){
		//creating Account Objects
		Account a=new Account(101,"NX",10000);
		SavingsAccount sa=new SavingsAccount(101,"NK",50000,true);
		CurrentAccount ca=new CurrentAccount(102,"NS",20000,500000);

		//List of Accounts
		List<? extends Account> actList=new ArrayList<>();
		actList.add(a);
		actList.add(sa);
		actList.add(ca);
	
		//invoke
		processAccounts(actList);
   
	}
}